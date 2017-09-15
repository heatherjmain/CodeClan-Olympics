package com.example.heather.codeclanolympics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by heather on 15/09/2017.
 */

public class AthleteTest {
    Athlete athlete;

    @Test
    public void canGetCountry() {
        athlete = new Athlete("Scotland", SportType.RUNNING);
        assertEquals( "Scotland", athlete.getCountry() );
    }

    @Test
    public void canGetSport() {
        athlete = new Athlete("Scotland", SportType.RUNNING);
        assertEquals( SportType.RUNNING, athlete.getSport() );
    }

    @Test
    public void startsWithNoMedals() {
        athlete = new Athlete("Scotland", SportType.RUNNING);
        assertEquals( 0, athlete.getMedals().size() );
    }

    @Test
    public void scoreStartsAtZero() {
        athlete = new Athlete("Scotland", SportType.RUNNING);
        assertEquals( 0, athlete.getScore() );
    }

    @Test
    public void canRecieveMedal() {
//        arrange
        athlete = new Athlete("Scotland", SportType.RUNNING);
//        act
        athlete.receiveMedal(MedalType.BRONZE);
//        assert
        assertEquals( 1, athlete.getMedals().size() );
        assertEquals( MedalType.BRONZE, athlete.getMedals().get(0) );

    }
}
