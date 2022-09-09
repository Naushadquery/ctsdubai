package com.nau;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUITable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton b1, b2;
	private JTextField tf1, tf2;
	private JTextArea ta1, ta2;
	private JPanel p1, p2, p3, p4;

	public GUITable() {
		createUI();
		displayUI();
		registerEvents();
	}

	private void registerEvents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new Thread(() -> {
					String n1 = tf1.getText();
					int i = Integer.parseInt(n1);
					ta1.setText("");
					for (int k = 1; k <= 20; k++) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						ta1.append(i + " x " + k + " = " + (i * k) + "\n");
					}
				}).start();

			}
		};
		b1.addActionListener(al);

		b2.addActionListener((e) -> {
			new Thread(() -> {
				String n1 = tf2.getText();
				int i = Integer.parseInt(n1);
				ta2.setText("");
				for (int k = 1; k <= 20; k++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					ta2.append(i + " x " + k + " = " + (i * k) + "\n");
				}
			}).start();
		});

	}

	private void displayUI() {
		setTitle("Displaying Table");
		setSize(500, 400);
		setVisible(true);
	}

	private void createUI() {
		b1 = new JButton("Print Table");
		b2 = new JButton("Display Table");
		tf1 = new JTextField();
		tf2 = new JTextField();
		ta1 = new JTextArea();
		ta2 = new JTextArea();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p1.setLayout(new GridLayout(1, 2, 10, 10));
		p1.setBackground(Color.BLUE);
		add(p1, BorderLayout.NORTH);

		p2.setLayout(new GridLayout(1, 2, 5, 5));
		p2.setBackground(Color.BLUE);
		p2.add(b1);
		p2.add(tf1);
		p1.add(p2);

		p3.setLayout(new GridLayout(1, 2, 5, 5));
		p3.setBackground(Color.BLUE);
		p3.add(b2);
		p3.add(tf2);
		p1.add(p3);

		p4.setLayout(new GridLayout(1, 2, 5, 5));
		p4.setBackground(Color.BLUE);
		p4.add(ta1);
		p4.add(ta2);
		add(p4);

	}

}
