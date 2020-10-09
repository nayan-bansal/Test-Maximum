package Maximum;

import org.junit.Test;

import org.junit.Assert;

public class MaximumTest {
	
	@Test
	public void testIntegerMaxWithMaxAtFirstPosition() {
		boolean flag;
		if ((Maximum.maximum(50, 40, 10)).equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testIntegerMaxWithMaxAtSecondPosition() {
		boolean flag;
		if ((Maximum.maximum(40, 50, 10)).equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testIntegerMaxWithMaxAtThirdPosition() {
		boolean flag;
		if ((Maximum.maximum(10, 40, 50)).equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testIntegerMaxWithFourParameters() {
		boolean flag;
		if ((Maximum.maximum(50, 40, 10, 60)).equals(60)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMaxWithMaxAtFirstPosition() {
		boolean flag;
		if ((Maximum.maximum(50.4f, 40.6f, 10.5f)).equals(50.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testFloatMaxWithMaxAtSecondPosition() {
		boolean flag;
		if ((Maximum.maximum(40.6f, 50.4f, 10.5f)).equals(50.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testFloatMaxWithMaxAtThirdPosition() {
		boolean flag;
		if ((Maximum.maximum(10.5f, 40.6f, 50.4f)).equals(50.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testFloatMaxFourParameters() {
		boolean flag;
		if ((Maximum.maximum(50.4f, 40.6f, 10.5f,100.0f)).equals(100.0f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testStringMaxWithMaxAtFirstPosition() {
		boolean flag;
		if ((Maximum.maximum("Peach", "Apple", "Banana")).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaxWithMaxAtSecondPosition() {
		boolean flag;
		if ((Maximum.maximum("Apple", "Peach", "Banana")).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaxWithMaxAtThirdPosition() {
		boolean flag;
		if ((Maximum.maximum("Apple", "Banana", "Peach")).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaxFourParameters() {
		boolean flag;
		if ((Maximum.maximum("Peach", "Apple", "Banana","Litchi")).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}
}