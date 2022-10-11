package com.example;

public class ThreadPriority extends Thread {

	public ThreadPriority() {
		// TODO Auto-generated constructor stub
	}

	ThreadPriority(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread() + " " + i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Current Thread priority:" + Thread.currentThread().getPriority());

		// Thread.currentThread().setPriority(MAX_PRIORITY);
		// System.out.println("New Thread priority:" +
		// Thread.currentThread().getPriority());

		ThreadPriority p1 = new ThreadPriority("Thread p1");
		ThreadPriority p2 = new ThreadPriority("Thread p2");
		ThreadPriority p3 = new ThreadPriority("Thread p3");

		p1.setPriority(10);

		p1.start();
		p2.start();
		p3.start();

		System.gc();

	}

}
