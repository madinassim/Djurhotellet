import java.util.ArrayList;
import java.util.List;
public class KattHotell {
    private final List<Katt> katter = new ArrayList<>();

    public boolean checkIn(Katt katt) {
        katter.add(katt);
        return true;
    }
}
