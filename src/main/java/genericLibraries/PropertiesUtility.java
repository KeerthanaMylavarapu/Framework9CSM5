package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class PropertiesUtility {
	public void propertiesInit(String filepath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	public string
		
}