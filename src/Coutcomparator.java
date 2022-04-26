import java.util.Comparator;

public class Coutcomparator implements Comparator<Tache> {
    @Override
    public int compare(Tache o1, Tache o2) {
        return o1.getCout()- o2.getCout();
    }
}
