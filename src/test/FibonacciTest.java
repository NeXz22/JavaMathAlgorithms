package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import misc.Fibonacci;

class FibonacciTest {

	@Test()
	void testFibonacciWithNegative() {
		assertEquals(0, Fibonacci.f(-1));
	}
	
	@Test()
	void testFibonacciWithZero() {
		assertEquals(0, Fibonacci.f(0));
	}

	@Test()
	void testFibonacciWithOne() {
		assertEquals(1, Fibonacci.f(1));
	}
	
	@Test()
	void testFibonacciWithTwo() {
		assertEquals(1, Fibonacci.f(2));
	}
	
	@Test()
	void testFibonacciWithThree() {
		assertEquals(2, Fibonacci.f(3));
	}

}
