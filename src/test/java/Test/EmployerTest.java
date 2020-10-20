package Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import Pages.EmployerManagement;
import RestApi.deleteEmployer;
import commonactions.Browseractions;
import commonactions.ExtentReportsUtility;

public class EmployerTest extends ExtentReportsUtility  {
    public Browseractions browse;
    public EmployerManagement emp; // = new EmployerManagement(browse); ;
    public deleteEmployer de;
    
 /*   @BeforeClass
    public void goToEnvironment() throws IOException {
    	browse = new Browseractions();
    	browse.initilization();
    	emp = new EmployerManagement(browse);
    	DE = new deleteEmployer();
       	
    }
    
 /*   @BeforeMethod
    public void PSLogin() throws Exception {
       	emp.PSLogin();
    } */
    
 /*   @Test(priority=0)
    public void deleteEmployer() throws Exception {
    	emp.goToEnvironmentForInternalAdmin();
    	emp.PSInternalAdminLogin();
    	emp.deleteEmployee();
    	
    }*/
    
    @Test(priority=0)
    public void deleteEmployerAPI() throws JsonGenerationException, JsonMappingException, IOException {
    	de = new deleteEmployer();
    	de.deleteEmployerInAPI(); 
      	
    }
    
       	
    
    
    
    @Test(priority=1)
    public void createEmployer() throws Exception {
    	browse = new Browseractions();
    	browse.initilization();
    	emp = new EmployerManagement(browse);
    	emp.goToEnvironment();
		System.out.println(" Goto Login Process");
    	emp.PSLogin();
    	emp.addEmployer();
    	emp.logOutfromApplication();
    	browse.quitDriver();
    }
    
/*	@AfterMethod
	public void logOutOfApplication() throws Exception {
	emp.logOutfromApplication();
		
	}*/
/*	@AfterClass
	public void QuitBrowser() throws Exception {
		browse.quitDriver();
	}*/
}


