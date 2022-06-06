package com.app;

public class Medewerker {
    public String naam;
    public int rank;
    public double werktijd;

    public Medewerker(String naam, double werktijd){
        this.naam = naam;
        this.werktijd = werktijd;
        LeaderBoard.medewerkers.add(this);
    }

    public String getNaam(){
        return this.naam;
    }

    public double getWerktijd(){
        return this.werktijd;
    }

    public int getRank() {
        return this.rank;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public void setWerktijd(double werktijd){
        this.werktijd = werktijd;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
