package Vue;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Menu extends JFrame{
	
	private Toolkit outil = getToolkit();
	private Dimension taille = outil.getScreenSize();
	
	public Menu(MouseListener m) {
		this.setSize(taille);
		this.setUndecorated(true);
		
		JPanel titre = new JPanel();
		JLabel logo = new JLabel();
		JLabel champolove = new JLabel("CHAMPOLOVE");
		titre.add(logo);
		titre.add(champolove);
		
		JPanel menu = new JPanel();
		JButton profils = new JButton("PROFILS");
		JButton newprofil = new JButton("NOUVEAU PROFIL");
		JButton options = new JButton("OPTIONS");
		JButton quitter = new JButton("QUITTER");
		menu.setLayout(new GridLayout(4,1,0,10));
		menu.add(profils); profils.addMouseListener(m);
		menu.add(newprofil); newprofil.addMouseListener(m);
		menu.add(options); options.addMouseListener(m);
		menu.add(quitter); quitter.addMouseListener(m);
		
		this.setLayout(new BorderLayout());
		this.add(titre,BorderLayout.NORTH);
		this.add(menu,BorderLayout.CENTER);
		this.setVisible(true);
	}
}
