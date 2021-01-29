package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ReadPropertyFile {

	static Properties prop=new Properties();
	static String path;
	static String key=null;
	
	public static void main(String[] args) {
	//	setProperties();
		
	}	
	public static String getPropertyKey(String key) throws Exception
	{
	
			path=System.getProperty("user.dir");
			InputStream input=new FileInputStream(path+"/src/test/java/config/config.properties");
			prop.load(input);
		//	System.out.println(prop.getProperty(key));
			return prop.getProperty(key);
		
	}
//	public static void setProperties()
//	{
//		try {
//			OutputStream output=new FileOutputStream("C:/Users/Pornima/eclipse-workspace/Guru99/src/test/java/config/config.properties");
//			prop.setProperty("result", "pass");
//			prop.setProperty("name", "guru99test");
//			prop.store(output, null);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			e.printStackTrace();
//		}
//	}
}
