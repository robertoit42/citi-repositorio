package citiSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Buttonpages {
	private WebDriver driver;
	
	
	@FindBy(how = How.ID,using = "alertBox") 
		private WebElement buttonAlertbox;
	
	@FindBy(how = How.ID,using = "confirmBox")
	private WebElement buttonConfirmationbox;
	
	
public Buttonpages(WebDriver driver)  {
	PageFactory.initElements(driver, this);
	this.driver= driver;
	
	
}

public void buttonAlertbox() {
	buttonAlertbox.click();
	
	
  }

public void buttonConfirmationbox() {
	buttonConfirmationbox.click();
	

}

	public void lastAlerts() throws InterruptedException {
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	}
	
	public void confirmationBox() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
}
