package com.AWTDemo;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClick {

	public static void main(String[] args) {

		Frame f1 = new Frame("Button Example");

		TextField tf1 = new TextField();
		tf1.setBounds(60, 50, 170, 20);

		Button b1 = new Button("Press It");
		b1.setBounds(100, 100, 80, 30);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				tf1.setText("Welcome To Java");
				f1.setBackground(Color.black);

			}
		});

		f1.add(tf1);
		f1.add(b1);

		f1.setSize(500, 500);
		f1.setLayout(null);
		f1.setVisible(true);

	}

}
