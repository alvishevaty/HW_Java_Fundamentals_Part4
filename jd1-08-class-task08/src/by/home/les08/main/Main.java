package by.home.les08.main;

import java.util.ArrayList;
import java.util.List;

import by.home.les08.entity.Customer;
import by.home.les08.logic.CustomerLogic;
import by.home.les08.view.CustomerView;

public class Main {

	/*
	 * 8. Создать класс Customer, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль. Класс
	 * Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер
	 * банковского счета. Найти и вывести: a) список покупателей в алфавитном
	 * порядке; b) список покупателей, у которых номер кредитной карточки находится
	 * в заданном интервале
	 */

	public static void main(String[] args) {

		CustomerLogic customerLogic = new CustomerLogic();
		CustomerView customerView = new CustomerView();

		Customer customer1 = new Customer(001, "Vishevaty", "Alexey", "Dmitrievic", 123456789, 659875641);
		Customer customer2 = new Customer(002, "Ivanov", "Ivan", "Ivanovic", 345317538, 354985676);
		Customer customer3 = new Customer(003, "Kiselev", "Igor", "Egorvic", 742568134, 765234987);
		Customer customer4 = new Customer(004, "Ali", "Mohamed", "Mohamedovic", 550911008, 648932148);
		Customer customer5 = new Customer(005, "Putin", "Vladimir", "Vladimirovic", 958327475, 597563244);
		Customer customer6 = new Customer(006, "Mask", "Ilon", "Fatherson", 736428343, 876321456);
		Customer customer7 = new Customer(007, "Oreh", "Kirill", "Olegovic", 234858361, 654796324);

		List<Customer> customer = new ArrayList<>();
		customer.add(customer1);
		customer.add(customer2);
		customer.add(customer3);
		customer.add(customer4);
		customer.add(customer5);
		customer.add(customer6);
		customer.add(customer7);

		customerView.printCustomer(customerLogic.sortCustomer(customer));
		System.out.println("♦---------------------♦");
		int minCardNumber = customerView.setCardNumber();
		int maxCardNumber = customerView.setCardNumber();
		System.out.println("♦---------------------♦");
		customerView.printCustomersCardsInRange(customerLogic.customersCardNumberListInRange(customer, minCardNumber, maxCardNumber));

	}

}
