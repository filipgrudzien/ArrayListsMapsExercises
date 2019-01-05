package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import logicAndUtility.MinAndMax;

public class MinMaxTester {

	@Test
	public void test1() {
		int data[] = {1, 1, 2, 5, 8, 2};
		int expected[] = {1, 8};
		assertEquals(true, MinAndMax.compareArrays(expected, MinAndMax.findOutliers(data)));
	}
	
	@Test
	public void test2() {
		int data[] = {};
		int expected[] = {};
		assertEquals(true, MinAndMax.compareArrays(expected, MinAndMax.findOutliers(data)));
	}
	
	@Test
	public void test3() {
		int data[] = {1};
		int expected[] = {1};
		assertEquals(true, MinAndMax.compareArrays(expected, MinAndMax.findOutliers(data)));
	}
	
	@Test
	public void test4() {
		int data[] = {8, 8};
		int expected[] = {8};
		assertEquals(true, MinAndMax.compareArrays(expected, MinAndMax.findOutliers(data)));
	}
	
	@Test
	public void test5() {
		int data[] = {1, 2, 3};
		int expected[] = {1,2};
		assertEquals(false, MinAndMax.compareArrays(expected, MinAndMax.findOutliers(data)));
	}

}
