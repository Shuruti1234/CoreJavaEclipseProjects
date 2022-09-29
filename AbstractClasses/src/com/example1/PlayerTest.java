package com.example1;

import java.util.Scanner;

public class PlayerTest {

	static void callPlayer(Player p) {

		boolean status;

		status = p.checkPlayer(p);
		if (status)
			System.out.println(p.getName() + " of age :" + p.getAge() + " is allowed to play ");
		else
			System.out.println(p.getName() + " of age :" + p.getAge() + "  is not allowed to play ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FootBallPlayer fp = new FootBallPlayer();
		System.out.println("FootBall:");
		System.out.println("Enter the name:");
		fp.setName(sc.next());
		System.out.println("Enter the age:");
		fp.setAge(sc.nextInt());
		callPlayer(fp);

		HockeyPlayer hp = new HockeyPlayer();
		System.out.println("Hockey:");
		System.out.println("Enter the name:");
		hp.setName(sc.next());
		System.out.println("Enter the age:");
		hp.setAge(sc.nextInt());
		callPlayer(hp);

		sc.close();
	}

}
