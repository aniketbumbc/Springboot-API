package com.springboot.api.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	// http://localhost:8080/student
	// java object to json jackson internal library used by springboot mvc
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Aniket", "Buunny");
	}

}
