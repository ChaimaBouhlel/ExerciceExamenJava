import java.util.*;

public class TacheComplexe implements Tache, Iterable<Tache> {
    private Collection<Tache> sousTaches;
    private String nom;

    public TacheComplexe(String nom) {
        this.nom = nom;
        this.sousTaches = new ArrayList<Tache>();
    }

    public void ajouter(Tache tache) {
        this.sousTaches.add(tache);
    }

    public void supprimer(Tache tache) {
        this.sousTaches.remove(tache);
    }

    public String getNom() {
        return this.nom;
    }

    public int getCout() {
        int coutCourant = 0;
        for (Tache t : this.sousTaches){
                coutCourant +=  t.getCout();
        }
        return coutCourant;
    }

    public void affiche(int level){
        System.out.println("Tache complexe: " + this.nom + ", Cout:" + getCout() + ", contenant ces taches:");
        for (Tache e : this.sousTaches) {
            for (int i = 1; i <= level ; i++) {
                System.out.print("   ");
            }
            if (e instanceof TacheElementaire) {
                ((TacheElementaire) e).affiche();
            } else {
                level++;
                ((TacheComplexe) e).affiche(level);
            }
        }
    }

    public void triNom(Comparator<Tache> Namecomp){
        Collections.sort((List<Tache>) sousTaches, Namecomp);
    }

    public void tricout(Comparator<Tache> Coutcomp)
    {
        Collections.sort((List<Tache>)sousTaches,Coutcomp);
    }

    public Iterator<Tache> iterator() {
        return this.sousTaches.iterator();
    }
}