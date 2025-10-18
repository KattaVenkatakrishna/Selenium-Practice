package Frameworkpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {
	@Test
	public void abc() {
		String name="abc";
		Assert.assertEquals(name, "abc");
		System.out.println("The real name is :"+name);
	}
	@Test
	public void def() {
		String name="def";
		Assert.assertEquals(name, "def");
		System.out.println("The real name is :"+name);
	}
	@Test
	public void ghi() {
		String name="ghi";
		Assert.assertEquals(name, "ghi");
		System.out.println("The real name is :"+name);
	}
	@Test
	public void jkl() {
		String name="jkl";
		Assert.assertEquals(name, "jkl");
		System.out.println("The real name is :"+name);
	}
	@Test
	public void mno() {
		String name="mno";
		Assert.assertEquals(name, "mno");
		System.out.println("The real name is :"+name);
	}
}
