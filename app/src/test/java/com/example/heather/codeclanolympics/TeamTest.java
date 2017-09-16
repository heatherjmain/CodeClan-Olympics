package com.example.heather.codeclanolympics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by heather on 15/09/2017.
 */
public class TeamTest {
    Team team;

    @Test
    public void canGetCountry() {
        team = new Team("Norway");
        assertEquals( "Norway", team.getCountry() );
    }

//    @Test
//    public void canGetSport() {
//        team = new Team("Norway", SportType.ROWING);
//        assertEquals( SportType.ROWING, team.getSport() );
//    }

    @Test
    public void startsWithNoMedals() {
        team = new Team("Norway");
        assertEquals( 0, team.getGoldMedals() );
        assertEquals( 0, team.getSilverMedals() );
        assertEquals( 0, team.getBronzeMedals() );
    }

    @Test
    public void scoreStartsAtZero() {
        team = new Team("Norway");
        assertEquals( 0, team.getScore() );
    }

    @Test
    public void canIncreaseScore() {
//        arrange
        team = new Team("Norway");
//        act
        team.increaseScore(100);
//        assert
        assertEquals( 100, team.getScore() );
    }

    @Test
    public void canRecieveMedal() {
//        arrange
        team = new Team("Norway");
//        act
        team.receiveMedal(MedalType.GOLD);
        team.receiveMedal(MedalType.SILVER);
        team.receiveMedal(MedalType.SILVER);
//        assert
        assertEquals( 1, team.getGoldMedals() );
        assertEquals( 2, team.getSilverMedals() );
        assertEquals( 0, team.getBronzeMedals() );
    }
}