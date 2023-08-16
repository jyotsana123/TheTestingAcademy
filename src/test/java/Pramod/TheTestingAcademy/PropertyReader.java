package Pramod.TheTestingAcademy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/data.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println(url);
				
	
	}
	
	//this is use to read the configuration file

}
