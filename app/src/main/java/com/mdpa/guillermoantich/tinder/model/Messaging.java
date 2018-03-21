package com.mdpa.guillermoantich.tinder.model;

/**
 * Created by Guillermo on 20/03/2018.
 */

public class Messaging {

    private String sender;


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Messaging(String sender) {

        this.sender = sender;
    }
}
