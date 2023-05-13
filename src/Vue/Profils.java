package Vue;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Profils extends JFrame{
	
	
	private Toolkit outil = getToolkit();
	private Dimension taille = outil.getScreenSize();
	
	public Profils(MouseListener ctrl) {
		this.setSize(taille);
		this.setLayout(new BorderLayout());
		
		JPanel haut = new JPanel();
		JButton rmenu = new JButton("Retour MENU");
		JLabel titre = new JLabel("LES PROFILS");
		rmenu.setBackground(Color.red);
		rmenu.addMouseListener(ctrl);
		titre.setForeground(Color.blue);
		haut.add(rmenu);
		haut.add(titre);
		
		this.add(haut,BorderLayout.NORTH);
	}
	
}
