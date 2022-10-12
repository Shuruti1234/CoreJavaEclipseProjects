package com.bank;

public class MyAccount implements Runnable {

	private Account acc = new Account();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyAccount a1 = new MyAccount();
		Thread t1 = new Thread(a1, "Prithwish");
		Thread t2 = new Thread(a1, "Pooja");

		t1.start();
		t2.start();

	}

	synchronized void makeWithdrawal(int amt) {
		if (acc.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + "  is going to withdraw " + amt);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + "  has withdrawn " + amt);
		} else {
			System.out.println(Thread.currentThread().getName() + "  is not having enough balance to withdraw " + amt);
			System.out.println("The balance is" + acc.getBalance());
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		makeWithdrawal(400);
		if (acc.getBalance() < 0) {
			System.out.println("Amount is overdrawn");
		}

	}

}
