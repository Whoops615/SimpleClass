package by.htp.hame.main8.Task08;

/*
 * 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerGroup c = new CustomerGroup();

		c.add(new Customer(45, "ddfghh", "adfg", "hsdfr", "rtyrty", 70, 66));
		c.add(new Customer(45, "ffghh", "bdfg", "hsdfr", "rtyrty", 50, 66));
		c.add(new Customer(45, "zdfghh", "cdfg", "hsdfr", "rtyrty", 55, 66));
		c.add(new Customer(45, "adfghh", "adfg", "hsdfr", "rtyrty", 60, 66));
		c.add(new Customer(45, "bcdfghh", "adfg", "hsdfr", "rtyrty", 25, 66));
		c.add(new Customer(45, "bdfghh", "adfg", "hsdfr", "rtyrty", 60, 66));
		c.add(new Customer(45, "abcdfghh", "adfg", "hsdfr", "rtyrty", 60, 66));
		c.add(new Customer(45, "aaafghh", "adfg", "hsdfr", "rtyrty", 30, 66));

		System.out.println("Список покупателей по алфавиту:");
		for (Customer ct : CustomerGroupLogic.alphabetOrder(c)) {
			print(ct);
		}
		System.out.println("Список покупателей с кредиткой в диапозоне 40-61:");
		for (Customer ct : CustomerGroupLogic.intervalCreditCard(c, 40, 61)) {
			print(ct);
		}

	}

	public static void print(Customer ct) {
		System.out.println(ct.getId() + " " + ct.getSurname() + " " + ct.getPatronymic() + " " + ct.getName() + " "
				+ ct.getCreditCardNumber() + " " + ct.getBankAccountNumber());
	}

}
