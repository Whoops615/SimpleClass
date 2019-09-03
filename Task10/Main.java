package by.htp.hame.main8.Task10;

import java.util.List;

/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Main {

	public static void main(String[] args) {

		AirlineGroup a1 = new AirlineGroup();

		a1.add(new Airline("Minsk", 737, "Boing", new Time(23, 45), "Monday"));
		a1.add(new Airline("Minsk", 737, "Boing", new Time(9, 45), "Monday"));
		a1.add(new Airline("Minsk", 737, "Boing", new Time(23, 0), "Tuesday"));
		a1.add(new Airline("Madrid", 737, "Boing", new Time(10, 5), "Monday"));
		a1.add(new Airline("Madrid", 737, "Boing", new Time(19, 45), "Monday"));
		a1.add(new Airline("Rome", 737, "Boing", new Time(11, 45), "Monday"));
		a1.add(new Airline("Rome", 737, "Boing", new Time(16, 45), "Tuesday"));

		AirlineGroupLogic agl = new AirlineGroupLogic();

		System.out.println("Рейсы до Рима:");
		print(agl.listPlaceOfArrival(a1, "Rome"));

		System.out.println("Рейсы в понедельник:");
		print(agl.listDay(a1, "Monday"));

		System.out.println("Рейсы в понедельник после 11:46");
		print(agl.listDayAndTime(a1, "Monday", new Time(11, 46)));

	}

	public static void print(List<Airline> list) {
		for (Airline a : list) {
			System.out.println(a.getPlaceOfArrival() + " " + a.getFligthNumber() + " " + a.getTypeAircraft() + " "
					+ a.getDepartureTime().getHour() + ":" + a.getDepartureTime().getMinute() + " " + a.getDay());

		}
		System.out.println("---------------------------");
	}

}
