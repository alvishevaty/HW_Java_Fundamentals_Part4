package by.home.les08.view;

import java.util.List;

import by.home.les08.entity.Group;
import by.home.les08.entity.Student;
import by.home.les08.logic.GroupLogic;

public class StudentView {

	GroupLogic grLogic = new GroupLogic();
	Group group = new Group();

	public void printExcellentStudents(int groupNumber, List<Student> students) {

		System.out.println("Студенты отличники: ");

		int count = 1;

		for (int i = 0; i < students.size(); i++, count++) {

			System.out.print(count + ". ");
			System.out.print("\t" + students.get(i).getSurname() + " " + students.get(i).getInitials());
			System.out.print("\t" + "Группа номер: ");
			System.out.print("\t" + groupNumber + ";");
			System.out.println();
		}

	}

}