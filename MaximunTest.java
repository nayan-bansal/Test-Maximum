package Maximum;

import org.junit.Test;
import org.junit.Assert;

public class MaximumTest {
	@Test
	public void testFirstPosition() {
		Integer max = Maximum.Max_number(50, 40, 10);
		boolean flag;
		if (max.equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testSecondPosition() {
		Integer max = Maximum.Max_number(40, 50, 10);
		boolean flag;
		if (max.equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testThirdPosition() {
		Integer max = Maximum.Max_number(10, 40, 50);
		boolean flag;
		if (max.equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}
}