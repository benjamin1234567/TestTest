package com.example.bweak.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bweak on 13/08/2017.
 */

public class FirstFragment extends android.app.Fragment{

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView =inflater.inflate(R.layout.first_layout, container, false);
        return myView;
    }
}

