 import javax.swing.*;
 import java.io.IOException;

 import java.awt.*;
 import java.awt.event.*;
 
public class TacheComplexeSwing {
    final JFrame fenetre = new JFrame("Nouvelle tache");
    final private JTextField valeurNom = new JTextField(10);
    final private JTextField valeurCout = new JTextField(10);
    final private JButton boutonAjouter = new JButton("Ajouter");
    final private JButton boutonQuitter = new JButton("Quitter");

    public TacheComplexeSwing(TacheComplexe tache) {
         Container c = fenetre.getContentPane();
         c.setLayout(new BorderLayout());
         JPanel informations = new JPanel(new GridLayout(2,2));
         informations.add(new JLabel("Nom : ", SwingConstants.RIGHT));
         informations.add(valeurNom);
         informations.add(new JLabel("Cout : ", SwingConstants.RIGHT));
         informations.add(valeurCout);
         c.add(informations, BorderLayout.CENTER);

         JPanel boutons = new JPanel(new FlowLayout());
         boutons.add(boutonAjouter);
         boutonAjouter.addActionListener(new ClickActionN (tache));
         
         
         boutons.add(boutonQuitter);
         boutonQuitter.addActionListener(new ClickAction());
        
         
         c.add(boutons, BorderLayout.SOUTH);

         fenetre.pack();
        fenetre.setVisible(true);
        
       
         
   }
   class ClickActionN extends AbstractAction {
	   TacheComplexe tache;
       public  ClickActionN (TacheComplexe tache){
        	 super();
        	 this.tache=tache;
         };
		public void actionPerformed (ActionEvent e) {
	       
			  String nom= valeurNom.getText();
			  String x = valeurCout.getText();
			 try { 
			  Integer cout= Integer.parseInt(x) ;
			 tache.ajouter(new TacheElemtaire(cout,nom) );}
			 
			 catch (NumberFormatException b) 
			 { System.out.println(" NumberFormat problem " + b);
			 valeurCout.setBackground(Color.RED);}
			 
		
			tache.triNom(new Namecomp ());
			 
			  
			  System.out.println("tache ajout�e");
			  
			  }}
   private class ClickAction extends AbstractAction {

	public void actionPerformed(ActionEvent e) {
   fenetre.dispose();
		
            }}
  
public static void main(String[] args)   {
	new TacheComplexeSwing(  new TacheComplexe("bnj") );
}	
}



