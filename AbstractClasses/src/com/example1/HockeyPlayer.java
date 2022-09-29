package com.example1;

public class HockeyPlayer extends Player {

	@Override
	public boolean checkPlayer(Player p) {

		if (p.getAge() > 12)
			return true;
		else
			return false;

	}

}
