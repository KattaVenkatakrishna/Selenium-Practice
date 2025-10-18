package Datadrivenframeworkdemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Datadrivenframeworknotepad {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\91832\\OneDrive\\Desktop\\notepad.txt");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		System.out.println(p.getProperty("Username"));
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("email"));

	}

}
