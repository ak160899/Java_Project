package com.exerciseSet;

import java.util.Iterator;
import java.util.Scanner;

public class Library {

	String[] Books = new String[100];

	int noofBooks = 0;
	boolean b = true;

	Scanner in = new Scanner(System.in);

	private void addBook(String Book) {

		if (noofBooks == 99) {
			b = false;
		}
		this.Books[noofBooks] = Book;
		noofBooks++;
		System.out.println(noofBooks + ":" + Book);

	}

	private void issueBook(String bok) {

		for (int i = 0; i < Books.length; i++) {

			if (this.Books[i].equals(bok)) {
				System.out.println("book issued....");
				this.Books[i] = null;

				return;
			}

		}

	}

	private void showAvaiableBook() {
		System.out.println("avaiable books are:");
		for (String bk : Books) {
			if (bk == null) {
				continue;
			}
			System.out.println("" + bk);
		}
	}

	private void returnbook(String bk) {
		System.out.println("return book...");
		this.Books[noofBooks] = bk;

	}

	public static void main(String[] args) {
		Library obj = new Library();
		obj.addBook("java");
		obj.addBook("python");
		obj.addBook("c++");
		obj.addBook("algorithm");
		obj.showAvaiableBook();
		obj.issueBook("python");
		obj.showAvaiableBook();
		obj.returnbook("python");
		obj.showAvaiableBook();

	}
}
