package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class StudentsTestGrade {
	Students s = new Students();
	int studentgrades[] = new int[] {45,87,87,98};
	int studentgrades1[]  = new int[] {65,87,981,98};
	@Test
	public void test() {
		assertEquals("Invalid-Grades",s.checkStugrade(studentgrades1));
		assertEquals("Valid-Grades",s.checkStugrade(studentgrades));
		assertNotEquals("Invalid-Grades",s.checkStugrade(studentgrades));
	}

}
