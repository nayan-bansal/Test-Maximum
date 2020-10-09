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
	public void testFirstPositionFloat() {
		Float max = Maximum.Max_number_float(50.5f, 40.5f, 30.5f);
		boolean flag;
		if (max.equals(50.5f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testSeconfPositionFloat() {
		Float max = Maximum.Max_number_float(10.5f, 40.5f, 20.5f);
		boolean flag;
		if (max.equals(40.5f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testThirdPositionFloat() {
		Float max = Maximum.Max_number_float(10.5f, 40.5f, 50.4f);
		boolean flag;
		if (max.equals(50.4f)) {
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