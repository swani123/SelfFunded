package RestApi;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class deleteEmployer {

	RestPostClient restPostClient;
	 TestBase testBase;
	 CloseableHttpResponse closeableHttpResponse;
	 
	 public deleteEmployer() throws IOException {
		super();
		this.restPostClient = new RestPostClient();
		this.testBase = new TestBase();	
	}


	
	public void deleteEmployerInAPI() throws JsonGenerationException, JsonMappingException, IOException {
		HashMap<String,String> headerMap= new HashMap<String,String>();
		headerMap.put("Content-Type", "application/json");
		headerMap.put("Authorization", "Basic UGxhblNlbGVjdGlvblVzZXI6UGxhblNlbGVjdGlvblBAc3N3MHJk==");
		
		//jacksonApi is needed to convert json to java
		
		ObjectMapper mapper = new ObjectMapper();
		//mapper.enable(SerializationFeature.INDENT_OUTPUT);
		Users Users = new Users("paychex","SalesForseNew");//expected users objects
		
		//object to json		
		//mapper.writeValue(new File("C:\\kalpana123\\kalpana Aivante\\PlanSelectAutomation\\FullyInsuredPublic\\src\\main\\java\\RestApi\\users.json"), Users);
			
		//object  to json String		
		String UsersJsonString = mapper.writeValueAsString(Users);
		System.out.println("UsersJsonString ::  " + UsersJsonString);
		
		CloseableHttpResponse closeableHttpResponse = restPostClient.post(testBase.URL, UsersJsonString, headerMap);
		
		//1.Ststus code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("statusCode is" + statusCode);
		
		//2.jsonString
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
		
		JSONObject  responseJson = new JSONObject(responseString);
		System.out.println("The Response From API is" + responseJson );
		
		//body validation----json to javaobject---
	/*	Users userResObj =mapper.readValue(responseString, Users.class);
		System.out.println(userResObj);
		
		Assert.assertTrue(Users.getDzeeClient().equals(userResObj.getDzeeClient())); 
		//Assert.assertTrue(Users.getEmployerGroups().equals(userResObj.getEmployerGroups()));
		System.out.println(userResObj.getBrokers());*/
		
	}

}
