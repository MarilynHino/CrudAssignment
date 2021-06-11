package com.studentdao.dao_to_api;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class StudentsDAO {

	ArrayList<Student> StudentclassRoom = new ArrayList<>();

	StudentsDAO() {
		System.out.println("Welcome to JAVA SDET Class");

		StudentclassRoom.add(new Student("Mina", "Benjamin", 5478, 548, 3, 15, "minaB@gmi.com"));
	}

	// CREATE New Student --> ADD
	public void addNewStudent(Student newStudent) {
		StudentclassRoom.add(newStudent);
	}

	// Add Student --> ADD
	public void addStudent(Student newStudent) {
		StudentclassRoom.add(newStudent);
	}

	// Remove Student --> ADD
	public void removeStudent(
			int removeId) {/*
							 * for (int i = 0; i < StudentclassRoom.size(); i++) { if
							 * (StudentclassRoom.isEmpty()) { System.out.println("The list is empty"); }
							 * else { for (Student stu : StudentclassRoom) { if (stu.getStudentId() ==
							 * removeId) { StudentclassRoom.remove(stu);
							 */
		StudentclassRoom.removeIf(t -> t.getStudentId() == removeId);
	}

	// Update Student --> ADD
	public void updateStudent(Student st, int updateId) {
		for (int j = 0; j < StudentclassRoom.size(); j++) {
			if (StudentclassRoom.isEmpty()) {
				System.out.println("The list is empty");
			} else {
				for (int i = 0; i < StudentclassRoom.size(); i++) {
					Student stu = StudentclassRoom.get(i);
					if (stu.getStudentId() == updateId) {
						StudentclassRoom.set(i, st);

					}
				}
			}
		}

	}

	// READ Students
	public ArrayList<Student> displayStudents() {
		if (StudentclassRoom.isEmpty()) {
			System.out.println("The list is empty");
		}
		return StudentclassRoom;
	}

}
