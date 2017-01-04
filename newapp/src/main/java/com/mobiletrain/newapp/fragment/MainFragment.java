package com.mobiletrain.newapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.mobiletrain.newapp.R;
import com.mobiletrain.newapp.adapter.MyFragmentAdapter;
import com.mobiletrain.newapp.fragment.main.FindFragment;
import com.mobiletrain.newapp.fragment.main.MineFragment;
import com.mobiletrain.newapp.fragment.main.OnlineFragment;
import com.mobiletrain.newapp.myinterface.SongPlayer;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnPageChange;

/**
 * Created by idea on 2016/10/9.
 */
public class MainFragment extends Fragment {

    private static final String TAG = "test";
    @Bind(R.id.tvMenu)
    TextView tvMenu;
    @Bind(R.id.tvSearch)
    TextView tvSearch;
    @Bind(R.id.rgTabs)
    RadioGroup rgTabs;
    @Bind(R.id.vpFragments)
    ViewPager vpFragments;
    @Bind(R.id.rbMine)
    RadioButton rbMine;
    @Bind(R.id.rbOnline)
    RadioButton rbOnline;
    @Bind(R.id.rbFind)
    RadioButton rbFind;
    @Bind(R.id.vMask)
    View vMask;
    private View view;
    private MyFragmentAdapter vpAdapter;

    private List<Fragment> fragments = new ArrayList<>();
    private MineFragment mineFragment;
    private OnlineFragment onlineFragment;
    private FindFragment findFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_main, container, false);
            ButterKnife.bind(this, view);

            mineFragment = new MineFragment();
            mineFragment.setSongPlayer((SongPlayer) getActivity());
            onlineFragment = new OnlineFragment();
            onlineFragment.setSongPlayer((SongPlayer) getActivity());
            findFragment = new FindFragment();
            fragments.add(mineFragment);
            fragments.add(onlineFragment);
            fragments.add(findFragment);

            vpAdapter = new MyFragmentAdapter(getChildFragmentManager(), fragments);
            vpFragments.setAdapter(vpAdapter);
            rgTabs.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {
                        case R.id.rbMine:
                            vpFragments.setCurrentItem(0);
                            break;
                        case R.id.rbOnline:
                            vpFragments.setCurrentItem(1);
                            break;
                        case R.id.rbFind:
                            vpFragments.setCurrentItem(2);
                            break;
                    }
                }
            });

        }

        return view;
    }

    public void showMask(boolean showMask){
        if(showMask){
            vMask.setVisibility(View.VISIBLE);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
            alphaAnimation.setDuration(500);
            vMask.startAnimation(alphaAnimation);

        }else {
            vMask.setVisibility(View.VISIBLE);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
            alphaAnimation.setDuration(500);
            vMask.startAnimation(alphaAnimation);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    vMask.setVisibility(View.GONE);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });
        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnPageChange(R.id.vpFragments)
    public void onVpPageSelected(int position) {
//        Log.e(TAG, "onVpPageSelected: " + position);
        for (int i = 0; i < rgTabs.getChildCount(); i++) {
            RadioButton radioButton = (RadioButton) rgTabs.getChildAt(i);
            if (i == position) {
                radioButton.setChecked(true);
                radioButton.setTextAppearance(getContext(), R.style.MainTab_Checked);
            } else {
                radioButton.setChecked(false);
                radioButton.setTextAppearance(getContext(), R.style.MainTab);
            }
        }
    }

    @OnClick(R.id.tvMenu)
    public void onTvMenuClick(View v) {
        if (listener != null) {
            listener.onTvMenuClick();
        }
    }

    @OnClick(R.id.tvSearch)
    public void onTvSearchClick(View v) {
        if (listener != null) {
            listener.onTvSearchClick();
        }
    }

    OnMainFragmentViewClickListener listener;

    public void setListener(OnMainFragmentViewClickListener listener) {
        this.listener = listener;
    }

    public interface OnMainFragmentViewClickListener {
        void onTvMenuClick();

        void onTvSearchClick();
    }

}
