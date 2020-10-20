package Pages;

import java.util.Properties;

import org.testng.Assert;

import commonactions.Browseractions;
import commonactions.Log;
import commonactions.ObjectMap;

public class EmployerManagement {

	Browseractions browse;
	ObjectMap objMap;	
	Properties config = new Properties();
	String addEmployerPath = System.getProperty("user.dir")+"\\src\\main\\java\\ObjectRepository\\addEmployer.properties";
	public static int vTxt=0;
	public EmployerManagement(Browseractions b) {
		browse = b;
		objMap = new ObjectMap(addEmployerPath);
		
	}
	
	/*public void goToEnvironmentForInternalAdmin() {
		browse.goToUrl(browse.getProp().getProperty("PlanRecommendInternalAdmin"));
	}

	public void PSInternalAdminLogin() throws Exception {
		browse.type(objMap.getLocator("LoginID"), browse.getProp().getProperty("emailInternalAdmin"));
		browse.type(objMap.getLocator("Password"), browse.getProp().getProperty("passwordInternalAdmin"));
		browse.click(objMap.getLocator("Login"));
		browse.threadSleepWait(500);
	} 
	
	public void deleteEmployee() throws Exception {
		browse.click(objMap.getLocator("PlanRecommend"));
		browse.selectJcfDropdownValue(objMap.getLocator("SelectBroker"), "cobank@dzee.com");
		browse.selectJcfDropdownValue(objMap.getLocator("SelectEmployerGroup"), "SalesForseNew");
		browse.click(objMap.getLocator("SubmitInInternalAdmin"));
		browse.threadSleepWait(1000);
		browse.click(objMap.getLocator("EmployerTasks"));
		browse.threadSleepWait(1000);
		browse.scrollDown();
		browse.click(objMap.getLocator("DeleteEmployers"));
		browse.click(objMap.getLocator("submitInEmployerDelete"));
		browse.threadSleepWait(1000);
		browse.click(objMap.getLocator("DeleleteSpecefiedEmployer"));
		browse.threadSleepWait(1000);
		browse.click(objMap.getLocator("submitinDeleteEmployer"));
		
	}*/
	
	
	
	
	public void goToEnvironment() {
		String environment = browse.getProp().getProperty("environment");
		Log.info("Conducting functional test on "+ environment);
		/*
		 * if(environment.equalsIgnoreCase("PlanRecommend")) {// equals() method OR ==
		 * String urlPath = browse.getProp().getProperty("PlanRecommend");
		 * System.out.println(urlPath); browse.goToUrl(urlPath); } else {
		 * browse.goToUrl(browse.getProp().getProperty("PlanRecommendVericred")); }
		 */
		switch(environment) {
		case "PlanRecommendVericred":
			browse.goToUrl(browse.getProp().getProperty("PlanRecommendVericred"));
			browse.threadSleepWait(3000);
			break;
		case "PlanRecommend":
			browse.goToUrl(browse.getProp().getProperty("PlanRecommend"));
			browse.threadSleepWait(3000);
			//System.out.println("Environment Started");
		    break;
			
		default:
			Log.fatal("The  " + environment+ " is not valid environment");
		    break;
		}	
	}
	public void PSLogin() throws Exception {
		System.out.println("Login Process Started");
		browse.type(objMap.getLocator("LoginID"), browse.getProp().getProperty("email"));
		browse.type(objMap.getLocator("Password"), browse.getProp().getProperty("password"));
		browse.click(objMap.getLocator("Login"));
		browse.threadSleepWait(500);
	}
	

	
	public void addEmployer() throws Exception {
		browse.ClickJS(objMap.getLocator("employerManagement"));
   	browse.click(objMap.getLocator("employerManagement"));
   	String path = "//*[text()='EMPLOYER MANAGEMENT']";
    	browse.FluentWait(path);
    	browse.waitForPageToLoad(45000);
		browse.threadSleepWait(10000);
////		WebDriverWait wait = new WebDriverWait(Browseractions.driver, 50);
////		wait.until(ExpectedConditions.presenceOfElementLocated(objMap.getLocator("addEmployer")));
		browse.click(objMap.getLocator("addEmployer"));
	    browse.type(objMap.getLocator("employerOrganizationFullName"),"British");
	    browse.click(objMap.getLocator("EmployerSizesmall"));
	    browse.click(objMap.getLocator("DoesThisEmployerOfferSelf-fundedPlansyes"));
//  //    browse.click(objMap.getLocator("FullyInsuredPublic"));
	    browse.type(objMap.getLocator("EmployerAssignedName"), "Source122");
	    browse.type(objMap.getLocator("PasswordAssignedtoEmployer"), "syn123$");
	    browse.type(objMap.getLocator("ContactPersonName"), "John");
	    browse.type(objMap.getLocator("ContactNumber"), "9876543201");
	    browse.type(objMap.getLocator("Website"), "www.mac.com");
	    browse.type(objMap.getLocator("EmailID"), "Source122@gmail.com");
	    browse.type(objMap.getLocator("Employer'sFullPhysicalAddress1"), "add1");
	    browse.type(objMap.getLocator("Employer'sFullPhysicalAddress2"), "add2");
	    browse.type(objMap.getLocator("zipcode"), "80134");
	    browse.selectJcfDropdownValue(objMap.getLocator("County"), "8035 DOUGLAS");
	    browse.selectJcfDropdownValue(objMap.getLocator("State"), "Colorado");
	    browse.selectJcfDropdownValue(objMap.getLocator("City"), "LONE TREE");
////	    browse.selectJcfDropdownValue(objMap.getLocator("County"), "8005");
////	    browse.selectJcfDropdownValue(objMap.getLocator("State"), "Colorado");
////	    browse.selectJcfDropdownValue(objMap.getLocator("City"), "centennial");
//	    
////	    browse.selectJcfDropdownValue(objMap.getLocator("State"), "Colorado");
////	    browse.selectJcfDropdownValue(objMap.getLocator("County"), "8005");
////	    browse.type(objMap.getLocator("City"), "centennial");
//	    
//	           
	    browse.type(objMap.getLocator("EnrollmentYear"), "2019");
	    browse.click(objMap.getLocator("EmployerPremiumContributionFixed"));
	    browse.type(objMap.getLocator("MonthlyPremiumContribution"), "100");
	    browse.click(objMap.getLocator("IsEmployerMakingSingleContributionForAllDependentsyes"));
	    browse.type(objMap.getLocator("PremiumContributionForAllDependents"), "200");
	    browse.type(objMap.getLocator("AnnualHRA/FSAEmployee"), "200");
	    browse.type(objMap.getLocator("AnnualHRA/FSAallDependents"), "300");
	    browse.type(objMap.getLocator("AnnualHSAEmployee"), "250");
	    browse.type(objMap.getLocator("AnnualHSAallDependents"), "300");
	    browse.type(objMap.getLocator("GroupStop-LossLimit"), "500");
	    browse.type(objMap.getLocator("IndividualStop-LossLimit"), "500");
	    browse.type(objMap.getLocator("GroupStop-LossPremium"), "100");
	    browse.type(objMap.getLocator("IndividualStop-LossPremium"), "300");
	    browse.type(objMap.getLocator("BenefitAdministrationCost"), "5");
	    browse.click(objMap.getLocator("Save")); 
	    browse.threadSleepWait(5000);
	    browse.refreshpage();
	    browse.ClickJS(objMap.getLocator("employerManagement"));
        UploadCenses();
//	    PlanManagement();  
	    AssignPlansToEmployer();
	    analytics();
	    viewPlans();
	    editEmployee();
	 //   addEmployee()
	}
	
	    public void UploadCenses() throws Exception {
		browse.threadSleepWait(10000);
//  //  	WebDriverWait wait = new WebDriverWait(Browseractions.driver, 60);
//  //  	wait.until(ExpectedConditions.presenceOfElementLocated(objMap.getLocator("UploadCenses")));
		browse.waitForelementToBeClickable(objMap.getLocator("UploadCenses"));
		browse.click(objMap.getLocator("UploadCenses"));
		browse.click(objMap.getLocator("UploadEmployeeDataWithTemplate"));
		browse.threadSleepWait(2000);
		browse.selectJcfDropdownValue(objMap.getLocator("SelectTemplateType"), " Template 3");
		browse.selectJcfDropdownValue(objMap.getLocator("EmployerGroup1"), "Source122");
		browse.type(objMap.getLocator("EmployeeOnly"), "4");
		browse.type(objMap.getLocator("Employee+Spouse"), "5");
		browse.type(objMap.getLocator("Employee+Children"), "6");
		browse.type(objMap.getLocator("Employee+Spouse+Children"), "7");
		browse.jScriptClick(objMap.getLocator("submit"));
		browse.click(objMap.getLocator("createEmployeeCensesyes"));
		browse.threadSleepWait(1000);
	}  
	
/*	public void PlanManagement() throws Exception {
		browse.click(objMap.getLocator("PlanManagement"));
		browse.threadSleepWait(1000);
		browse.selectJcfDropdown2Value(objMap.getLocator("PlanType"), objMap.getLocator("PlanType1"), "SELF_FUNDED");
//		browse.click(objMap.getLocator("PlanType"));
		browse.threadSleepWait(1000);
		browse.selectJcfDropdownValue(objMap.getLocator("PlanScope"), "Employer Specific");
		browse.threadSleepWait(1000);
		browse.selectJcfDropdownValue(objMap.getLocator("EmployerTag"), "SalesForseNew");
		browse.type(objMap.getLocator("HealthcarePlanName"), "Dental");
		browse.selectJcfDropdownValue(objMap.getLocator("EnrollmentYearInPM"), "2019");
		browse.type(objMap.getLocator("CarrierName"), "cigna");
		browse.selectJcfDropdownValue(objMap.getLocator("HealthcarePlanTypeInPM"), "HMO");
		browse.click(objMap.getLocator("IsPlanTypeHighDeductibleHealthPlanNo"));
		browse.click(objMap.getLocator("IsPlanAge-Rated"));
		browse.type(objMap.getLocator("PlanLevelCo-Insurance(%)"), "20");
		browse.type(objMap.getLocator("HealthcareActuarialValue(%)"), "80");
		browse.selectJcfDropdownValue(objMap.getLocator("HealthcarePlanMetalLevel"), "Gold");
		browse.click(objMap.getLocator("NEXT"));
		
		
	} */
	
	
	
	
	
	public void AssignPlansToEmployer() throws Exception {
		browse.threadSleepWait(5000);
		browse.ClickJS(objMap.getLocator("AssignPlansToEmployer"));
////		browse.waitForelementToBeClickable(objMap.getLocator("AssignPlansToEmployer"));
////		browse.click(objMap.getLocator("AssignPlansToEmployer"));
		browse.threadSleepWait(1000);
		browse.selectJcfDropdownValue(objMap.getLocator("EmployerGroup"), "Source122");
		browse.threadSleepWait(1000);
		browse.selectJcfDropdownValue(objMap.getLocator("AvailableEnrollmentYears"), "2019");
		browse.threadSleepWait(1000);
		browse.selectJcfDropdownValue(objMap.getLocator("ContributionProfile"), "DEFAULT_PROFILE");
		browse.click(objMap.getLocator("Submit"));
		browse.threadSleepWait(5000);
		browse.click(objMap.getLocator("HealthCarePlans"));
		browse.threadSleepWait(3000);
////		browse.selectJcfDropdownValue(objMap.getLocator("EffectiveEnrollmentYear"),"2019");
////		browse.threadSleepWait(5000);
////		browse.selectJcfDropdownValue(objMap.getLocator("AddPlanTo"), "SalesForseNew");
		browse.click(objMap.getLocator("plan1"));
//		browse.click(objMap.getLocator("plan2"));
//		browse.click(objMap.getLocator("plan3"));
		browse.click(objMap.getLocator("ClickToAssign"));
		browse.threadSleepWait(1000);
		browse.click(objMap.getLocator("oakyForPlanAssign"));
		browse.threadSleepWait(5000);
		browse.click(objMap.getLocator("SupplementalPlans"));
		browse.threadSleepWait(5000);
		browse.click(objMap.getLocator("Plan1sp"));
		browse.scrollDown();
////		browse.click(objMap.getLocator("plan2sp"));
		browse.click(objMap.getLocator("ClickToAssignSupplementalPlans"));
		browse.threadSleepWait(1000);
		browse.click(objMap.getLocator("PlanAssignmentMessage"));	
		browse.threadSleepWait(5000);
	}
	
	public void analytics() throws Exception {
		browse.threadSleepWait(5000);
		browse.click(objMap.getLocator("Analytics"));
		browse.threadSleepWait(1000);
		browse.click(objMap.getLocator("AdvanceAnalyticsPre-EnrollmentAndEnrollment"));
//		browse.waitForPageToLoad(10000);
//		browse.click(objMap.getLocator("EnrollmentYearInAnalytics1"));
		browse.threadSleepWait(1000);
		browse.selectJcfDropdownValue(objMap.getLocator("EmployerGroupInAnalytics"), "Source122");
		browse.threadSleepWait(1000);
		browse.selectJcfDropdownValue(objMap.getLocator("EnrollmentYearInAnalytics"), "2019");
		browse.threadSleepWait(1000);
		browse.selectJcfDropdownValue(objMap.getLocator("ContributionPrf"), "DEFAULT_PROFILE");
		browse.click(objMap.getLocator("RefreshPlanEvalution"));
		browse.threadSleepWait(2000);
//		browse.threadSleepWait(5000);
//		browse.click(objMap.getLocator("ViewPlan"));
	}
	
	
	
	
	public void viewPlans() throws Exception {
		browse.threadSleepWait(5000);
		browse.click(objMap.getLocator("ViewPlan"));
		browse.threadSleepWait(2000);
		browse.selectJcfDropdownValue(objMap.getLocator("EmployerGroupinPlanListing"), "Source122");
		browse.selectJcfDropdownValue(objMap.getLocator("EnrollmentYearinPlanListing"), "2019");
		browse.selectJcfDropdownValue(objMap.getLocator("ContributionPrfinPlanListing"), "DEFAULT_PROFILE");
		browse.selectJcfDropdownValue(objMap.getLocator("SortByInPlanListing"), "Healthcare Plan Name");
		browse.click(objMap.getLocator("SelfFundedInPlanListing"));
		browse.threadSleepWait(1000);
 		browse.click(objMap.getLocator("PlanReleaseCheckBox"));
		browse.threadSleepWait(5000);
	    browse.click(objMap.getLocator("ReleasePlans"));
		browse.threadSleepWait(5000);
		browse.click(objMap.getLocator("EmployerReadyForEnrollment"));
		browse.threadSleepWait(5000);
	}
	
	public void editEmployee() throws Exception {
		browse.click(objMap.getLocator("EmployeeList"));
		browse.click(objMap.getLocator("EditEmployee1"));
		browse.threadSleepWait(2000);
		browse.type(objMap.getLocator("EnrollmentYearinEE"), "2019");
        browse.scrollDown();
        browse.click(objMap.getLocator("RefreshRecommendations1"));
        browse.scrollUp();
		browse.click(objMap.getLocator("MyPlanRecommendations"));
		browse.threadSleepWait(5000);
		String HealthcarePlanPremium = browse.driver.findElement(objMap.getLocator("HealthcarePlanPremium")).getText();
		Assert.assertTrue(!HealthcarePlanPremium.equals(vTxt));
		System.out.println("the actual value is not zero for HealthcarePlanPremium is" + HealthcarePlanPremium);
		
		browse.click(objMap.getLocator("ProjectedBenefitConsumption"));
		browse.threadSleepWait(5000);
	/*	String DoctorVisit = browse.driver.findElement(objMap.getLocator("DoctorVisit")).getText();
		Assert.assertTrue(!DoctorVisit.equals(vTxt));
		System.out.println("the actual value is not zero for DoctorVisit is" + DoctorVisit); */

		
		
		browse.click(objMap.getLocator("FiveYearProjection"));
		browse.threadSleepWait(5000);
		String TotalHealthPlanPremiumin5year = browse.driver.findElement(objMap.getLocator("TotalHealthPlanPremiumin5year")).getText();
		Assert.assertTrue(!TotalHealthPlanPremiumin5year.equals(vTxt));
		System.out.println("the actual value is not zero for TotalHealthPlanPremiumin5yearprojection is" + TotalHealthPlanPremiumin5year);
		
		browse.click(objMap.getLocator("LifetimeExpenseProjection"));
		browse.threadSleepWait(5000);
		browse.scrollDown();
		String PvAsOfYear = browse.driver.findElement(objMap.getLocator("PvAsOfYear")).getText();
		Assert.assertTrue(!PvAsOfYear.equals(vTxt));
		System.out.println("the actual value is not zero for PvAsOfYear in LifetimeExpenseProjection is " + PvAsOfYear);
		String TotalHealthcareExpenses = browse.driver.findElement(objMap.getLocator("TotalHealthcareExpenses")).getText();
		Assert.assertTrue(!TotalHealthcareExpenses.equals(vTxt));
		System.out.println("the actual value is not zero for TotalHealthcareExpenses in LifetimeExpenseProjection is" + TotalHealthcareExpenses);
		
		browse.click(objMap.getLocator("Long-TermCareProjection"));
		browse.threadSleepWait(1000);
		browse.scrollDown();
		String TotalSelectedExpensesforPrimary = browse.driver.findElement(objMap.getLocator("TotalSelectedExpensesforPrimary")).getText();
		Assert.assertTrue(!TotalSelectedExpensesforPrimary.equals(vTxt));
		System.out.println("the actual value is not zero for TotalSelectedExpensesforPrimary is" + TotalSelectedExpensesforPrimary);
		String TotalSelectedExpensesforSpouse = browse.driver.findElement(objMap.getLocator("TotalSelectedExpensesforSpouse")).getText();
		Assert.assertTrue(!TotalSelectedExpensesforSpouse.equals(vTxt));
		System.out.println("the actual value is not zero for PvAsOfYear is" + TotalSelectedExpensesforSpouse);
		
		
		
	}
	
	
	
	
	
		
	
	
	
	
	public void addEmployee() throws Exception {
		browse.threadSleepWait(5000);
		browse.click(objMap.getLocator("AddEmployee"));
		browse.threadSleepWait(5000);
	    browse.type(objMap.getLocator("YourEmployeeId"), "John");
//	    browse.click(objMap.getLocator("SpouseYes"));
	    browse.click(objMap.getLocator("spouseNo"));
	    browse.type(objMap.getLocator("numberOfChildren"), "2");
	    browse.selectJcfDropdownValue(objMap.getLocator("AnnualIncome"), "$18,550 to $75,300");
	    browse.type(objMap.getLocator("ZipCodeOfEmployee"), "80112");
	    browse.type(objMap.getLocator("PhoneNumberOfEmployee"), "9877899876");
	    browse.type(objMap.getLocator("EmailIDofEmployee"), "John@gmail.com");
	    browse.type(objMap.getLocator("PrimaryName"), "John");
	    browse.click(objMap.getLocator("PrimaryGender"));
//	    browse.selectDataByJS(objMap.getLocator("DateofBirthOfPrimary"), "12-1980");
	    browse.type(objMap.getLocator("DateofBirthOfPrimary"), "12-1980");
	    browse.selectJcfDropdownValue(objMap.getLocator("HealthProfilePrimary"), "Best Health");
//	    browse.selectJcfDropdownIndex(objMap.getLocator("HealthProfilePrimary"), 1);
	    browse.click(objMap.getLocator("primaryTobaccoUserNo"));
/*	    browse.type(objMap.getLocator("SpouseName"), "Jo");
	    browse.click(objMap.getLocator("SpouseGender"));
//	    browse.selectDataByJS(objMap.getLocator("DateofBirthOfSpouse"), "01-1981");
	    browse.type(objMap.getLocator("DateofBirthOfSpouse"), "01-1981");
	    browse.type(objMap.getLocator("DateofBirthOfSpouse"), "01-1981");
//        browse.selectJcfDropdownIndex(objMap.getLocator("HealthProfileSpouse"), 1);
        browse.selectJcfDropdownValue(objMap.getLocator("HealthProfileSpouse"), "Best Health");
//	    browse.selectJcfDropdown2Value(objMap.getLocator("HealthProfileSpouse"), objMap.getLocator("HealthProfileSpouse1"), "Best Health");
	    browse.click(objMap.getLocator("SpouseTobaccoUserNo"));

	    browse.type(objMap.getLocator("Child1Name"), "Mac");
	    browse.click(objMap.getLocator("Child1Gender"));
//	    browse.selectDataByJS(objMap.getLocator("DateofBirthOfChild1"), "01-2009");
	    browse.type(objMap.getLocator("DateofBirthOfChild1"), "01-2009");
//	    browse.selectJcfDropdownIndex(objMap.getLocator("HealthProfileChild1"), 1);
	    browse.selectJcfDropdownValue(objMap.getLocator("HealthProfileChild1"), "Best Health");
	    browse.click(objMap.getLocator("Child1TobaccoUserNo"));
	    browse.type(objMap.getLocator("Child2Name"), "Joya");
	    browse.click(objMap.getLocator("Child2Gender"));
//	    browse.selectDataByJS(objMap.getLocator("DateofBirthOfChild2"), "01-2012");
	    browse.type(objMap.getLocator("DateofBirthOfChild2"), "01-2012");
	    browse.selectJcfDropdownValue(objMap.getLocator("HealthProfileChild2"), " Best Health ");
	    browse.click(objMap.getLocator("Child2TobaccoUserNo"));*/
	    browse.click(objMap.getLocator("SaveEmployee"));
	    browse.threadSleepWait(5000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void logOutfromApplication() throws Exception {
		browse.jScriptClick(objMap.getLocator("logout"));
	}
	
	public void QuitBrowser() {

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


		
		
		
		
	