package by.htp.hame.main8.Task10;

import java.util.ArrayList;
import java.util.List;

public class AirlineGroupLogic {

	public List<Airline> listPlaceOfArrival(AirlineGroup alg, String placeOfArrival) {

		List<Airline> result = new ArrayList<Airline>();

		for (Airline a : alg.getAirlines()) {
			if (a.getPlaceOfArrival().compareTo(placeOfArrival) == 0) {
				result.add(a);
			}
		}

		return result;
	}

	public List<Airline> listDay(AirlineGroup alg, String day) {

		List<Airline> result = new ArrayList<Airline>();

		for (Airline a : alg.getAirlines()) {
			if (a.getDay().compareTo(day) == 0) {
				result.add(a);
			}
		}

		return result;
	}

	public List<Airline> listDayAndTime(AirlineGroup alg, String day, Time t) {

		List<Airline> result = new ArrayList<Airline>();
		for (Airline a : listDay(alg, day)) {
			if (TimeLogic.moreTime(a.getDepartureTime(), t)) {
				result.add(a);
			}
		}

		return result;
	}

}
