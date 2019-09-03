package by.htp.hame.main8.Task03;

public class StudentLogic {
	
	
	

	public boolean botanik(Student st) {

		for (int i : st.getMark()) {
			if (i < 9) {
				return false;
			}
		}
		return true;
	}

}
