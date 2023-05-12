package Controleur;

import javax.swing.*;

import Modele.Modele;

import java.awt.event.*;

public class Controleur implements MouseListener{
	
	private Modele m;
	
	public Controleur(Modele mod) {
		m = mod;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String boutonTxt = ((JButton)e.getSource()).getText();
		if (boutonTxt=="PROFILS") {
			m.setEtatJeu(1);
		}
		else if (boutonTxt=="NOUVEAU PROFIL") {
			m.setEtatJeu(2);
		}
		else if (boutonTxt=="OPTIONS") {
			m.setEtatJeu(3);
		}
		else if (boutonTxt=="QUITTER") {
			System.out.println("Fermeture de l'application");
			System.exit(0);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}