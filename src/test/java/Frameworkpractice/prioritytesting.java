package Frameworkpractice;

import org.testng.Assert;
import org.testng.annotations.Test;


/*if we use priority keyword execution will be done based on the alphabetically
 * and if we priority negative then test ng will take the least count based on 
 * the priority given for example refer line no:18
 */

public class prioritytesting {
	@Test
	public void kk() {
		String name="Krishna";
		Assert.assertEquals(name, "Krishna");
		System.out.println("The real name is :"+name);
	}
	@Test(priority=-99)
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
	@Test(priority=-1)
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
