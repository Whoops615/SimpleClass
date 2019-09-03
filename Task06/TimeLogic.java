package by.htp.hame.main8.Task06;

public class TimeLogic {

	public static int checkHour(int hour) {

		if (hour >= 0 & hour < 24) {

		} else {
			hour = 0;
		}

		return hour;
	}

	public static int checkMinOrSec(int minOrsec) {

		if (minOrsec >= 0 & minOrsec < 60) {

		} else {
			minOrsec = 0;
		}

		return minOrsec;
	}

	public Time changeTime(Time t, int hour, int minute, int second) {

		int changeSecond;
		int changeMinute;
		int changeHour;

		changeSecond = (t.getSecond() + second) % 60;
		changeMinute = (t.getMinute() + (t.getSecond() + second) / 60 + minute) % 60;
		changeHour = (t.getHour() + ((t.getMinute() + (t.getSecond() + second) / 60)) / 60 + hour) % 24;

		t.setSecond(changeSecond);
		t.setMinute(changeMinute);
		t.setHour(changeHour);

		return t;
	}

}
