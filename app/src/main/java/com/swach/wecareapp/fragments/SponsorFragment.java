package com.swach.wecareapp.fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swach.wecareapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SponsorFragment extends Fragment {


    public SponsorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sponsor, container, false);
    }


}
