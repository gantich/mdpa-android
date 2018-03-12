package com.mdpa.guillermoantich.tinder.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mdpa.guillermoantich.tinder.R;


public class MessageFragment extends Fragment {

    public static MessageFragment newInstance() {
        MessageFragment fragment = new MessageFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.messaging_fragment, container, false);

        return view;
    }
}
