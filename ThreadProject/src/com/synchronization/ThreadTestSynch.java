package com.synchronization;

public class ThreadTestSynch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();

		MyThread3 t3 = new MyThread3();
		MyThread4 t4 = new MyThread4();

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
