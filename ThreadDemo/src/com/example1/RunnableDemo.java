package com.example1;

public class RunnableDemo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r1 = new RunnableDemo();
//		Thread t1 = new Thread(r1);
//		t1.start()
		Thread t1 = new Thread(r1, "My Thread");
		// r1.run();
		t1.start();
		System.out.println(Thread.currentThread());
		System.out.println(t1.getPriority());

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");

	}

}
