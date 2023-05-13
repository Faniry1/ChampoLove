package Vue;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class NewProfil extends JFrame{
	
	private Toolkit outil = getToolkit();
	private Dimension taille = outil.getScreenSize();
	
	private JLabel profilvalide = new JLabel("Profil Créé");
	private JLabel profilinvalide = new JLabel("Profil Invalide");
	
	// Limiter la zone de texte
	// JTextArea nom1 = new JTextArea(); nom1.setLineWrap(true); nom1.setWrapStyleWord(true);
	
	public NewProfil(MouseListener ctrl) {
		int x =9;
        
		this.setSize(taille);
		this.setUndecorated(true);
		this.setLayout(new BorderLayout());
		
		// Titre de la page
		JPanel haut = new JPanel();
		JButton rmenu = new JButton("Retour MENU");
		JLabel titre = new JLabel("NOUVEAU PROFIL");
		rmenu.setBackground(Color.red);
		rmenu.addMouseListener(ctrl);
		titre.setForeground(Color.blue);
		haut.add(rmenu);
		haut.add(titre);
		
		JPanel infos = new JPanel();
		infos.setLayout(new GridLayout(1,3));
		
		JPanel infoperso = new JPanel();
		infoperso.setBackground(Color.pink);
		infoperso.setLayout(new GridLayout(x+1,2));
		JLabel tt = new JLabel("INFORMATIONS PERSONELLES : "); JLabel tt1 = new JLabel("");
		tt.setForeground(Color.red);
		JLabel nom = new JLabel("NOM : "); JTextField nom1 = new JTextField();
		JLabel prenom = new JLabel("PRENOM : "); JTextField prenom1 = new JTextField();
		JLabel tel = new JLabel("TELEPHONE : "); JTextField tel1 = new JTextField();
		JLabel email = new JLabel("EMAIL : "); JTextField email1 = new JTextField();
		SpinnerModel model = new SpinnerNumberModel(25,18, 100, 1);
		JLabel age = new JLabel("AGE : "); JSpinner age1 = new JSpinner(model);
		JLabel daten = new JLabel("Date de Naissance : "); 
		Calendrier datenaiss = new Calendrier("Date de Naissance");
		JLabel sexe = new JLabel("SEXE : "); JComboBox sexe1 = new JComboBox(Modele.Modele.sexe);
		JLabel ville = new JLabel("VOTRE DEPARTEMENT : ");JTextField ville1 = new JTextField();
		infoperso.add(tt);infoperso.add(tt1);
		infoperso.add(nom);infoperso.add(nom1); infoperso.add(prenom);infoperso.add(prenom1);
		infoperso.add(age);infoperso.add(age1); infoperso.add(sexe);infoperso.add(sexe1);
		infoperso.add(daten);infoperso.add(datenaiss);infoperso.add(ville);infoperso.add(ville1); 
		infoperso.add(tel);infoperso.add(tel1);
		infoperso.add(email);infoperso.add(email1);
		
		JPanel description = new JPanel();
		description.setLayout(new GridLayout(x,2));
		JLabel d = new JLabel("VOTRE DESCRIPTION :"); JLabel d1 = new JLabel("");
		d.setForeground(Color.red);
		SpinnerModel model1 = new SpinnerNumberModel(60,50, 150, 1);
		JLabel poid = new JLabel("POIDS(KG) : "); JSpinner poid1 = new JSpinner(model1);
		SpinnerModel taillemod = new SpinnerNumberModel(160,100, 230, 1);
		JLabel taille = new JLabel("TAILLE(CM) : "); JSpinner taille1 = new JSpinner(taillemod);
		JLabel photo = new JLabel("PHOTO : "); JTextField photo1 = new JTextField();
		JLabel hobbie1 = new JLabel("PASSE TEMPS 1 : "); JTextField hobbie11 = new JTextField();
		JLabel hobbie2 = new JLabel("PASSE TEMPS 2 : "); JTextField hobbie21 = new JTextField();
		JLabel decrir = new JLabel("Décrivez-vous : "); JTextArea decrir1 = new JTextArea(); 
		decrir1.setLineWrap(true); decrir1.setWrapStyleWord(true);
		description.add(d);description.add(d1);
		description.add(photo);description.add(photo1); 
		description.add(poid);description.add(poid1);
		description.add(taille);description.add(taille1);
		description.add(hobbie1);description.add(hobbie11);
		description.add(hobbie2);description.add(hobbie21);
		description.add(decrir);description.add(decrir1);
		
		JPanel attentes = new JPanel();
		attentes.setLayout(new GridLayout(x,2));
		JLabel t = new JLabel("VOS ATTENTES :"); JLabel t2 = new JLabel("");
		t.setForeground(Color.red);
		JLabel agea = new JLabel("AGE : "); JSpinner agea1 = new JSpinner(model);
		JLabel sexea = new JLabel("SEXE : "); JComboBox sexea1 = new JComboBox(Modele.Modele.sexe);
		JLabel poida = new JLabel("POIDS(KG) : "); JSpinner poida1 = new JSpinner(model1);
		JLabel taillea = new JLabel("TAILLE(CM) : "); JSpinner taillea1 = new JSpinner(taillemod);
		JLabel at = new JLabel("Vos Attentes : "); JTextArea at1 = new JTextArea(); 
		at1.setLineWrap(true); at1.setWrapStyleWord(true);
		JLabel villea = new JLabel("DEPARTEMENT : ");JTextField villea1 = new JTextField();
		attentes.add(t);attentes.add(t2); attentes.add(agea);attentes.add(agea1);
		attentes.add(sexea);attentes.add(sexea1); attentes.add(villea);attentes.add(villea1); 
		attentes.add(poida);attentes.add(poida1);
		attentes.add(taillea);attentes.add(taillea1);
		attentes.add(at);attentes.add(at1);
		
		infos.add(infoperso);
		infos.add(description);
		infos.add(attentes);
		
		JPanel registerprofil = new JPanel();
		registerprofil.setLayout(new GridLayout(3,1));
		JButton registerbtn = new JButton("Enregistrer le Profil");
		registerprofil.add(profilvalide);
		registerprofil.add(profilinvalide);
		registerprofil.add(registerbtn);
		
		this.add(haut,BorderLayout.NORTH);
		this.add(infos,BorderLayout.CENTER);
		this.add(registerprofil,BorderLayout.SOUTH);
	}
}
