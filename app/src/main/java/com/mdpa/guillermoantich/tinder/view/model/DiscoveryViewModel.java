package com.mdpa.guillermoantich.tinder.view.model;


import android.arch.lifecycle.ViewModel;

import com.mdpa.guillermoantich.tinder.manager.DiscoveryManager;
import com.mdpa.guillermoantich.tinder.utils.CommonUtils;

/**
 * Created by Guillermo on 20/02/2018.
 */

public class DiscoveryViewModel extends ViewModel {

    private DiscoveryManager discoveryManager = new DiscoveryManager();

    public boolean isEmailValid(String email) {
        if (!CommonUtils.isEmailValid(email)) {
            return false;
        }
        return true;
    }

    public boolean isPasswordValid(String password) {
        //Later implementation of password must meet characteristics
        return true;
    }
}
