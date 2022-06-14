package com.app;

public class Medewerker {
    public String naam;
    public int rank;
    public double werktijd;

    public Medewerker(String naam, double werktijd){
        this.naam = naam;
        // bij false is het in minuten ingevoerd, bij true is het in uren ingevuld
        if (werktijd < 10){
            this.werktijd = werktijd * 60;
        }else{
            this.werktijd = werktijd;
        }
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
        if (werktijd < 10){
            this.werktijd = werktijd * 60;
        }else{
            this.werktijd = werktijd;
        }
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
