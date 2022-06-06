Lucas Clavel  
21093830  
Klas 4  


    public static boolean getMedewerkers(IScanner scanner) {
        if(MedewerkerList.size() != 0){
            int i = 1;
            for (Medewerker e : Medewerker.MedewerkerList) {
                System.out.println(i + ") naam: " + e.getNaam() + " werktijd: " + e.getWerktijd());
                i++;
            }
            UI.KeerTerugGetal();
            return true;
        }else{
            System.out.println("Geen medewerkers beschikbaar.");
            UI.KeerTerugEnter();
            scanner.nextLine(); //just to wait for input
            return false;
        }
    }

    public static void werktijdAdd(IScanner scanner) {
        if (getMedewerkers(scanner)){
            UI.medewerkerAanpassen("bewerken");
            int medewerker = scanner.nextInt() - 1;
            if (medewerker >= 0) {
                for (Medewerker e : Medewerker.MedewerkerList) {
                    if (e.getNaam().equals(MedewerkerList.get(medewerker).getNaam())){
                        System.out.println("U heeft " + e.getNaam() + " gekozen om aan te passen.");
                        UI.VoerWerktijdIn();
                        double x = scanner.nextDouble();
                        x = x * 60;
                        e.setWerktijd(x);
                        System.out.println("Medewerker " + e.getNaam() + " is succesvol aangepast"); 
                        UI.KeerTerugEnter();
                        scanner.nextLine(); //just to wait for input 
                        scanner.nextLine(); //just to wait for input
                    }
                }
            }
        }
    }

    public static void medewerkerAdd(IScanner scanner){
        try{
            UI.VoerNaamin();
            String naam = scanner.nextLine();
            naam = naam.replace("\n", ""); 
            UI.VoerWerktijdIn();
            double nummer = (scanner.nextDouble() * 60);
            scanner.nextLine();
            Medewerker medewerker = new Medewerker(naam, nummer);
            UI.AddedToList(medewerker.getNaam());
            UI.KeerTerugEnter();
            scanner.nextLine(); //just to wait for input
        }
        catch(Exception e){
            UI.Error("medewerkerAdd");
            System.out.println(e);
        }
    }

    public static void medewerkerDelete(IScanner scanner){
        if (getMedewerkers(scanner)){
            UI.medewerkerAanpassen("verwijderen");
            int userMedewerkerChoice = scanner.nextInt();
            scanner.nextLine(); //just to wait for input
            if (userMedewerkerChoice > 0){
                Medewerker.MedewerkerList.remove(userMedewerkerChoice-1);
                System.out.println("Medewerker succesvol verwijderd");
                UI.KeerTerugEnter();
                scanner.nextLine(); //just to wait for input
            }else{
                UI.ongeldigeMedewerker();
            }
        }
    }

    
    Legacy code dont touch
    public static void init(){
        Pad padInter = new Pad ("Internationaal", 60, 0);
        Pad padPotjes = new Pad ("Potjes", 60, 0);
        Pad padFrisdrank = new Pad ("Frisdrank", 60, 0);
        Pad padBier = new Pad ("BierChipsWijn", 60, 0);
        Pad padChips= new Pad ("Chips", 60, 0);
        Pad padWijn = new Pad ("Wijn", 60, 0);
        Pad padDierenvoeding = new Pad ("Internationaal", 60, 0);
        Pad padCosmetica = new Pad ("Cosmetica", 60, 0);
        Pad padKoek = new Pad ("Koek", 60, 0);
        Pad padOntbijt = new Pad ("Ontbijt", 60, 0);
        Pad padZuivel = new Pad ("ZuivelVVP", 60, 0);
        Pad padVVP = new Pad ("VVP", 60, 0);
        Pad padDiepvries = new Pad("Diepvries", 60, 0);
        }
        
    
