package string.problems;

import org.junit.Test;
import org.junit.Assert;

public class UniqueCharUtilTester {

	@Test
	public void testHasAllUniqueCharsCaseSensitive() {
		String input1 = "AbcaD32";
		String input2 = "AbcaD32A";
		Assert.assertEquals(UniqueCharsUtil.hasAllUniqueCharsCaseSensitive(input1), true);
		Assert.assertEquals(UniqueCharsUtil.hasAllUniqueCharsCaseSensitive(input2), false);
	}
	
	@Test
	public void testHasAllUniqueCharsCaseInsensitive() {
		String input1 = "AbcaD32A";
		String input2 = "AbcaD32";
		String input3 = "AbcDeFghijklmnopQRsTuVwXYz";
		Assert.assertEquals(UniqueCharsUtil.hasAllUniqueCharsCaseInsensitive(input1), false);
		Assert.assertEquals(UniqueCharsUtil.hasAllUniqueCharsCaseInsensitive(input2), false);
		Assert.assertEquals(UniqueCharsUtil.hasAllUniqueCharsCaseInsensitive(input3), true);
	}
}
