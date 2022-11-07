package testcases;


import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseclass.baseclass;
import utilities.KeyPaths;

public class SuccessOrder extends baseclass {
	
	@Test(priority = 1)
	public void successfullprocessed() throws Exception {
		String orno = returnWebElement("orderno_XPATH").getText();
	    System.out.println(orno);
	   log.info("Get text for order number.......");
		
	    String succe = returnWebElement("success_XPATH").getText();
	    System.out.println(succe);
	   log.info("Get text for successfully ............");
		
		Thread.sleep(2000);
		
		
	} 
	

	@Test(priority = 2)
	public void orderDetails() throws Exception {
		
		click("orderdetails_XPATH");
		Thread.sleep(2000);
		
		ArrayList<String> arr = new ArrayList<String>();
		
		String orde = returnWebElement("getdetails_XPATH").getText();
		arr.add(orde);
		
		for(String aee: arr) {
		System.out.println(aee);
		}
	   log.info("Get text for order number.......");
	   
	    Thread.sleep(2000);
	    driver.navigate().to(KeyPaths.navigate);
		
		click("continulast");
		Thread.sleep(2000);
		
	} 

}
