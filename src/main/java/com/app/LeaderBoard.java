package com.app;

import java.util.ArrayList;

public abstract class LeaderBoard {

    private static ArrayList<Medewerker> medewerkers = new ArrayList<>();

    public static ArrayList<Medewerker> getUsers(){
        updateRanking();
        return medewerkers;
    }

    private static void updateRanking(){
        for (int i = 0; i < medewerkers.size(); i++) {
            medewerkers.get(i).setRank(i+1);
        }
    }
}
