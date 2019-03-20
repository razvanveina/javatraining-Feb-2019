package sessions.session10;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TesteFinaleTest {

	@Test
	public void test11() {
		assertEquals(2.4, harmonicAvg(2, 3), 0.001);
	}

	@Test
	public void test12() {
		assertEquals(0, harmonicAvg(2, -2), 0.001);
	}

	@Test
	public void test21() {
		assertEquals(true, isSorted(new int[] { 1, 5, 7, 8, 8 }));
	}

	@Test
	public void test22() {
		assertEquals(false, isSorted(new int[] { 1, 5, 7, 9, 8 }));
	}

	@Test
	public void test23() {
		assertEquals(true, isSorted(new int[] { 1, 1 }));
	}

	@Test
	public void test31() {
		assertEquals(2, next(new int[] { 1, 5, 7, 2, 4 }, 7));
	}

	@Test
	public void test32() {
		assertEquals(-1, next(new int[] { 1, 5, 7, 2, 4 }, 4));
	}

	@Test
	public void test33() {
		assertEquals(-2, next(new int[] { 1, 5, 7, 2, 4 }, 14));
	}

	private int next(int[] arr, int n) {
		return 0;
	}

	private boolean isSorted(int[] is) {
		return false;
	}

	private double harmonicAvg(int i, int j) {
		return 0;
	}

}
