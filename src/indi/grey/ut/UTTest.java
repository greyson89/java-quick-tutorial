package indi.grey.ut;

import org.junit.Assert;
import org.junit.Test;

public class UTTest {
	@Test
	public void testAdd() {
		int a = 10;
		int b = 20;

		
		UT ut = new UT();
		int r = ut.add(a, b);
		Assert.assertTrue("相加不符合",a+b == r);
	}
}
