import java.util.ArrayList;
import java.util.List;
public class KattHotell {
    private final List<Katt> katter = new ArrayList<>();

    public boolean checkIn(Katt katt) {
        if (finnsChipnummer(katt.getChipnummer())) {
            System.out.println("Katten är redan incheckad!");
            return false;
        }
        katter.add(katt);
        return true;
    }

    public boolean finnsChipnummer(int chipnummer) {
        for (Katt katt : katter) {
            if (katt.getChipnummer() == chipnummer) {
                return true;
            }
        }
        return false;
    }
public int antallKatt() {
    return katter.size();
}
}