package com.mobiletrain.newapp.fragment;

import android.widget.TextView;

import com.mobiletrain.newapp.R;

import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by idea on 2016/10/9.
 */
public class MoreFragment extends BaseFragment {


    @Bind(R.id.tvBack)
    TextView tvBack;
    @Bind(R.id.tv)
    TextView tv;

    @Override
    protected void onViewBinded() {
        tv.setText(new Date().toGMTString());
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_more;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.tvBack)
    public void onTvBackClick() {
        if (listener != null) {
            listener.onMoreFragmentTvBackClick();
        }
    }

    OnMoreFragmentViewClickListener listener;

    public void setListener(OnMoreFragmentViewClickListener listener) {
        this.listener = listener;
    }

    public interface OnMoreFragmentViewClickListener {
        void onMoreFragmentTvBackClick();
    }

}
