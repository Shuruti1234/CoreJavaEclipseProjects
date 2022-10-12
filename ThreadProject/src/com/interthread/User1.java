package com.interthread;

public class User1 extends Thread {

	Account a;

	User1(Account a) {
		this.a = a;
	}

	public void run() {

		a.makeWithdrawal(1000);

	}

}
