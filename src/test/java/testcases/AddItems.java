package testcases;

import org.testng.annotations.Test;

import baseclass.baseclass;

public class AddItems extends baseclass{
	
	@Test
	public void SelectBooksAddtocart() throws InterruptedException {
		
		click("ciaddtocart_XPATH");
		Thread.sleep(2000);
		click("fictionaddtocart_XPATH");
		Thread.sleep(2000);
		
	}

}
