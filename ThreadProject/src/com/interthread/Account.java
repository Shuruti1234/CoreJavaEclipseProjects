package com.interthread;

public class Account {

	private int balance = 500;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {

		balance = balance - amount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	synchronized void makeWithdrawal(int amt) {
		if (getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + "  is going to withdraw " + amt);
			withdraw(amt);
			System.out.println(Thread.currentThread().getName() + "  has withdrawn " + amt);
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	synchronized void makeDeposit(int amt) {

		System.out.println(Thread.currentThread().getName() + "  is going to deposit " + amt);
		deposit(amt);
		System.out.println(" Current Balance is" + getBalance());
		notifyAll();

	}

}
