package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntTest {

	@Test
	public void test() {
		jUnitFunctions ju = new jUnitFunctions();
		int res = ju.AddInt(10, 20);
		assertEquals (30, res);
	}
}
