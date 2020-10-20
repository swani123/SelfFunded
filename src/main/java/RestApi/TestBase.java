package RestApi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	String serviceURL;
	String apiUrl;
	String URL;
	
	
	public static Properties prop;

	public TestBase() throws IOException {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\RestApi\\Config.ApiProperties");
		prop.load(ip);
		
		serviceURL=prop.getProperty("PlanRecommendVericred");
		apiUrl=prop.getProperty("ServiceURL");
		
		URL = serviceURL+apiUrl;
		System.out.println("URL :: "+URL);
		
	}
	
	
	
	
	
	
	
}
