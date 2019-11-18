package by.home.les08.main;

import java.util.List;

import by.home.les08.entity.Group;
import by.home.les08.entity.Student;
import by.home.les08.logic.GroupLogic;
import by.home.les08.view.StudentView;

public class Main {

	public static void main(String[] args) {

		Group studentsGroup = new Group();
		GroupLogic grLogic = new GroupLogic();
		StudentView view = new StudentView();
		
		
		studentsGroup.setStudents(new Student("Vishevaty", "A.D.", new int[] { 9, 8, 9, 10, 10 }));
		studentsGroup.setStudents(new Student("Ivanov", "S.S.", new int[] { 9, 9, 9, 10, 10 }));
		studentsGroup.setStudents(new Student("Petrov", "V.S.", new int[] { 9, 10, 7, 10, 10 }));
		studentsGroup.setStudents(new Student("Sidorov", "I.D.", new int[] { 9, 10, 10, 10, 10 }));
		studentsGroup.setStudents(new Student("Pushkin", "P.A.", new int[] { 9, 10, 10, 10, 10 }));
		studentsGroup.setStudents(new Student("Bogomolov", "A.D.", new int[] { 9, 10, 10, 10, 10 }));
		studentsGroup.setStudents(new Student("Zuk", "E.V.", new int[] { 9, 10, 10, 10, 10 }));
		studentsGroup.setStudents(new Student("Krab", "A.V.", new int[] { 9, 4, 10, 10, 10 }));
		studentsGroup.setStudents(new Student("Slon", "V.S.", new int[] { 9, 10, 10, 10, 10 }));
		studentsGroup.setStudents(new Student("Kuzmic", "R.A.", new int[] { 9, 10, 7, 10, 10 }));

		
		List<Student> listOfExcellentStudents = grLogic.takeExcellentStudents(studentsGroup);

		view.printExcellentStudents(studentsGroup.getGroupN(), listOfExcellentStudents);

	}
}