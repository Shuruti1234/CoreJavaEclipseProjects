package com.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caller implements ActionListener {

	MyFrame f1;

	Caller(MyFrame f1) {
		this.f1 = f1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		f1.tf.setText("Java Class");
	}

}
