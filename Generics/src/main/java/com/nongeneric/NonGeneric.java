package com.nongeneric;

public class NonGeneric {

	Object ob;

	public NonGeneric() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NonGeneric(Object ob) {
		super();
		this.ob = ob;
	}

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}

	void showType() {
		System.out.println("Type:" + ob.getClass().getName());
	}

}
