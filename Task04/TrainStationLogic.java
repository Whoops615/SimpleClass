package by.htp.hame.main8.Task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainStationLogic {

	public static List<Train> sortNumberTrain(TrainStation trains) {

		List<Train> result = new ArrayList<Train>();

		result = trains.getTrains();
		Train min;
		Train temp = null;
		int index;

		for (int i = 0; i < result.size() - 1; i++) {

			min = result.get(i);
			index = i;
			for (int j = i; j < trains.getTrains().size(); j++) {
				if (min.getNumberTrain() > result.get(j).getNumberTrain()) {
					index = j;
					min = result.get(j);
				}
			}
			temp = result.get(i);
			result.set(i, min);
			result.set(index, temp);
		}

		return result;
	}

	public static Train infoTrain(TrainStation trains) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for (Train t : trains.getTrains()) {
			if (number == t.getNumberTrain()) {
				return t;
			}

		}
		return null;

	}

	public static List<Train> sortPlaceArrival(TrainStation trains) {

		List<Train> result = new ArrayList<Train>();

		result = trains.getTrains();
		Train min;
		Train temp = null;
		int index;

		for (int i = 0; i < result.size() - 1; i++) {

			min = result.get(i);
			index = i;
			for (int j = i; j < trains.getTrains().size(); j++) {
				String str1 = min.getPlaceOfArrival();
				String str2 = result.get(j).getPlaceOfArrival();

				if (str1.compareTo(str2) > 0) {
					index = j;
					min = result.get(j);
				}
			}
			temp = result.get(i);
			result.set(i, min);
			result.set(index, temp);
		}

		return result;
	}

	public static List<Train> sortDepartureTimeAndPlaceArrival(TrainStation trains) {

		List<Train> result = new ArrayList<Train>();

		result = trains.getTrains();
		Train min;
		Train temp = null;
		int index;

		for (int i = 0; i < result.size() - 1; i++) {

			min = result.get(i);
			index = i;
			for (int j = i; j < trains.getTrains().size(); j++) {
				String str1 = min.getPlaceOfArrival();
				String str2 = result.get(j).getPlaceOfArrival();

				if (str1.compareTo(str2) > 0) {
					index = j;
					min = result.get(j);
				} else if(str1.compareTo(str2) == 0) {
					if(TimeLogic.moreTime(min.getDepartureTime(), result.get(j).getDepartureTime())) {
						index = j;
						min = result.get(j);
					}
				}
			}
			temp = result.get(i);
			result.set(i, min);
			result.set(index, temp);
		}

		return result;

		
	}

}
