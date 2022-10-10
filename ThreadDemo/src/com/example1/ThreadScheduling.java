package com.example1;

public class ThreadScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnable nr = new MyRunnable();
		Thread t1 = new Thread(nr, "Mitul");
		t1.start();
		Thread t2 = new Thread(nr, "Payal");
		t2.start();
		Thread t3 = new Thread(nr, "Prithwish");
		t3.start();

	}
}
