package by.htp.hame.main8.Task04;

public class TimeLogic {

	public static boolean moreTime(Time t1, Time t2) {

		if (t1.getYear() > t2.getYear()) {
			return true;
		} else if (t1.getYear() == t2.getYear()) {
			if (t1.getMount() > t2.getMount()) {
				return true;
			} else if (t1.getMount() == t2.getMount()) {
				if (t1.getDay() > t2.getDay()) {
					return true;
				} else if (t1.getDay() == t2.getDay()) {
					if (t1.getHour() > t2.getHour()) {
						return true;
					} else if (t1.getHour() == t2.getHour()) {
						if (t1.getMinute() > t2.getMinute()) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}

}
