package com.example.heather.codeclanolympics;

import java.util.ArrayList;

/**
 * Created by heather on 15/09/2017.
 */

public class Competitor {
    private String country;
    private SportType sport;
    private ArrayList<MedalType> medals;
    private int score;

    public Competitor(String country, SportType sport) {
        this.country = country;
        this.sport = sport;
        this.medals= new ArrayList<>();
        this.score = 0;
    }

    public String getCountry() {
        return country;
    }

    public SportType getSport() {
        return sport;
    }

    public ArrayList<MedalType> getMedals() {
        return medals;
    }

    public int getScore() {
        return score;
    }

    public void receiveMedal(MedalType medal) {
        medals.add(medal);
    }
}
