package com.stevedutch.assignment10.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApiServiceTest {

	@Test
	void test_does_it_get_TheAPI_Key() {
		ApiService sut = new ApiService();
		String exspectedResult = sut.getKeyValue();
		System.out.println(exspectedResult);
	}

}
