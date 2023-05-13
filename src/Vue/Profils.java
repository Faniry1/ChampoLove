package Vue;

import java.awt.*;

import javax.swing.*;

public class Profils extends JFrame{
	
	
	private Toolkit outil = getToolkit();
	private Dimension taille = outil.getScreenSize();
	
	public Profils() {
		this.setSize(taille);
		this.setLayout(new BorderLayout());
	}
	
}
