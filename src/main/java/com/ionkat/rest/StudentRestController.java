package com.ionkat.rest;

import java.util.ArrayList;
import java.util.List;

import com.ionkat.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudents;
	
	// define @PostConstruct to load the student data ... only once!
	 {
		this.theStudents = new ArrayList<>();
		
		this.theStudents.add(new Student("Poornima", "Patel"));
		this.theStudents.add(new Student("Mario", "Rossi"));
		this.theStudents.add(new Student("Mary", "Smith"));
	}
	
	
	
	// define endpoint for "/students" - return list of students
	@GetMapping("/students")
	public List<Student> getStudents() {
			
		return theStudents;
	}
	
	// define endpoint for "/students/{studentId}" - return student at index
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if ( (studentId >= theStudents.size()) || (studentId < 0) ) {			
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}

		return theStudents.get(studentId);
		
	}
}









