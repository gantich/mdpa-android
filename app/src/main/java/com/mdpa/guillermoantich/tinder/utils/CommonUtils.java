package com.mdpa.guillermoantich.tinder.utils;

import android.util.Patterns;

/**
 * Created by Guillermo on 20/02/2018.
 */

public final class CommonUtils {

    private CommonUtils() {
    }

    public static boolean isEmailValid(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

}
