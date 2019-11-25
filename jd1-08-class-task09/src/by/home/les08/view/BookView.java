package by.home.les08.view;

import java.util.List;
import java.util.Scanner;

import by.home.les08.entity.Book;

public class BookView {

	public String writeAuthorName() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Write author name: ");
		String name = sc.next();
		return name;
	}

	public String writePublisherName() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Write publisher name: ");
		String name = sc.next();
		return name;
	}

	public int writeYear() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Write first year: ");

		while (sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("Write first year: ");
		}

		int year = sc.nextInt();
		return year;
	}

	public void printBook(String name, List<Book> bookArray) {
		
		System.out.println(name);

		for (int i = 0; i < bookArray.size(); i++) {

			System.out.print(bookArray.get(i).getId() + ".");
			System.out.print(" \"" + bookArray.get(i).getTitle() + "\"");
			System.out.print("\t" + bookArray.get(i).getAuthor());
			System.out.println("\t" + bookArray.get(i).getPublicationYear() + " год");
			System.out.println("\t" + "Издательство \"" + bookArray.get(i).getPublisher() + "\"");
			System.out.println("\t" + bookArray.get(i).getListNumber() + " страниц");
			System.out.println("\t" + bookArray.get(i).getCost() + " рублей");
			System.out.println("\t" + bookArray.get(i).getCover() + " переплет");
		}
	}
}
