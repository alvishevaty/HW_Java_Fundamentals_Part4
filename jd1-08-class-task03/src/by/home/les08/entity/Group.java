package by.home.les08.entity;

import java.util.Arrays;

public class Group {

	private int groupN;
	private Student[] students;
	
	private static final int STUDENT_COUNT = 10;
	private static final int GROUP_NUMBER = 109;

	public Group() {
		groupN = GROUP_NUMBER;
		students = new Student[STUDENT_COUNT];
	}

	public int getGroupN() {
		return groupN;
	}

	public void setGroupN(int groupN) {
		this.groupN = groupN;
	}

	public Student[] getStudents() {
		return students;
	}

	private int count = 0;
	public void setStudents(Student students) {
		this.students[count] = students;
		count++;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupN;
		result = prime * result + Arrays.hashCode(students);
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
		if (groupN != other.groupN)
			return false;
		if (!Arrays.equals(students, other.students))
			return false;
		return true;
	}

}
