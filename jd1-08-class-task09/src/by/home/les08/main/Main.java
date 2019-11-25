package by.home.les08.main;

import java.util.ArrayList;
import java.util.List;

import by.home.les08.entity.Book;
import by.home.les08.logic.BookLogic;
import by.home.les08.view.BookView;

public class Main {

	public static void main(String[] args) {

		/*
		 * 9. Создать класс Book, спецификация которого приведена ниже. Определить
		 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
		 * агрегирующий массив типа Book, с подходящими конструкторами и методами.
		 * Задать критерии выбора данных и вывести эти данные на консоль. Book: id,
		 * название, автор(ы), издательство, год издания, количество страниц, цена, тип
		 * переплета. Найти и вывести: a) список книг заданного автора; b) список книг,
		 * выпущенных заданным издательством; c) список книг, выпущенных после заданного
		 * года.
		 */

		BookView bookView = new BookView();
		BookLogic bookLogic = new BookLogic();

		Book book1 = new Book(1, "451 градус по Фаренгейту", "Р.Бредбери", "Эксмо", 2017, 256, 7.15, "Мягкий");
		Book book2 = new Book(2, "Цветы для Элджернона", "Д.Киз", "Эксмо", 2016, 320, 7.15, "Мягкий");
		Book book3 = new Book(3, "Вино из одуванчиков", "Р.Бредбери", "Эксмо", 2017, 352, 8.17, "Мягкий");
		Book book4 = new Book(4, "Происхождение", "Д.Браун", "АСТ", 2017, 576, 21.47, "Твердый");
		Book book5 = new Book(5, "Код да Винчи", "Д.Браун", "АСТ", 2013, 544, 30.67, "Твердый");

		List<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);

		bookView.printBook("Список книг заданного автора: ",
				bookLogic.findBookWithEqualAuthor(bookList, bookView.writeAuthorName()));
		System.out.println("♦-----------------♦");
		bookView.printBook("Список книг заданного издательства: ",
				bookLogic.findBookWithEqualPublisher(bookList, bookView.writePublisherName()));
		System.out.println("♦-----------------♦");
		bookView.printBook("Список книг начиная с заданного года: ",
				bookLogic.findBookFromYear(bookList, bookView.writeYear()));
	}

}
