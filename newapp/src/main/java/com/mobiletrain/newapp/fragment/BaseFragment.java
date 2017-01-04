package com.mobiletrain.newapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by idea on 2016/10/14.
 */
public abstract class BaseFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(view == null){
            view = inflater.inflate(getLayoutResId(),container,false);
            ButterKnife.bind(this, view);

            onViewBinded();
        }

        return view;
    }

    protected abstract void onViewBinded();

    protected abstract int getLayoutResId();

}
