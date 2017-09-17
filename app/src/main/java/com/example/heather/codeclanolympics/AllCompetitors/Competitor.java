package com.example.heather.codeclanolympics.AllCompetitors;

import android.annotation.TargetApi;
import android.support.annotation.NonNull;

import com.example.heather.codeclanolympics.MedalType;

/**
 * Created by heather on 15/09/2017.
 */

public abstract class Competitor implements Comparable<Competitor> {
    private String country;
//    private SportType sport;
//    private ArrayList<MedalType> medals;
    private int score;
    private int goldMedals;
    private int silverMedals;
    private int bronzeMedals;

    public Competitor(String country) {
        this.country = country;
//        this.sport = sport;
//        this.medals= new ArrayList<>();
        this.score = 0;
        this.goldMedals = 0;
        this.silverMedals = 0;
        this.bronzeMedals = 0;

    }

    public String getCountry() {
        return country;
    }

//    public SportType getSport() {
//        return sport;
//    }

//    public ArrayList<MedalType> getMedals() {
//        return medals;
//    }


    public int getGoldMedals() {
        return goldMedals;
    }

    public int getSilverMedals() {
        return silverMedals;
    }

    public int getBronzeMedals() {
        return bronzeMedals;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore(int points) {
        this.score += points;
    }

    public void receiveMedal(MedalType medal) {
        if (medal == MedalType.GOLD) {
            this.goldMedals += 1 ;
        }
        else if (medal == MedalType.SILVER) {
            this.silverMedals += 1;
        }
        else if (medal == MedalType.BRONZE) {
            this.bronzeMedals += 1;
        }
    }

    @Override
    @TargetApi(19)
    public int compareTo(@NonNull Competitor competitor) {
//        if (this.score < competitor.score) {
//            return -1;
//        }
//        if (this.score == competitor.score) {
//            return 0;
//        }
//        return 1;

        return Integer.compare(competitor.score, this.score);
    }


}
