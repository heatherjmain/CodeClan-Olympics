package com.example.heather.codeclanolympics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 15/09/2017.
 */
public class CompetitionTest {
    Competition competition;
    Team team;
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;


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
        team = new Team("Norway");
        athlete1 = new Athlete("Scotland");

//        act
        competition.addCompetitor(team);
        competition.addCompetitor(athlete1);

//        assert
        assertEquals( 2, competition.getCompetitors().size()  );
        assertEquals( "Norway", competition.getCompetitors().get(0).getCountry()  );
        assertEquals( "Scotland", competition.getCompetitors().get(1).getCountry()  );
    }

    @Test
    public void canSortCompetitorsByScore() {
//        arrange
        competition = new Competition(SportType.RUNNING);

        athlete1 = new Athlete("Scotland");
        athlete2 = new Athlete("USA");
        athlete3 = new Athlete("France");

        athlete1.increaseScore(10);
        athlete2.increaseScore(100);
        athlete3.increaseScore(1);

        competition.addCompetitor(athlete1);
        competition.addCompetitor(athlete2);
        competition.addCompetitor(athlete3);

//        act
        competition.sortComeptitorsByScore();

//        assert
        assertEquals( "USA", competition.getCompetitors().get(0).getCountry() );
        assertEquals( "Scotland", competition.getCompetitors().get(1).getCountry() );
        assertEquals( "France", competition.getCompetitors().get(2).getCountry() );


    }
}