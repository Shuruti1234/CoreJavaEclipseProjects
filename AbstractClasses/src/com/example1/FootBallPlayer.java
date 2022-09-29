package com.example1;

public class FootBallPlayer extends Player {

	@Override
	public boolean checkPlayer(Player p) {

		if (p.getAge() > 9)
			return true;
		else
			return false;

	}

}
