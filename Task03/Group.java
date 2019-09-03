package by.htp.hame.main8.Task03;

import java.util.ArrayList;
import java.util.List;

public class Group {

	public List<Student> students;
	public int numberGroup;

	public Group(int numberGroup) {
		students = new ArrayList<Student>();
		this.numberGroup = numberGroup;

	}

	public void add(Student newStudent) {
		newStudent.setNumberGroup(numberGroup);
		students.add(newStudent);

	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getNumberGroup() {
		return numberGroup;
	}

	public void setNumberGroup(int numberGroup) {
		this.numberGroup = numberGroup;
	}

	public List<Student> getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return "Group [students=" + students + ", numberGroup=" + numberGroup + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberGroup;
		result = prime * result + ((students == null) ? 0 : students.hashCode());
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
		Group other = (Group) obj;
		if (numberGroup != other.numberGroup)
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}

}
