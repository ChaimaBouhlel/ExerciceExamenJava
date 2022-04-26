public class TestTache1 {
    public static void main(String[] args) {
        //Creation de tache complexe tA
        TacheComplexe tA = new TacheComplexe("A");

        //tester fonction ajouter
        tA.ajouter(new TacheElementaire(10, "A1"));
        tA.ajouter(new TacheElementaire(45, "A5"));
        tA.ajouter(new TacheElementaire(20, "A2"));

        //Affichage du cout
        System.out.println("Cout de tA = " + tA.getCout());

        System.out.println();

        //Affichage de la tache tA
        System.out.println("Affichage de la tache tA");
        tA.affiche(1);

        System.out.println();

        //Creation de tache complexe tB avec deux soutaches elementaires
        TacheComplexe tB = new TacheComplexe("B");
        tB.ajouter(new TacheElementaire(10, "B1"));
        tB.ajouter(new TacheElementaire(30, "B11"));
        tB.ajouter(new TacheElementaire(20, "B2"));

        //Ajout d'une tache complexe tB dans la tache tA
        tA.ajouter(tB);

        //Deuxième Affichage après ajout de tB dans tA
        System.out.println("Deuxième Affichage après ajout de tB dans tA");
        tA.affiche(1); //parametre level pour avoir un affichage clair

        System.out.println();
        System.out.println("Affichage de tB après tri par cout");
        tB.tricout(new Coutcomparator());
        tB.affiche(1);

        System.out.println();
        System.out.println("Affichage de tB après tri par nom");
        tB.triNom(new NomComparator());
        tB.affiche(1);
    }
}
