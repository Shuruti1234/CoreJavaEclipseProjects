package com.interthread;

public class MyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		User1 t1 = new User1(acc);
		User2 t2 = new User2(acc);

		t1.start();
		t2.start();
	}

}
