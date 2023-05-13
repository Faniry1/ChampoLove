package Vue;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LesProfils extends JPanel{
	
	public LesProfils(MouseListener ctrl) {
		this.setLayout(new GridLayout(10,20,10,10));
		for (int i=0;i<100;i++) {
			JPanel p = new JPanel();
			JLabel l = new JLabel(i+"");
			l.addMouseListener(ctrl);
			p.add(l);
			p.setBackground(Color.yellow);
			this.add(p);
		}
	}
	
}
