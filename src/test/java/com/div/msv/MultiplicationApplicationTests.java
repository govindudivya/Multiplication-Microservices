package com.div.msv;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.div.msv.domain.Multiplication;
import com.div.msv.service.MultiplicationService;
import com.div.msv.service.RandomGeneratorService;

@SpringBootTest
class MultiplicationApplicationTests {

	@MockBean
	private RandomGeneratorService randomGeneratorService;
	@Autowired
	private MultiplicationService multiplicationService;
	
	@Test
	 public void createRandomMultiplicationTest() {
	 
	 Multiplication multiplication = multiplicationService.
	createRandomMultiplication();
	 // then
	 assertThat(multiplication.getFactorA()).isEqualTo(50);
	 assertThat(multiplication.getFactorB()).isEqualTo(30);
	 assertThat(multiplication.getResult()).isEqualTo(1500);
	 
	}
}
