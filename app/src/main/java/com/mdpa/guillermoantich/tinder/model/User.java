package com.mdpa.guillermoantich.tinder.model;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * Created by master on 12/2/18.
 */

public class User {

    @IntDef({
            MALE,
            FEMALE,
            NOTDEFINED
    })

    @Retention(RetentionPolicy.SOURCE)
    public @interface Gender {}

    public final static int MALE = 0;
    public final static int FEMALE = 1;
    public final static int NOTDEFINED = 2;

    private String id;
    private String name;
    private String lastname;
    private int age;
    private @Gender int gender;
    private String[] images;
    private String description;
    private String job;
    private String studies;
    private String song;
    private @Gender int preference;
    private double latitude;
    private double longitude;
    private int distance_min;
    private int distance_max;
    private int range_min;
    private int range_max;
    private boolean visibility;


    public User(String id, String name, String lastname, int age, @Gender int gender, String[] images, String description, String job, String studies, String song, @Gender int preference, double latitude, double longitude, int distance_min, int distance_max, int range_min, int range_max, boolean visibility) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.images = images;
        this.description = description;
        this.job = job;
        this.studies = studies;
        this.song = song;
        this.preference = preference;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance_min = distance_min;
        this.distance_max = distance_max;
        this.range_min = range_min;
        this.range_max = range_max;
        this.visibility = visibility;
    }

    public User() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public @Gender int getGender() {
        return gender;
    }

    public void setGender(@Gender int gender) {
        this.gender = gender;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public @Gender int getPreference() {
        return preference;
    }

    public void setPreference(@Gender int preference) {
        this.preference = preference;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getDistance_min() {
        return distance_min;
    }

    public void setDistance_min(int distance_min) {
        this.distance_min = distance_min;
    }

    public int getDistance_max() {
        return distance_max;
    }

    public void setDistance_max(int distance_max) {
        this.distance_max = distance_max;
    }

    public int getRange_min() {
        return range_min;
    }

    public void setRange_min(int range_min) {
        this.range_min = range_min;
    }

    public int getRange_max() {
        return range_max;
    }

    public void setRange_max(int range_max) {
        this.range_max = range_max;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }
}
