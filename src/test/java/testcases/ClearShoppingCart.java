package testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class ClearShoppingCart extends baseclass{
	

	@Test
	//If Already Add Any Items in Addtocart, it will remove and go to the books page
	public void ClearAddToCartAndGoToBooks() throws InterruptedException, IOException {
		
		
		WebElement clik = returnWebElement("num_XPATH");
		String s="(0)";
		if(clik.getText().equals(s))
		{
			click("books2_XPATH");
			//log.info("Go To Books Page.............");
		}
		else
		{
			
			click("movetoshippingcartlink_XPATH");
			Thread.sleep(2000);
			
    		
    	List<WebElement>cartlist=returnListWebElement("cardlist_XPATH");
			
    	Iterator<WebElement> cart =cartlist.iterator();
    	
    	while(cart.hasNext())
    	{
    		cart.next().click();
    	}
    	
		click("updateshippindcartbtn_XPATH");
		
		String actuurl = driver.getCurrentUrl();
		String expeurl = "https://demowebshop.tricentis.com/cart";
		
		if(actuurl.equalsIgnoreCase(expeurl))
		{
			click("books2_XPATH");
		}else {
			System.out.println("faild navigation");
		}
	
		}

	}

}
