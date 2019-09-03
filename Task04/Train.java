package by.htp.hame.main8.Task04;

public class Train {

	private String placeOfArrival;
	private int numberTrain;
	private Time departureTime;

	public Train(String placeOfArrival, int numberTrain,Time departureTime) {
		this.placeOfArrival = placeOfArrival;
		this.numberTrain = numberTrain;
		this.departureTime = departureTime;
	}
	
	public Train() {
		
	}

	public String getPlaceOfArrival() {
		return placeOfArrival;
	}

	public void setPlaceOfArrival(String placeOfArrival) {
		this.placeOfArrival = placeOfArrival;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}



	@Override
	public String toString() {
		return "Train [placeOfArrival=" + placeOfArrival + ", numberTrain=" + numberTrain + ", departureTime="
				+ departureTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + numberTrain;
		result = prime * result + ((placeOfArrival == null) ? 0 : placeOfArrival.hashCode());
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
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (numberTrain != other.numberTrain)
			return false;
		if (placeOfArrival == null) {
			if (other.placeOfArrival != null)
				return false;
		} else if (!placeOfArrival.equals(other.placeOfArrival))
			return false;
		return true;
	}

}
