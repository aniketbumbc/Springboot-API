package com.springboot.api.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	// http://localhost:8080/student
	// java object to json jackson internal library used by springboot mvc
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Aniket", "Buunny");
	}

	@GetMapping("/getStudents")
	public List<Student> getStudents() {

		List<Student> students = new ArrayList<>();

		students.add(new Student("Miket", "Yuum"));
		students.add(new Student("Masket", "Yuum"));
		students.add(new Student("Yaho", "Yuum"));
		students.add(new Student("Gorge", "Yuum"));

		return students;
	}
	
	
	// rest API using path variable
	@GetMapping("/singleStudent/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {

		return new Student(firstName, lastName);
	}
	
	
	// rest API using queryParams
		@GetMapping("/singleStudent")
		public Student studentQueryParams(@RequestParam(name = "firstName") String firstName, @RequestParam   (name = "lastname") String lastName) {
				return new Student(firstName, lastName);
		}

}
