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
        team = new Team("Norway", SportType.ROWING);
        assertEquals( "Norway", team.getCountry() );
    }

    @Test
    public void canGetSport() {
        team = new Team("Norway", SportType.ROWING);
        assertEquals( SportType.ROWING, team.getSport() );
    }

    @Test
    public void startsWithNoMedals() {
        team = new Team("Norway", SportType.ROWING);
        assertEquals( 0, team.getMedals().size() );
    }

    @Test
    public void scoreStartsAtZero() {
        team = new Team("Norway", SportType.ROWING);
        assertEquals( 0, team.getScore() );
    }

    @Test
    public void canRecieveMedal() {
//        arrange
        team = new Team("Norway", SportType.ROWING);
//        act
        team.receiveMedal(MedalType.GOLD);
//        assert
        assertEquals( 1, team.getMedals().size() );
        assertEquals( MedalType.GOLD, team.getMedals().get(0) );

    }
}