package Modele;

import java.io.Serializable;
import java.util.Observable;

public class Modele extends Observable implements Serializable{
	
	private int etatJeu;
	
	public Modele() {
		etatJeu=0;
	}

	public int getEtatJeu() {
		return etatJeu;
	}

	public void setEtatJeu(int etatJeu) {
		this.etatJeu = etatJeu;
		this.setChanged();
		this.notifyObservers();
	}
}
