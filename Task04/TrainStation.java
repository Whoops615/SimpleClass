package by.htp.hame.main8.Task04;

import java.util.ArrayList;
import java.util.List;

public class TrainStation {

	public List<Train> trains;

	public TrainStation() {
		trains = new ArrayList<Train>();
	}

	public void add(Train newTrain) {
		trains.add(newTrain);
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}

	@Override
	public String toString() {
		return "TrainStation [trains=" + trains + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
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
		TrainStation other = (TrainStation) obj;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

}
