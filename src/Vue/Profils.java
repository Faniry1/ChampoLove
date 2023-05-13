package Vue;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Profils extends JFrame{
	
	
	private Toolkit outil = getToolkit();
	private Dimension taille = outil.getScreenSize();
	
	public Profils(MouseListener ctrl) {
		this.setSize(taille);
		this.setUndecorated(true);
		this.setLayout(new BorderLayout());
		
		// Titre de la page
		JPanel haut = new JPanel();
		JButton rmenu = new JButton("Retour MENU");
		JLabel titre = new JLabel("LES PROFILS");
		rmenu.setBackground(Color.red);
		rmenu.addMouseListener(ctrl);
		titre.setForeground(Color.blue);
		haut.add(rmenu);
		haut.add(titre);
		
		// Filtre pour la recherche
		Recherche rechbar= new Recherche();
		
		// Les Profils Affichés
		LesProfils lesprofils = new LesProfils(ctrl);
		
		this.add(rechbar,BorderLayout.WEST);
		this.add(haut,BorderLayout.NORTH);
		this.add(lesprofils,BorderLayout.CENTER);
	}
	
}
