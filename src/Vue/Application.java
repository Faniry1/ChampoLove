package Vue;

import java.util.Observable;
import java.util.Observer;

import Controleur.Controleur;
import Modele.*;

public class Application implements Observer{
	
	private Modele mod;
	private Controleur ctrl;
	private Menu menu;
	private NewProfil nprof;
	
	public Application() {
		mod = new Modele();
		ctrl = new Controleur(mod);
		menu = new Menu(ctrl);
		nprof = new NewProfil();
		
		mod.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println(mod.getEtatJeu());
		if (mod.getEtatJeu()==0) {
			this.nprof.setVisible(false);
			this.menu.setVisible(true);
		}
		else if (mod.getEtatJeu()==2) {
			this.menu.setVisible(false);
			this.nprof.setVisible(true);
		}
	}
}
