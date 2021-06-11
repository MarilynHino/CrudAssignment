package com.studentdao.dao_to_api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaoApi {

	@Autowired
	StudentsDAO studentAPI = new StudentsDAO();
	ArrayList<Student> StudentclassRoom = new ArrayList<>();

	@GetMapping("/DisplayAllStudents") // This is just to read data
	public ArrayList<Student> displayStudents() {

		return studentAPI.displayStudents();

	}

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		studentAPI.addStudent(student);
		return student;
	}

	@PutMapping("/updateSt/{id}")
	public void updateSt(@RequestBody Student stu, @PathVariable int id) {

		studentAPI.updateStudent(stu, id);

	}

	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentAPI.removeStudent(id);

	}

}
