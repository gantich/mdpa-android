package com.mdpa.guillermoantich.tinder.view.model;

import android.arch.lifecycle.ViewModel;

import com.mdpa.guillermoantich.tinder.manager.SettingsManager;

/**
 * Created by Guillermo on 05/03/2018.
 */

public class SettingsViewModel extends ViewModel {

    SettingsManager settingsManager = new SettingsManager();

    public boolean setPreferences (){
        if(settingsManager.setPreferences())return true;
        return false;

    }
}
