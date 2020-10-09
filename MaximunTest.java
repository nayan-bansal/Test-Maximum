import org.junit.Test;
import org.junit.Assert;

public class TestMaximum {
	@Test
	public void testIntegerMaxWithMaxAtFirstPosition() {
		Integer max = Maximum.maximum(50, 40, 10);
		boolean flag;
		if (max.equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testIntegerMaxWithMaxAtSecondPosition() {
		Integer max = Maximum.maximum(40, 50, 10);
		boolean flag;
		if (max.equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testIntegerMaxWithMaxAtThirdPosition() {
		Integer max = Maximum.maximum(10, 40, 50);
		boolean flag;
		if (max.equals(50)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testFloatMaxWithMaxAtFirstPosition() {
		Float max = Maximum.maximum(50.4f, 40.6f, 10.5f);
		boolean flag;
		if (max.equals(50.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testFloatMaxWithMaxAtSecondPosition() {
		Float max = Maximum.maximum(40.6f, 50.4f, 10.5f);
		boolean flag;
		if (max.equals(50.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testFloatMaxWithMaxAtThirdPosition() {
		Float max = Maximum.maximum(10.5f, 40.6f, 50.4f);
		boolean flag;
		if (max.equals(50.4f)) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaxWithMaxAtFirstPosition() {
		String max = Maximum.maximum("Peach", "Apple", "Banana");
		boolean flag;
		if (max.equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaxWithMaxAtSecondPosition() {
		String max = Maximum.maximum("Apple", "Peach", "Banana");
		boolean flag;
		if (max.equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaxWithMaxAtThirdPosition() {
		String max = Maximum.maximum("Apple", "Banana", "Peach");
		boolean flag;
		if (max.equals("Peach")) {
			flag = true;
		} else {
			flag = false;
		}
		Assert.assertEquals(true, flag);
	}
}