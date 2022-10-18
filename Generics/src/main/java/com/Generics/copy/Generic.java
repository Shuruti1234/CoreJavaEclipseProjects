package com.Generics.copy;

//generic class

public class Generic<T> { // T is the type of parameter

	T num1;
	T num2;

	public Generic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Generic(T num1, T num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public T getNum1() {
		return num1;
	}

	public void setNum1(T num1) {
		this.num1 = num1;
	}

	public T getNum2() {
		return num2;
	}

	public void setNum2(T num2) {
		this.num2 = num2;
	}

	void showType() {
		System.out.println("Type:" + num1.getClass().getName());
	}

}
