package com.mdpa.guillermoantich.tinder.view.model;

import android.arch.lifecycle.ViewModel;

/**
 * Created by Guillermo on 05/03/2018.
 */

public class SettingsViewModel extends ViewModel {

    public boolean setPreferences (){
        if(discoveryManager.setPreferences())return true;
        return false;

    }
}
