package com.swach.wecareapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.swach.wecareapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment implements View.OnClickListener {
    Button bRegister;
    EditText etHospital;
    public View mRootView;


    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView= inflater.inflate(R.layout.fragment_register, container, false);
        bRegister=(Button)mRootView.findViewById(R.id.bRegister);
        etHospital=(EditText)mRootView.findViewById(R.id.etHospital);

        bRegister.setOnClickListener(this);

        return mRootView;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bRegister:
                break;
        }
    }
}
