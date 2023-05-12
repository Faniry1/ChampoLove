package Vue;

import java.awt.*;

import javax.swing.*;

public class Calendrier extends JPanel{
	
	public Calendrier(String mot) {
		JSpinner jour = null;
		JComboBox mois = null ;
		JSpinner annee = null;
		// Si mot est égal date de naiss
		if (mot=="Date de Naissance") {
			// initial value, minimum value, maximum value, step size
			SpinnerModel model1 = new SpinnerNumberModel(1,1, 31, 1);
			SpinnerModel model2 = new SpinnerNumberModel(2023,1923, 2023, 1);
			jour = new JSpinner(model1);
			mois = new JComboBox(Modele.Modele.mois);
			annee = new JSpinner(model2);

		}
		this.setLayout(new GridLayout(1,3));
		this.add(jour);
		this.add(mois);
		this.add(annee);
	}

}
