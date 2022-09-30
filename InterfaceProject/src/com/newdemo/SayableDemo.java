package com.newdemo;

public class SayableDemo implements Sayable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayable s1 = new SayableDemo();
		s1.say();
		s1.saySomething();

	}

	@Override
	public void say() {
		System.out.println("-----I am OK--------");
	}

}
