package Vue;

import java.awt.*;

import javax.swing.*;

public class NewProfil extends JFrame{
	
	private Toolkit outil = getToolkit();
	private Dimension taille = outil.getScreenSize();
	
	public NewProfil() {
		this.setSize(taille);
		this.setLayout(new BorderLayout());
		
		JPanel haut = new JPanel();
		JLabel titre = new JLabel("NOUVEAU PROFIL");
		haut.add(titre);
		
		JPanel infos = new JPanel();
		infos.setLayout(new GridLayout(1,3));
		
		JPanel infoperso = new JPanel();
		infoperso.setBackground(Color.pink);
		infoperso.setLayout(new GridLayout(12,2));
		JLabel tt = new JLabel("INFORMATIONS PERSONELLES : "); JLabel tt1 = new JLabel("");
		JLabel nom = new JLabel("NOM : "); JTextField nom1 = new JTextField();
		JLabel prenom = new JLabel("PRENOM : "); JTextField prenom1 = new JTextField();
		JLabel tel = new JLabel("TELEPHONE : "); JTextField tel1 = new JTextField();
		JLabel email = new JLabel("EMAIL : "); JTextField email1 = new JTextField();
		JLabel photo = new JLabel("PHOTO : "); JTextField photo1 = new JTextField();
		JLabel age = new JLabel("AGE : "); JTextField age1 = new JTextField();
		JLabel datenaiss = new JLabel("Date de Naissance : "); JTextField datenaiss1 = new JTextField();
		JLabel sexe = new JLabel("SEXE : "); JTextField sexe1 = new JTextField();
		JLabel poid = new JLabel("POIDS : "); JTextField poid1 = new JTextField();
		JLabel taille = new JLabel("TAILLE : "); JTextField taille1 = new JTextField();
		infoperso.add(tt);infoperso.add(tt1);
		infoperso.add(nom);infoperso.add(nom1); infoperso.add(prenom);infoperso.add(prenom1);
		infoperso.add(age);infoperso.add(age1); infoperso.add(sexe);infoperso.add(sexe1);
		infoperso.add(datenaiss);infoperso.add(datenaiss1);
		infoperso.add(photo);infoperso.add(photo1); infoperso.add(poid);infoperso.add(poid1);
		infoperso.add(taille);infoperso.add(taille1); infoperso.add(tel);infoperso.add(tel1);
		infoperso.add(email);infoperso.add(email1);
		
		JPanel attentes = new JPanel();
		attentes.setLayout(new GridLayout(11,2));
		JLabel t = new JLabel("VOS ATTENTES :"); JLabel t2 = new JLabel("");
		JLabel agea = new JLabel("AGE : "); JTextField agea1 = new JTextField();
		JLabel sexea = new JLabel("SEXE : "); JTextField sexea1 = new JTextField();
		JLabel poida = new JLabel("POIDS : "); JTextField poida1 = new JTextField();
		JLabel taillea = new JLabel("TAILLE : "); JTextField taillea1 = new JTextField();
		attentes.add(t);attentes.add(t2); attentes.add(agea);attentes.add(agea1);
		attentes.add(sexea);attentes.add(sexea1); attentes.add(poida);attentes.add(poida1);
		attentes.add(taillea);attentes.add(taillea1);
		
		infos.add(infoperso);
		infos.add(attentes);
		
		this.add(haut,BorderLayout.NORTH);
		this.add(infos,BorderLayout.CENTER);
	}
}
