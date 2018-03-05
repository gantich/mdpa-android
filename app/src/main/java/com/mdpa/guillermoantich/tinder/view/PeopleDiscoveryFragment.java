package com.mdpa.guillermoantich.tinder.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mdpa.guillermoantich.tinder.R;

/**
 * Created by master on 12/2/18.
 */

public class PeopleDiscoveryFragment extends Fragment {

    public static PeopleDiscoveryFragment newInstance() {
        PeopleDiscoveryFragment fragment = new PeopleDiscoveryFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.peoplediscovery_fragment, container, false);

        return view;
    }
}
