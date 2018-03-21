package com.mdpa.guillermoantich.tinder.model;

/**
 * Created by Guillermo on 06/03/2018.
 */

public class Match {

    private String sender;
    private String image_url;
    private String last_message;
    private String last_message_date;

    public Match(String sender, String image_url, String last_message, String last_message_date) {

        this.sender = sender;
        this.image_url = image_url;
        this.last_message = last_message;
        this.last_message_date = last_message_date;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getLast_message() {
        return last_message;
    }

    public void setLast_message(String last_message) {
        this.last_message = last_message;
    }

    public String getLast_message_date() {
        return last_message_date;
    }

    public void setLast_message_date(String last_message_date) {
        this.last_message_date = last_message_date;
    }


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }


}
