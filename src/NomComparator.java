import java.util.Comparator;

public class NomComparator implements Comparator<Tache> {
    @Override
    public int compare(Tache o1, Tache o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
