package com.example.heather.codeclanolympics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by heather on 15/09/2017.
 */

public class Competition implements Events {
    private SportType sport;
    private ArrayList<Competitor> competitors;

    public Competition(SportType sport) {
        this.sport = sport;
        this.competitors = new ArrayList<>();
    }

    public SportType getSport() {
        return sport;
    }

    public ArrayList<Competitor> getCompetitors() {
        return competitors;
    }

    public void addCompetitor(Competitor competitor) {
        competitors.add(competitor);
    }


    public ArrayList<Competitor> sortComeptitorsByScore() {
        Collections.sort(competitors);
        return competitors;
    }


    public void awardMedal() {
        
    }
}
