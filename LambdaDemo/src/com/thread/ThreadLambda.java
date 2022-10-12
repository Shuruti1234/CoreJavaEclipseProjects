package com.thread;

public class ThreadLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread with lambda

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " :thread is running");

			}

		};

		Thread t1 = new Thread(r1, "Shuruti");
		System.out.println("------------Without Lambda------------");
		t1.start();

		// Thread with lambda

		Runnable r2 = () -> {
			System.out.println(Thread.currentThread().getName() + " :thread is running");
		};

		Thread t2 = new Thread(r2, "ABC");
		System.out.println("------------With Lambda------------");
		t2.start();

	}

}
