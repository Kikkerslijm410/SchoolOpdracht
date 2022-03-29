package App;
import java.util.ArrayList;

public class Pad {
    String padNaam;
    int vulnorm;
    static ArrayList<Pad> PadList;

    public Pad (String padNaam, int vulnorm){
        this.padNaam = padNaam;
        this.vulnorm = vulnorm;
        PadList.add(this);
    }
}
