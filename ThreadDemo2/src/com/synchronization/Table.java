package com.synchronization;

//without synchronization
public class Table {

	// resource
	synchronized void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
