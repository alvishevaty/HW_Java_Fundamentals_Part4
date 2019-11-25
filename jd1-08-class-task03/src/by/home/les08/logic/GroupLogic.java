package by.home.les08.logic;

import java.util.ArrayList;
import java.util.List;

import by.home.les08.entity.Group;
import by.home.les08.entity.Student;

public class GroupLogic {

	private StudentLogic studentLogic = new StudentLogic();

	public List<Student> takeExcellentStudents(Group group) {

		List<Student> result = new ArrayList<Student>();

		int j = 0;
		for (int i = 0; i < group.getStudents().length; i++) {
			
			if (studentLogic.isExcellentStudent(group.getStudents()[i])) {
				result.add(group.getStudents()[i]);
				j++;
			}
		}

		if (j != 0) {
			return result;
		} else {
			return null;
		}

	}
}
