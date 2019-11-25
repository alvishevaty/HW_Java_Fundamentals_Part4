package by.home.les08.logic;

import java.util.ArrayList;
import java.util.List;

import by.home.les08.entity.Book;

public class BookLogic {

	public List<Book> findBookWithEqualAuthor(List<Book> bookArray, String authorName) {

		List<Book> bookWithEqualAuthor = new ArrayList<Book>();
		for (int i = 0; i < bookArray.size(); i++) {
			if (bookArray.get(i).getAuthor().compareTo(authorName) == 0) {
				bookWithEqualAuthor.add(bookArray.get(i));
			}
		}
		return bookWithEqualAuthor;
	}

	public List<Book> findBookWithEqualPublisher(List<Book> bookArray, String publisherName) {

		List<Book> bookWithEqualPublisher = new ArrayList<Book>();
		for (int i = 0; i < bookArray.size(); i++) {
			if (bookArray.get(i).getPublisher().compareTo(publisherName) == 0) {
				bookWithEqualPublisher.add(bookArray.get(i));
			}
		}
		return bookWithEqualPublisher;
	}

	public List<Book> findBookFromYear(List<Book> bookArray, int year) {

		List<Book> bookFromYear = new ArrayList<Book>();
		for (int i = 0; i < bookArray.size(); i++) {
			if (bookArray.get(i).getPublicationYear() >= year) {
				bookFromYear.add(bookArray.get(i));
			}
		}
		return bookFromYear;
	}

}
