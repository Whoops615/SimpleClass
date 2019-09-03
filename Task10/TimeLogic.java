package by.htp.hame.main8.Task10;

public class TimeLogic {

	public static boolean moreTime(Time t1, Time t2) {

		if (t1.getHour() > t2.getHour()) {
			return true;
		} else if (t1.getHour() == t2.getHour()) {
			if (t1.getMinute() > t2.getMinute()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
