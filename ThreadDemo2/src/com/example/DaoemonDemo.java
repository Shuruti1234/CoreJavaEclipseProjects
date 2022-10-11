package com.example;

public class DaoemonDemo extends Thread {

	public void run() {

		if (Thread.currentThread().isDaemon())
			System.out.println(Thread.currentThread().getName() + "  : Daemon thread working........."
					+ Thread.currentThread().getPriority());
		else
			System.out.println(Thread.currentThread().getName() + "  :User thread working........."
					+ Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoemonDemo d1 = new DaoemonDemo();
		DaoemonDemo d2 = new DaoemonDemo();
		DaoemonDemo d3 = new DaoemonDemo();

		d1.setDaemon(true);
		d1.start();

		// d1.setDaemon(true); // Illegal State
		d2.start();
		d3.start();

	}

}
