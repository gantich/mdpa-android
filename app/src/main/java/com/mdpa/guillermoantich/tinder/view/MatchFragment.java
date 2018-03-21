package com.mdpa.guillermoantich.tinder.view;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mdpa.guillermoantich.tinder.R;
import com.mdpa.guillermoantich.tinder.model.Match;
import com.mdpa.guillermoantich.tinder.view.adapter.MatchListAdapter;
import com.mdpa.guillermoantich.tinder.view.model.MatchViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by master on 12/2/18.
 */

public class MatchFragment extends Fragment {

    private MatchViewModel matchViewModel;

    public static MatchFragment newInstance() {
        MatchFragment fragment = new MatchFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        matchViewModel = ViewModelProviders.of(this).get(MatchViewModel.class);
        matchViewModel.setResources(getResources());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.match_fragment, container, false);

        setupRecyclerView(view);

        return view;
    }

    private void setupRecyclerView(View view) {
        RecyclerView matchRecyclerView = (RecyclerView) view.findViewById(R.id.reyclerview_messaging_list);
        final MatchListAdapter matchListAdapter = new MatchListAdapter(getContext(), new ArrayList<Match>());
        matchRecyclerView.setAdapter(matchListAdapter);
        matchRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        matchViewModel.getMatchSenderList().observe(this, new Observer<List<Match>>() {
            @Override
            public void onChanged(@Nullable List<Match> matches) {
                matchListAdapter.setValues(matches);
                matchListAdapter.notifyDataSetChanged();
            }
        });
    }
}
