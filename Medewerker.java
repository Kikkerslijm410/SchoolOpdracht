public class Medewerker {
    String Vnaam;
    String Anaam;
    int werkTijd;
    
    /*
    int padInter;
    int padPotjes;
    int padFris;
    int padBier;
    int padChips;
    int padWijn;
    int padCosmetica;
    int padDierenvoeding;
    int padKoek;
    int padOntbijt;
    int padDiepvries;
    int padZuivel;
    int padVVP;
    */

    public Medewerker(String Vnaam, String Anaam, int werkTijd){
            this.Vnaam = Vnaam;
            this.Anaam = Anaam;
            this.werkTijd = werkTijd;
    }

    public String getNaam(){
        return this.Vnaam + this.Anaam;
    }   
}
