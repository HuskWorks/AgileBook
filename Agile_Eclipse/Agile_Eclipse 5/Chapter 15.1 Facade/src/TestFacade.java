/*
 * Created on 2005/01/10
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Keisuke Seya
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TestFacade extends JFrame {

	public static void main(String[] args) {
		TestFacade test = new TestFacade("Facade Test");
		test.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		/* Make it visible */
		test.setVisible(true);
	}

	TestFacade(String title) {
		setTitle(title);
		setBounds(10, 10, 300, 200);
		String[] listData = {"adam", "bob", "cindy", "david", "elena", "frank"};
		
		JTextField t = new JTextField("", 15);
		JList l = new JList(listData);

		QuickEntryMediator qem = new QuickEntryMediator(t, l);

		JPanel p = new JPanel();
		p.add(t);
		getContentPane().add(p);
		l.setPreferredSize(new Dimension(100, 120));
		getContentPane().add(l, BorderLayout.AFTER_LAST_LINE);
	}

}