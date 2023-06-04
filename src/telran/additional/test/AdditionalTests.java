package telran.additional.test;

import org.junit.jupiter.api.Test;

import telran.additional.AdditionalTasks;

import static org.junit.jupiter.api.Assertions.*;


class AdditionalTest {

	@Test
	void maxSubsequenceLengthTest() {
		int [] arr = {1, 3, 3, 2, 8, 8, 8, 5, 6, 6};
		int [] arr1 = new int[0];
		int [] arr2 = {1, 10, 10, 3, 5, 5, 8, 6, 6, 6, 6};
		int [] arr3 = {5, 5, 5, 5, 5, 5, 5, 1, 8, 3, 3, 3, 3, 9};
		assertEquals(3, AdditionalTasks.maxSubsequenceLength(arr));
		assertEquals(0, AdditionalTasks.maxSubsequenceLength(arr1));
		assertEquals(4, AdditionalTasks.maxSubsequenceLength(arr2));
		assertEquals(7, AdditionalTasks.maxSubsequenceLength(arr3));
	}
	@Test
	void toBinaryStrTest() {
		int num = 256;
		assertEquals(Integer.toBinaryString(num), AdditionalTasks.toBinaryStr(num));
		num = 0;
		assertEquals(Integer.toBinaryString(num), AdditionalTasks.toBinaryStr(num));
		num = 27640;
		assertEquals(Integer.toBinaryString(num), AdditionalTasks.toBinaryStr(num));
		num = 178937;
		assertEquals(Integer.toBinaryString(num), AdditionalTasks.toBinaryStr(num));
	}
}
