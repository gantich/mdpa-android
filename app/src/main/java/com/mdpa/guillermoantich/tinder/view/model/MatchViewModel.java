package com.mdpa.guillermoantich.tinder.view.model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.res.Resources;

import com.mdpa.guillermoantich.tinder.manager.MatchManager;
import com.mdpa.guillermoantich.tinder.model.Match;

import java.util.List;

/**
 * Created by Guillermo on 05/03/2018.
 */

public class MatchViewModel extends ViewModel {

    private MatchManager matchManager = new MatchManager();

    private MutableLiveData<List<Match>> matchList;

    public void setResources(Resources resources)
    {
        matchManager.setResources(resources);
    }

    public LiveData<List<Match>> getMatchSenderList() {
        if(matchList == null) {
            matchList = new MutableLiveData<>();
            populateMatchList();
        }

        return matchList;
    }

    private void populateMatchList() {
        List<Match> senderList = matchManager.getMovieList();
        matchList.setValue(senderList);
    }

}
