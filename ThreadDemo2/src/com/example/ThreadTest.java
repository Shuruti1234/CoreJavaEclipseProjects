package com.example;

public class ThreadTest extends Thread {

	ThreadTest() {
	}

	ThreadTest(String name) {
		super(name);
	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			System.out.println(Thread.currentThread() + " " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t1 = new ThreadTest("Ram");
		ThreadTest t2 = new ThreadTest("Laxman");
		ThreadTest t3 = new ThreadTest("Sita");

		t1.start(); // printed
		// t1.start(); // ThreadStateException
		try {
			t1.join(); // locking the resource for a limited time
			// t1. join() // locking the resource till the thread goes to dead state
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();// not run
		// t1.run(); no thread is created
		// t2.run();
		try {
			t2.join(); // locking the resource for a limited time
			// t1. join() // locking the resource till the thread goes to dead state
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// t1.run();
		// t1.run();
		t3.start();

	}

}
