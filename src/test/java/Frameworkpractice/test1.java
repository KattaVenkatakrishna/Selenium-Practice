package Frameworkpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void kk() {
		String name="Krishna";
		Assert.assertEquals(name, "Krishna");
		System.out.println("The real name is :"+name);
	}
	@Test
	public void sr() {
		String name="sairam";
		Assert.assertEquals(name, "sairam");
		System.out.println("The real name is :"+name);
	}
	@Test
	public void sg() {
		String name="sangamesh";
		Assert.assertEquals(name, "sangamesh");
		System.out.println("The real name is :"+name);
	}
	@Test
	public void tp() {
		String name="teja";
		Assert.assertEquals(name, "teja");
		System.out.println("The real name is :"+name);
	}
	@Test
	public void sk() {
		String name="SaiKrishna";
		Assert.assertEquals(name, "SaiKrishna");
		System.out.println("The real name is :"+name);
	}

}
