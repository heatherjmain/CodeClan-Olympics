package com.example.heather.codeclanolympics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 15/09/2017.
 */
public class CompetitionTest {
    Competition competition;
    Team team;
    Athlete athlete;


    @Test
    public void canGetSportType() {
        competition = new Competition(SportType.RUNNING);
        assertEquals( SportType.RUNNING, competition.getSport() );
    }

    @Test
    public void startsWithNoCompetitiors() {
        competition = new Competition(SportType.RUNNING);
        assertEquals( 0, competition.getCompetitors().size());

    }

    @Test
    public void canAddCompetitior() {
//        arrange
        competition = new Competition(SportType.RUNNING);
        team = new Team("Norway", SportType.ROWING);
        athlete = new Athlete("Scotland", SportType.RUNNING);

//        act
        competition.addCompetitor(team);
        competition.addCompetitor(athlete);
        
//        assert
        assertEquals( 2, competition.getCompetitors().size()  );
        assertEquals( "Norway", competition.getCompetitors().get(0).getCountry()  );
        assertEquals( "Scotland", competition.getCompetitors().get(1).getCountry()  );


    }

}