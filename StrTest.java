package jUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class StrTest {

	@Test
	public void test() {
		jUnitFunctions ju = new jUnitFunctions();
		String res = ju.AddStr("He", "llo");
		assertEquals ("Hello", res);
	}
}
