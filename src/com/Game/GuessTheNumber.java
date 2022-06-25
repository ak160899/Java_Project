package com.Game;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	int ran;
	int user;
	int guessnum = 0;

	public GuessTheNumber() {

		Random r = new Random();
		ran = r.nextInt(10);

	}

	private void taekUserInput() {
		System.out.print("please enter the gussing number from 1 to 10....");
		Scanner s = new Scanner(System.in);
		 user = s.nextInt();

	}

	public void setGuessnum(int guessnum) {
		this.guessnum = guessnum;
	}

	public int getGuessnum() {
		return guessnum;
	}

	private boolean isCorrectNumber() {

		if (ran == user) {
			guessnum++;

			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		GuessTheNumber gs = new GuessTheNumber();
		gs.taekUserInput();
		System.out.println(gs.isCorrectNumber()+("\ncomputer guess is:"+gs.ran));
		System.out.println("the guess count is:"+gs.guessnum);
	

	}
}
