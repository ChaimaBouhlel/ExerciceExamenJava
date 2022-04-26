public class TacheElementaire implements Tache{

    private int cout ;
    private String nom;

    public TacheElementaire(int cout, String nom) {
        super();
        this.cout = cout;
        this.nom = nom;
    }

    public int getCout() {
        return this.cout;
    }
    public  String getNom(){
        return this.nom;
    }

    public void affiche(){
        System.out.println("Tache elementaire: "+this.nom+ ", Cout:"+ getCout());
    }
}
