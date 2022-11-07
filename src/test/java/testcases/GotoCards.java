package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class GotoCards extends baseclass{
	
	@Test
	public void MoveToShippingCartAndClick() throws InterruptedException {
		
		WebElement txtUsername = returnWebElement("movetoshippingcartlink_XPATH");

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUsername).build();
		seriesOfActions.perform() ;
		Thread.sleep(2000);
		//log.info("Move to the shippingcart.....");
		
		click("gotocartbtn_XPATH");
		//log.info("Click on gotocart button.....");
	}

}
