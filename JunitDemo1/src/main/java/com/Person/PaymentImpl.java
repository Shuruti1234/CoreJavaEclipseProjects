package com.Person;

public class PaymentImpl implements Payment {

	@Override
	public boolean payToPerson(String name) {
		// TODO Auto-generated method stub
		if (name.length() > 3)
			return true;
		else
			return false;
	}

}
