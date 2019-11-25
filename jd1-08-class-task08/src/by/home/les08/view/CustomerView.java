package by.home.les08.view;

import java.util.List;
import java.util.Scanner;

import by.home.les08.entity.Customer;

public class CustomerView {

	public void printCustomer(List<Customer> customer) {
		System.out.println("Вывод покупателей в алфавитном порядке: ");
		for (int i = 0; i < customer.size(); i++) {

			System.out.println(customer.get(i).getId() + " " + customer.get(i).getSurname() + " "
					+ customer.get(i).getName() + " " + customer.get(i).getPatronymic());
			System.out.println("\t Card number: " + customer.get(i).getCardNumber());
			System.out.println("\t Bank Account Number: " + customer.get(i).getBankAccountNumber());
		}
	}

	public int setCardNumber() {

		int cardNumber = 0;
		System.out.print("Введте номер карты: ");
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("Поторите ввод номера карты: ");
		}
		cardNumber = sc.nextInt();
		return cardNumber;
	}
	
	public void printCustomersCardsInRange(List<Customer> customer) {
		System.out.println("Вывод покупателей с номером карты в заданном диапазоне: ");
		for (int i = 0; i < customer.size(); i++) {

			System.out.println(customer.get(i).getId() + " " + customer.get(i).getSurname() + " "
					+ customer.get(i).getName() + " " + customer.get(i).getPatronymic());
			System.out.println("\t Card number: " + customer.get(i).getCardNumber());
			System.out.println("\t Bank Account Number: " + customer.get(i).getBankAccountNumber());
		}
	}

}
