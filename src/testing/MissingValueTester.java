package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import logicAndUtility.CheckIfMissing;

public class MissingValueTester {

	@Test
	public void test1() {
		int data1[] = {1, 2, 3, 4, 5};
		int data2[] = {2, 3, 1, 0, 5};
		assertEquals(4, CheckIfMissing.lookForMissingValue(data1, data2));
	}
	
	@Test
	public void test2() {
		int data1[] = {1, 2, 3};
		int data2[] = {1, 2, 3};
		assertEquals(-1, CheckIfMissing.lookForMissingValue(data1, data2));
	}
	
	@Test
	public void test3() {
		int data1[] = {1};
		int data2[] = {0};
		assertEquals(1, CheckIfMissing.lookForMissingValue(data1, data2));
	}
	
	@Test
	public void test4() {
		int data1[] = {};
		int data2[] = {};
		assertEquals(-1, CheckIfMissing.lookForMissingValue(data1, data2));
	}

}
