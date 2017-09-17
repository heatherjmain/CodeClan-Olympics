package com.example.heather.codeclanolympics.AllEvents;

import com.example.heather.codeclanolympics.AllCompetitors.Competitor;

import java.util.ArrayList;

/**
 * Created by heather on 15/09/2017.
 */

public interface Events {

    void addCompetitor(Competitor competitor);

    ArrayList<Competitor> sortComeptitorsByScore();

    void awardMedals();
}
