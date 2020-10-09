package Maximum;
import org.junit.Test;
import org.junit.Assert;

public class MaximumTest{
	@Test
	public void testIntegerMaxWithMaxAtFirstPosition() {
		boolean flag;
		if ((new Maximum(50, 40, 10).maximum()).equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testIntegerMaxWithMaxAtSecondPosition() {
		boolean flag;
		if ((new Maximum(40, 50, 10).maximum()).equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testIntegerMaxWithMaxAtThirdPosition() {
		boolean flag;
		if (new Maximum(10, 40, 50).maximum().equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testFloatMaxWithMaxAtFirstPosition() {
		boolean flag;
		if ((new Maximum(50.4f, 40.6f, 10.5f).maximum()).equals(50.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testFloatMaxWithMaxAtSecondPosition() {
		boolean flag;
		if ((new Maximum(40.6f, 50.4f, 10.5f).maximum()).equals(50.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testFloatMaxWithMaxAtThirdPosition() {
		boolean flag;
		if ((new Maximum(10.5f, 40.6f, 50.4f).maximum()).equals(50.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaxWithMaxAtFirstPosition() {
		boolean flag;
		if ((new Maximum("Peach", "Apple", "Banana").maximum()).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaxWithMaxAtSecondPosition() {
		boolean flag;
		if ((new Maximum("Apple", "Peach", "Banana").maximum()).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaxWithMaxAtThirdPosition() {
		boolean flag;
		if ((new Maximum("Apple", "Banana", "Peach").maximum()).equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}
}