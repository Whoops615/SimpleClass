package by.htp.hame.main8.Task10;

public class Airline {

	private String placeOfArrival;
	private int fligthNumber;
	private String typeAircraft;
	private Time departureTime;
	private String day;

	public Airline(String placeOfArrival, int fligthNumber, String typeAircraft, Time departureTime, String day) {
		super();
		this.placeOfArrival = placeOfArrival;
		this.fligthNumber = fligthNumber;
		this.typeAircraft = typeAircraft;
		this.departureTime = departureTime;
		this.day = day;
	}

	public Airline() {

	}

	public String getPlaceOfArrival() {
		return placeOfArrival;
	}

	public void setPlaceOfArrival(String placeOfArrival) {
		this.placeOfArrival = placeOfArrival;
	}

	public int getFligthNumber() {
		return fligthNumber;
	}

	public void setFligthNumber(int fligthNumber) {
		this.fligthNumber = fligthNumber;
	}

	public String getTypeAircraft() {
		return typeAircraft;
	}

	public void setTypeAircraft(String typeAircraft) {
		this.typeAircraft = typeAircraft;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + fligthNumber;
		result = prime * result + ((placeOfArrival == null) ? 0 : placeOfArrival.hashCode());
		result = prime * result + ((typeAircraft == null) ? 0 : typeAircraft.hashCode());
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
		Airline other = (Airline) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (fligthNumber != other.fligthNumber)
			return false;
		if (placeOfArrival == null) {
			if (other.placeOfArrival != null)
				return false;
		} else if (!placeOfArrival.equals(other.placeOfArrival))
			return false;
		if (typeAircraft == null) {
			if (other.typeAircraft != null)
				return false;
		} else if (!typeAircraft.equals(other.typeAircraft))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [placeOfArrival=" + placeOfArrival + ", fligthNumber=" + fligthNumber + ", typeAircraft="
				+ typeAircraft + ", departureTime=" + departureTime + ", day=" + day + "]";
	}

}
