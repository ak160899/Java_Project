package com.PaperScisscor;

import java.util.Random;
import java.util.Scanner;

public class Papper__game {

	public static void main(String[] args) {
		int paper = 0, scissor = 1, rock = 2;

		Scanner s = new Scanner(System.in);

		Random m = new Random();
		int comp = m.nextInt(3);
		System.out.print("0.stone 1.scissor 2.rock:");
		int userinput = s.nextInt();
		if (comp == userinput) {
			System.out.println("the matches is Draw...");
		} else if (userinput == 2 && comp == 0 || userinput == 1 && comp == 0 || userinput == 2 && comp == 1) {
			System.out.println("you are win...");
		} else {
			System.out.println("computer won...");
		}
		System.out.println("computer input:" + comp);
	}
}
