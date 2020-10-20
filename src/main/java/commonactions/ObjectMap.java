package commonactions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap {
      Properties prop;
      
      public ObjectMap(String filePath) {
      prop = new Properties();
      try {
		FileInputStream fi = new FileInputStream(filePath);
		try {
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
      }
	
	
	public By getLocator(String ElementName) throws Exception {
        //Read value using the logical name as Key
        String locator = prop.getProperty(ElementName);
        //Split the value which contains locator type and locator value
   //   System.out.println("locator .................." + locator);
        String locatorType = locator.split(":")[0];
        String locatorValue = locator.split(":")[1];
        //Return a instance of By class based on type of locator
          if(locatorType.toLowerCase().equals("id"))
                return By.id(locatorValue);
          else if(locatorType.toLowerCase().equals("name"))
                return By.name(locatorValue);
          else if((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class")))
                return By.className(locatorValue);
          else if((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag")))
                return By.className(locatorValue);
          else if((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link")))
                return By.linkText(locatorValue);
          else if(locatorType.toLowerCase().equals("partiallinktext"))
                return By.partialLinkText(locatorValue);
          else if((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css")))
                return By.cssSelector(locatorValue);
          else if(locatorType.toLowerCase().equals("xpath"))
                return By.xpath(locatorValue);
          else
                  throw new Exception("Locator type '" + locatorType + "' not defined!!");
        }

	
	
	
	
	
	
}
