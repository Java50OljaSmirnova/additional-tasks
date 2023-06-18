package telran.additional.test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static telran.additional.AdditionalTasks.*;

public class AdditionalTests {

	@Test
	void isAnagramTest() {
		String str1 = "HEART";
		String str2 = "earth";
		String str3 = "TRIANGLE";
		String str4 = "INTEGRAL";
		assertTrue(isAnagram(str1, str2));
		assertTrue(isAnagram(str3, str4));
		assertFalse(isAnagram(str1, str3));
	}
	@Test
	void hasValidBracketsTest() {
		String str1 =  "aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd )";
		String str2 = ")dfgswfgsf(";
		String str3 = "[werwert(wertwrtw] wertrt)";
		assertTrue(hasValidBrackets(str1));
		assertFalse(hasValidBrackets(str2));
		assertFalse(hasValidBrackets(str3));
	}
}
