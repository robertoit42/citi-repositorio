package citiDefinitions;

import org.openqa.selenium.WebDriver;

import citiPages.Alertpages;
import citiSteps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class DefinitionsSteps {
	private WebDriver driver;
	private Conexion conexion = new Conexion ();
	private Alertpages alertpages = new Alertpages (driver);
	
	
	
	@Given("lounching page$")
	public void open_Website() {
		this.conexion= new Conexion();
		this.driver=this.conexion.abrirNavegador();
	}
	
	@And("Displaying ALertbox$")
	public void display_Alerts() throws Exception {
		this.alertpages= new Alertpages (driver);
		this.alertpages.DisplayAlertbox();
	}

	
	@And ("Displaying Confirmbox$")
	public void display_Confirmbox() throws InterruptedException {
		this.alertpages= new Alertpages (driver);
		this.alertpages.Confirmbox();

	}
}
