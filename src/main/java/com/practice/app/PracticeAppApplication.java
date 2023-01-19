package com.practice.app;

import com.practice.app.controller.PracticeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeAppApplication {

//	@Autowired
//	PracticeController practiceController;
	public static void main(String[] args) {

		SpringApplication.run(PracticeAppApplication.class, args);
		PracticeController practiceController = new PracticeController();
		practiceController.duplicates();
	}

}
