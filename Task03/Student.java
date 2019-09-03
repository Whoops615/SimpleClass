package by.htp.hame.main8.Task03;

import java.util.Arrays;

public class Student {

	private String name;
	private int[] mark;
	private int NumberGroup;

	public Student(String name, int[] mark) {
		this.name = name;
		this.mark = mark;
	}

	public Student() {

	}

	public int getNumberGroup() {
		return NumberGroup;
	}

	public void setNumberGroup(int numberGroup) {
		NumberGroup = numberGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMark() {
		return mark;
	}

	public void setMark(int[] mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + Arrays.toString(mark) + ", NumberGroup=" + NumberGroup + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + NumberGroup;
		result = prime * result + Arrays.hashCode(mark);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (NumberGroup != other.NumberGroup)
			return false;
		if (!Arrays.equals(mark, other.mark))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
