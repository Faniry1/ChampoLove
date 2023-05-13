package Vue;

import java.awt.*;
import javax.swing.*;

public class Recherche extends JPanel{

	public Recherche() {
		this.setLayout(new GridLayout(10,1));
		
		//Par le nom ou le prenom
		JTextField recherche = new JTextField("Tapez NOM ou PRENOM");
		this.add(recherche);
		JButton btnrech = new JButton("RECHERCHE");
		this.add(btnrech);
		
		JLabel vide = new JLabel("");
		this.add(vide);
		// Pour le genre
		JPanel genr = new JPanel();
		genr.setLayout(new GridLayout(2,1));
		JLabel tgenr = new JLabel("Genre : ");
		JComboBox genre = new JComboBox(Modele.Modele.sexe);
		genr.add(tgenr); genr.add(genre);
		this.add(genr);
		
		// Pour l age
		JPanel ag = new JPanel();
		ag.setLayout(new GridLayout(2,1));
		JLabel tag = new JLabel("Age : ");
		
		JPanel age = new JPanel();
		age.setLayout(new GridLayout(1,3));
		SpinnerModel modelage1 = new SpinnerNumberModel(25,18, 100, 1);
		SpinnerModel modelage2 = new SpinnerNumberModel(25,18, 100, 1);
		JSpinner age1  = new JSpinner(modelage1);
		JLabel a = new JLabel("à");
		JSpinner age2  = new JSpinner(modelage2);
		age.add(age1); age.add(a); age.add(age2);
		ag.add(tag); ag.add(age);
		this.add(ag);
		
		// Pour la taille
		JPanel tail = new JPanel();
		tail.setLayout(new GridLayout(2,1));
		JLabel ttail = new JLabel("TAILLE : ");
		JPanel taille = new JPanel();
		taille.setLayout(new GridLayout(1,3));
		SpinnerModel modeltaille1 = new SpinnerNumberModel(25,18, 100, 1);
		SpinnerModel modeltaille2 = new SpinnerNumberModel(25,18, 100, 1);
		JSpinner taille1  = new JSpinner(modeltaille1);
		JLabel a2 = new JLabel("à");
		JSpinner taille2  = new JSpinner(modeltaille2);
		taille.add(taille1); taille.add(a2); taille.add(taille2);
		tail.add(ttail);
		tail.add(taille);
		this.add(tail);	
		
		// Pour le Département
		JPanel depart = new JPanel();
		depart.setLayout(new GridLayout(2,1));
		JLabel tdepart = new JLabel("Département :");
		String [] departs = {"Albi","Toulouse","Strasbourg","Lille","Nantes","Paris","Pontarlier",
				"Rodez","Castres","Montpelier","Vosges","Bordeaux","La Rochelle","La Réunion",
				"Nice","Nîme"};
		JComboBox departement = new JComboBox(departs);
		depart.add(tdepart);
		depart.add(departement);
		this.add(depart);
		}
	
}
