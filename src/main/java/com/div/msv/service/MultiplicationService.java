package com.div.msv.service;

import com.div.msv.domain.Multiplication;

public interface MultiplicationService {
	
	/**
	 * Creates a Multiplication object with two randomlygenerated factors
	 * between 11 and 99.
	 *
	 * @return a Multiplication object with random factors
	 */
	 Multiplication createRandomMultiplication();

}
