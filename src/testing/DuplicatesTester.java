package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import logicAndUtility.ArrayDuplicates;

public class DuplicatesTester {

	@Test
	public void test1() {
		int data[] = {1, 1, 2, 5, 8, 2};
		int expected[] = { 1, 2 };
		assertEquals(expected.length, ArrayDuplicates.findDuplicates(data).length);
	}
	
	@Test
	public void test2() {
		int data[] = {1, 2, 3};
		assertEquals(0, ArrayDuplicates.findDuplicates(data).length);
	}
	
	@Test
	public void test3() {
		int data[] = {1};
		int expected[] = {1};
		assertEquals(expected.length, ArrayDuplicates.findDuplicates(data).length);
	}
	
	@Test
	public void test4() {
		int[] data = {};
		int[] expected = {};
		assertEquals(expected.length, ArrayDuplicates.findDuplicates(data).length);
	}
	
	@Test
	public void test5() {
		int data[] = {1, 1, 2, 5, 8, 2};
		assertEquals(4, ArrayDuplicates.removeDuplicates(data));
	}
	
	@Test
	public void test6() {
		int data[] = {1, 2, 3};
		assertEquals(3, ArrayDuplicates.removeDuplicates(data));
	}
	
	@Test
	public void test7() {
		int data[] = {1};
		assertEquals(1, ArrayDuplicates.removeDuplicates(data));
	}
	
	@Test
	public void test8() {
		int[] data = {};
		assertEquals(0, ArrayDuplicates.removeDuplicates(data));
	}

}
