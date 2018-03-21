package com.mdpa.guillermoantich.tinder.view;

import android.os.Bundle;
import android.view.View;

import com.mdpa.guillermoantich.tinder.R;


import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


import com.mdpa.guillermoantich.tinder.view.model.MatchViewModel;

public class MessageActivity extends AppCompatActivity {

    private MatchViewModel matchViewModel;

    public static final String EXTRA_MATCH_ID = "match_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        matchViewModel = ViewModelProviders.of(this).get(MatchViewModel.class);

        final String sender = (String)getIntent().getSerializableExtra(EXTRA_MATCH_ID);

        setTitle(sender);
    }
}

