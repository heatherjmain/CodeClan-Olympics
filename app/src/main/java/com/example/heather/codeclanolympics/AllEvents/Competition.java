package com.example.heather.codeclanolympics.AllEvents;

import com.example.heather.codeclanolympics.AllCompetitors.Competitor;
import com.example.heather.codeclanolympics.MedalType;
import com.example.heather.codeclanolympics.SportType;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by heather on 15/09/2017.
 */

public class Competition implements Events {
    private SportType sport;
    private ArrayList<Competitor> competitors;
    private int maxNumberOfCompetitors;

    public Competition(SportType sport, int maxNumberOfCompetitors) {
        this.sport = sport;
        this.competitors = new ArrayList<>();
        this.maxNumberOfCompetitors = maxNumberOfCompetitors;
    }

    public SportType getSport() {
        return sport;
    }

    public ArrayList<Competitor> getCompetitors() {
        return competitors;
    }

    public int getMaxNumberOfCompetitors() {
        return maxNumberOfCompetitors;
    }

    public void addCompetitor(Competitor competitor) {
        if(competitors.size() < maxNumberOfCompetitors) {
            competitors.add(competitor);
        }
    }


    public ArrayList<Competitor> sortComeptitorsByScore() {
        Collections.sort(competitors);
        return competitors;
    }


    public void awardMedals() {
        competitors.get(0).receiveMedal( MedalType.GOLD );
        competitors.get(1).receiveMedal( MedalType.SILVER );
        competitors.get(2).receiveMedal( MedalType.BRONZE );
   }
}
