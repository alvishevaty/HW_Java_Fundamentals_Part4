package by.home.les08.logic;

import java.util.ArrayList;
import java.util.List;

import by.home.les08.entity.Customer;

public class CustomerLogic {

	Customer customer = new Customer();

	public List<Customer> sortCustomer(List<Customer> customer) {

		for (int i = 0; i < customer.size(); i++) {

			for (int j = 0; j < customer.size() - i - 1; j++) {

				if (customer.get(j).getSurname().compareTo(customer.get(j + 1).getSurname()) > 0) {

					Customer temp = customer.get(j + 1);
					customer.set(j + 1, customer.get(j));
					customer.set((j), temp);
				}
			}
		}
		return customer;
	}

	public List<Customer> customersCardNumberListInRange(List<Customer> customer, int firstCardNumber,
			int secondCardNumber) {

		final List<Customer> customersCardNumberInRange = new ArrayList<>();

		for (int i = 0; i < customer.size(); i++) {
			if (firstCardNumber >= secondCardNumber) {
				if (customer.get(i).getCardNumber() <= firstCardNumber
						& customer.get(i).getCardNumber() >= secondCardNumber) {
					customersCardNumberInRange.add(customer.get(i));
				}
			} else if (firstCardNumber < secondCardNumber) {
				if (customer.get(i).getCardNumber() >= firstCardNumber
						& customer.get(i).getCardNumber() <= secondCardNumber) {
					customersCardNumberInRange.add(customer.get(i));
				}
			}
		}
		return customersCardNumberInRange;
	}
}
