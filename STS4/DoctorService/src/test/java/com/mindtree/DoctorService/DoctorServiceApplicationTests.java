package com.mindtree.DoctorService;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.DoctorService.Controller.DoctorController;

@SpringBootTest
class DoctorServiceApplicationTests {
	@Autowired
	DoctorController doctorController;

	@Test
	void allDoctor() {
		assertThat(doctorController.getAllDoctor()).isNotEmpty();
	}

}
