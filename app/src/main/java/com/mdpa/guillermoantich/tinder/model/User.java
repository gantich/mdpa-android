package com.mdpa.guillermoantich.tinder.model;

/**
 * Created by master on 12/2/18.
 */

public class User {

    public String id;
    public String name;
    public String lastname;
    public int age;
    public enum gender {
        MALE,
        FEMALE,
        UNDEFINED;
    }
    public String[] images;
    public String description;
    public String job;
    public String studies;
    public String song;
    public enum preference {
        MALE,
        FEMALE,
        UNDEFINED;
    }
    public double latitude;
    public double longitude;
    public int distance_min;
    public int distance_max;
    public int range_min;
    public int range_max;
    public boolean visibility;


    public User(String id, String name, String lastname, int age, String[] images, String description, String job, String studies, String song, double latitude, double longitude, int distance_min, int distance_max, int range_min, int range_max, boolean visibility) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.images = images;
        this.description = description;
        this.job = job;
        this.studies = studies;
        this.song = song;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance_min = distance_min;
        this.distance_max = distance_max;
        this.range_min = range_min;
        this.range_max = range_max;
        this.visibility = visibility;
    }

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
