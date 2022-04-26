package App;

import java.util.Scanner;

public class Vracht {
    int aantalDozen;

    public Vracht (int aantalDozen){
        this.aantalDozen = aantalDozen;
    }

    public static void vrachtAdd(Scanner scanner){ 
        System.out.println("Voer het aantal dozen in van Internationaal:");
        int padInter       = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Potjes:");
        int padPotjes          = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Frisdrank:");
        int padFrisdrank       = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Bier/Chips/Wijn:");
        int padBier            = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Cosmetica:");
        int padCosmetica       = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Dierenvoeding:");
        int padDierenvoeding   = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Koek:");
        int padKoek            = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Ontbijt:");
        int padOntbijt         = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Zuivel/VVP:");
        int padZuivelVVP       = scanner.nextInt();
        System.out.println("Voer het aantal dozen in van Diepvries:");
        int padDiepvries       = scanner.nextInt();
        System.out.println(padInter + padPotjes + padFrisdrank + padBier + padCosmetica
         + padDierenvoeding + padKoek + padOntbijt + padZuivelVVP + padDiepvries);
    }   
}