package citiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import citiSteps.Buttonpages;

public class Alertpages {
	private Buttonpages buttonpages;
	
	//constructor with webDriver driver
	public Alertpages(WebDriver driver)  {
		//PageFactory.initElements(driver, this);
		this.buttonpages= new Buttonpages(driver);
		
	}
	
	public void DisplayAlertbox() throws Exception {
		buttonpages.buttonAlertbox();
		buttonpages.lastAlerts();
		
		
	}

	public void Confirmbox() throws InterruptedException  {
		buttonpages.buttonConfirmationbox();
		buttonpages.confirmationBox();
	}
	
}
