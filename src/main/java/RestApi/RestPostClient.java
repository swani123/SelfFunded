package RestApi;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import freemarker.core.ReturnInstruction.Return;

public class RestPostClient {
	

	public CloseableHttpResponse post(String URL,String entityString,HashMap<String,String>headerMap) throws IOException {
		CloseableHttpClient httpClient =HttpClients.createDefault();
		HttpPost httppost = new HttpPost(URL);//http post request
		httppost.setEntity(new StringEntity (entityString));// for request body
		
		//for headers
		
		for(Map.Entry<String,String>entry : headerMap.entrySet()) {
			httppost.addHeader(entry.getKey(), entry.getValue());
		}
			CloseableHttpResponse httpResponse = httpClient.execute(httppost);	
	 		return httpResponse;			 		
	}
	
	
	
	
	
	
}
