package com.swach.wecareapp.fragments;



import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.swach.wecareapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdminFragment extends Fragment implements View.OnClickListener {

    EditText etUsername,etPassword;
    Button bLogin;
    public View  mRootView;


    public AdminFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_admin, container, false);
        etUsername=(EditText)mRootView.findViewById(R.id.etUsername);
        etPassword=(EditText)mRootView.findViewById(R.id.etPassword);
        bLogin=(Button)mRootView.findViewById(R.id.bLogin);

        bLogin.setOnClickListener(this);
        return mRootView;

    }


    @Override
    public void onClick(View v) {
        Fragment fragment=null;
        switch (v.getId()){
            case R.id.bLogin:
                fragment = new RegisterFragment();
                replaceFragment(fragment);
                break;


        }
    }

    private void replaceFragment(Fragment AdminFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.tab,AdminFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
