package by.htp.hame.main8.Task03;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {

	public List<Student> botaniks(Group group) {

		StudentLogic stlogic = new StudentLogic();
		List<Student> result = new ArrayList<Student>();

		for (Student st : group.getStudents()) {
			if (stlogic.botanik(st)) {
				result.add(st);
			}
		}

		return result;
	}

}
