package by.htp.hame.main8.Task10;

import java.util.ArrayList;
import java.util.List;

public class AirlineGroup {

	private List<Airline> airlines;

	public AirlineGroup() {
		airlines = new ArrayList<Airline>();
	}

	public void add(Airline newAirline) {
		airlines.add(newAirline);
	}

	public Airline getAirline(int id) {
		return airlines.get(id);
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	@Override
	public String toString() {
		return "AirlineGroup [airlines=" + airlines + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirlineGroup other = (AirlineGroup) obj;
		if (airlines == null) {
			if (other.airlines != null)
				return false;
		} else if (!airlines.equals(other.airlines))
			return false;
		return true;
	}

}
