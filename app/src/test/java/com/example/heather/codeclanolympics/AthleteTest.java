package com.example.heather.codeclanolympics;

import com.example.heather.codeclanolympics.AllCompetitors.Athlete;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by heather on 15/09/2017.
 */

public class AthleteTest {
    Athlete athlete;

    @Test
    public void canGetCountry() {
        athlete = new Athlete("Scotland");
        assertEquals( "Scotland", athlete.getCountry() );
    }

//    @Test
//    public void canGetSport() {
//        athlete = new Athlete("Scotland", SportType.RUNNING);
//        assertEquals( SportType.RUNNING, athlete.getSport() );
//    }

    @Test
    public void startsWithNoMedals() {
        athlete = new Athlete("Scotland");
        assertEquals( 0, athlete.getGoldMedals() );
        assertEquals( 0, athlete.getSilverMedals() );
        assertEquals( 0, athlete.getBronzeMedals() );
    }

    @Test
    public void scoreStartsAtZero() {
        athlete = new Athlete("Scotland");
        assertEquals( 0, athlete.getScore() );
    }

    @Test
    public void canIncreaseScore() {
//        arrange
        athlete = new Athlete("Scotland");
//        act
        athlete.increaseScore(10);
//        assert
        assertEquals( 10, athlete.getScore() );
    }

    @Test
    public void canRecieveMedal() {
//        arrange
        athlete = new Athlete("Scotland");
//        act
        athlete.receiveMedal(MedalType.BRONZE);
//        assert
        assertEquals( 0, athlete.getGoldMedals() );
        assertEquals( 0, athlete.getSilverMedals() );
        assertEquals( 1, athlete.getBronzeMedals() );
    }
}
