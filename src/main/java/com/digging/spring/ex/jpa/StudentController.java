package com.digging.spring.ex.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.digging.spring.ex.jpa.domain.Student;

@Controller
public class StudentController {

	@ResponseBody
	@GetMapping("/jpa/lombok")
	public Student lombokTest() {
		
//		Student student = new Student(4, "김인규", "010-1234-5678", "lecture@hagulu.com", "프로그래머", null, null);
//		student.setDeamJob("강사");
//		student.setPhoneNumber("010-1111-2222");
		
		// builder 패턴
		Student student = Student.builder()
				.name("김인규")
				.phoneNumber("010-1234-5678")
				.email("lecture@hagulu.com")
				.deamJob("프로그래머")
				.build();
		
		return student;
	}
	
}
