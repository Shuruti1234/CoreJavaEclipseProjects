package com.interthread;

public class User2 extends Thread {

	Account a;

	User2(Account a) {
		this.a = a;
	}

	public void run() {

		a.makeDeposit(1000);

	}

}
