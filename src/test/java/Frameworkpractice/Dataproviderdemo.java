package Frameworkpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test(dataProvider = "datasupplier")
public class Dataproviderdemo {
	public void sampledataloginpage(String Username, String Password) {
		System.out.println("Logged in using :"+Username+" and "+Password);
	}
	@DataProvider(name="datasupplier")
public Object supplydata() {
	Object[][] data = {{"Krishna","1234"},{"sairam","4567"},{"sangamesh","7890"}};
	return data;
}
}
