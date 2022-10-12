package com.synchronization;

//static synchronization
public class Table {

	// resource
	static synchronized void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
