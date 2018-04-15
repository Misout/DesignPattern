package com.misout.designpattern.decorator.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * @author Misout
 * @date 2018-04-15 13:55:11
 */
public class IODecoratorTest {

	@Test
	public void testIODecorator() throws FileNotFoundException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/test.txt"));
		System.out.println(bis);
	}
}
