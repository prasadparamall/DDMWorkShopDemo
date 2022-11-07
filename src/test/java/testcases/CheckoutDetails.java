package testcases;

import org.testng.annotations.Test;

import baseclass.baseclass;

public class CheckoutDetails extends baseclass {


    @Test(priority = 1)
    public void shippingAddress() {
	
    	select("drop1_XPATH","prasad1 test1, door no:12345, andhrapradesh 123456, India");
    }
    
    @Test(priority = 2)
	public void shippingaddress() {
       click("sacontinue_XPATH");  
        
	}
	

    @Test(priority = 3)
	public void ShippingMethodNextDayAir() {
		
		click("nextdayair_XPATH");
		click("smcontine_XPATH");
		
	}
	
    @Test(priority = 4)
	public void paymentmethod() {
		
		click("cod_XPATH");
		click("pmcontinue_XPATH");	
		
	}
    @Test(priority = 5)
	public void paymentinfo() {
		
		click("picontinue_XPATH");		
	}
    @Test(priority = 6)
	public void confirmorder() throws InterruptedException {
		
		click("cocontinue_XPATH");
		Thread.sleep(2000);
	} 
}
