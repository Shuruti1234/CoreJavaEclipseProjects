package com.example1;

public class Thread1 extends Thread {

	Thread1() {
	}

	Thread1(String name) {
		super(name);
	}

	public void run() {

		System.out.println("Thread is running");

	}

	public static void main(String args[]) {

		Thread1 t1 = new Thread1();
		t1.start();
		Thread1 t2 = new Thread1("MyThread");
		// t2.setName("MyThread");
		t2.start();
		System.out.println("Thread name is :" + t2.getName());

		Thread t3 = new Thread("HelloThread");
		System.out.println(t3.getName());

	}
}
