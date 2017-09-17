package com.example.heather.codeclanolympics;

import com.example.heather.codeclanolympics.AllCompetitors.Athlete;
import com.example.heather.codeclanolympics.AllCompetitors.Team;
import com.example.heather.codeclanolympics.AllEvents.Competition;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 15/09/2017.
 */
public class CompetitionTest {
    Competition competition;
    Team team;
    Team team2;
    Team team3;
    Team team4;
    Team team5;
    Team team6;
    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;


    @Test
    public void canGetSportType() {
        competition = new Competition(SportType.RUNNING, 5);
        assertEquals( SportType.RUNNING, competition.getSport() );
    }

    @Test
    public void startsWithNoCompetitiors() {
        competition = new Competition(SportType.RUNNING, 5);
        assertEquals( 0, competition.getCompetitors().size());

    }

    @Test
    public void canGetMaxNumberOfCompetitors() {
        competition = new Competition(SportType.RUNNING, 5);
        assertEquals( 5, competition.getMaxNumberOfCompetitors() );
    }

    @Test
    public void cannotAddTooManyCompetitors() {
        competition = new Competition(SportType.RUNNING, 5);

        team = new Team("Norway");
        team2 = new Team("Scotland");
        team3 = new Team("Russia");
        team4 = new Team("USA");
        team5 = new Team("France");
        team6 = new Team("Spain");

        competition.addCompetitor(team);
        competition.addCompetitor(team2);
        competition.addCompetitor(team3);
        competition.addCompetitor(team4);
        competition.addCompetitor(team5);
        competition.addCompetitor(team6);

        assertEquals( 5, competition.getCompetitors().size() );
    }

    @Test
    public void canAddCompetitior() {
//        arrange
        competition = new Competition(SportType.RUNNING, 5);
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
        competition = new Competition(SportType.RUNNING, 5);

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

    @Test
    public void canAwardMedals() {
        competition = new Competition(SportType.RUNNING, 5);

        team = new Team("Norway");
        team2 = new Team("Scotland");
        team3 = new Team("Russia");
        team4 = new Team("USA");
        team5 = new Team("France");


        team.increaseScore(10);
        team2.increaseScore(100);
        team3.increaseScore(50);
        team4.increaseScore(40);
        team5.increaseScore(120);

        competition.addCompetitor(team);
        competition.addCompetitor(team2);
        competition.addCompetitor(team3);
        competition.addCompetitor(team4);
        competition.addCompetitor(team5);


        competition.sortComeptitorsByScore();

        competition.awardMedals();

        assertEquals( 0, team.getGoldMedals() );
        assertEquals( 0, team.getSilverMedals() );
        assertEquals( 0, team.getBronzeMedals() );
        assertEquals( 0, team2.getGoldMedals() );
        assertEquals( 1, team2.getSilverMedals() );
        assertEquals( 0, team2.getBronzeMedals() );
        assertEquals( 0, team3.getGoldMedals() );
        assertEquals( 0, team3.getSilverMedals() );
        assertEquals( 1, team3.getBronzeMedals() );
        assertEquals( 0, team4.getGoldMedals() );
        assertEquals( 0, team4.getSilverMedals() );
        assertEquals( 0, team4.getBronzeMedals() );
        assertEquals( 1, team5.getGoldMedals() );
        assertEquals( 0, team5.getSilverMedals() );
        assertEquals( 0, team5.getBronzeMedals() );

    }
}