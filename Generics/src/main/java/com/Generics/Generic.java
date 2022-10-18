package com.Generics;

public class Generic<T> { // T is the type of parameter

	T ob;

	public Generic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Generic(T ob) {
		super();
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	void showType() {
		System.out.println("Type:" + ob.getClass().getName());
	}

}
