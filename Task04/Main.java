package by.htp.hame.main8.Task04;

import java.util.List;

/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
быть упорядочены по времени отправления.
 */

public class Main {

	public static void main(String[] args) {

		TrainStation ts = new TrainStation();

		ts.add(new Train("Minsk", 658, new Time(2018, 3, 5, 8, 15)));
		ts.add(new Train("Minsk", 648, new Time(2018, 1, 11, 19, 45)));
		ts.add(new Train("Berlin", 638, new Time(2019, 4, 5, 7, 0)));
		ts.add(new Train("Berlin", 628, new Time(2018, 10, 5, 19, 22)));
		ts.add(new Train("Minsk", 358, new Time(2018, 9, 5, 18, 45)));
		ts.add(new Train("Borisov", 258, new Time(2018, 9, 8, 12, 50)));
		ts.add(new Train("Borisov", 158, new Time(2018, 6, 5, 13, 00)));
		ts.add(new Train("Minsk", 958, new Time(2018, 3, 7, 17, 30)));

		System.out.println("Введите номер поезда >>>");
		print1(TrainStationLogic.infoTrain(ts));

		System.out.println("Список поездов по номеру:");
		print(TrainStationLogic.sortNumberTrain(ts));

		System.out.println("Список по месту прибытия и времени отправления:");
		// print(TrainStationLogic.sortPlaceArrival(ts));

		print(TrainStationLogic.sortDepartureTimeAndPlaceArrival(ts));

	}

	public static void print(List<Train> list) {
		for (Train t : list) {
			System.out.println(t.getPlaceOfArrival() + " " + t.getNumberTrain() + " " + t.getDepartureTime().getDay()
					+ "." + t.getDepartureTime().getMount() + "." + t.getDepartureTime().getYear() + " "
					+ t.getDepartureTime().getHour() + ":" + t.getDepartureTime().getMinute());
		}
		System.out.println("------------------");

	}

	public static void print1(Train t) {
		System.out.println(t.getPlaceOfArrival() + " " + t.getNumberTrain() + " " + t.getDepartureTime().getYear() + "."
				+ t.getDepartureTime().getMount() + "." + t.getDepartureTime().getDay() + " "
				+ t.getDepartureTime().getHour() + ":" + t.getDepartureTime().getMinute());
		System.out.println("------------------");
	}

}
