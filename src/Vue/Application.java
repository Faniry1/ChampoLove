package Vue;

import java.util.Observable;
import java.util.Observer;

import Controleur.Controleur;
import Modele.*;

public class Application implements Observer{
	
	private Modele mod;
	private Controleur ctrl;
	private Menu menu;
	private Profils profil;
	private NewProfil nprof;
	
	public Application() {
		mod = new Modele();
		ctrl = new Controleur(mod);
		menu = new Menu(ctrl);
		profil = new Profils(ctrl);
		nprof = new NewProfil(ctrl);
		
		mod.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (mod.getEtatJeu()==0) {
			this.profil.setVisible(false);
			this.nprof.setVisible(false);
			this.menu.setVisible(true);
		}
		else if (mod.getEtatJeu()==1) {
			this.profil.setVisible(true);
			this.menu.setVisible(false);
			this.nprof.setVisible(false);
		}
		else if (mod.getEtatJeu()==2) {
			this.profil.setVisible(false);
			this.menu.setVisible(false);
			this.nprof.setVisible(true);
		}
	}
}
