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
		JButton btn = new JButton();
		JLabel lab = new JLabel();
		// TODO Auto-generated method stub
		if (e.getSource().getClass()== btn.getClass()) {
			String boutonTxt = ((JButton)e.getSource()).getText();
			if (boutonTxt=="PROFILS") {
				m.setEtatJeu(1);
			}
			else if (boutonTxt=="Retour MENU") {
				m.setEtatJeu(0);
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
		else if (e.getSource().getClass()== lab.getClass()) {
			String labeltxt = ((JLabel)e.getSource()).toString();
			System.out.println(labeltxt);
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
