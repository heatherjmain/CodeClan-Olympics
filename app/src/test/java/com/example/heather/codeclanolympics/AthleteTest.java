package com.example.heather.codeclanolympics;

import com.example.heather.codeclanolympics.AllCompetitors.Athlete;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by heather on 15/09/2017.
 */

public class AthleteTest {
    Athlete athlete;

    @Before
    public void before() {
        athlete = new Athlete("Scotland");
    }

    @Test
    public void canGetCountry() {
//        assert
        assertEquals( "Scotland", athlete.getCountry() );
    }

//    @Test
//    public void canGetSport() {
////        assert
//        assertEquals( SportType.RUNNING, athlete.getSport() );
//    }

    @Test
    public void startsWithNoMedals() {
//        assert
        assertEquals( 0, athlete.getGoldMedals() );
        assertEquals( 0, athlete.getSilverMedals() );
        assertEquals( 0, athlete.getBronzeMedals() );
    }

    @Test
    public void scoreStartsAtZero() {
//        assert
        assertEquals( 0, athlete.getScore() );
    }

    @Test
    public void canIncreaseScore() {
//        act
        athlete.increaseScore(10);
//        assert
        assertEquals( 10, athlete.getScore() );
    }

    @Test
    public void canRecieveMedal() {
//        act
        athlete.receiveMedal(MedalType.BRONZE);
//        assert
        assertEquals( 0, athlete.getGoldMedals() );
        assertEquals( 0, athlete.getSilverMedals() );
        assertEquals( 1, athlete.getBronzeMedals() );
    }
}
