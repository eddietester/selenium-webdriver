package StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.signUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class testSteps extends baseClass {

	@Given("^Launch browser$")
	public void launch_browser() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver/chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    sp = new signUpPage(driver);
	    driver.manage().window().maximize();
	}

	@And("^Open url \"([^\"]*)\"$")
	public void open_url(String url) throws Throwable {
	    driver.get(url);
	}


	@And("^enter the required information$")
	public void enter_the_required_information() throws Throwable {
	    String email = randomEmail()+".007"+"@gmail.com";
		sp.setEmail(email);
		
		String phoneNo = "081" + randomPhoneNumber();
	    sp.setPhoneNumber(phoneNo);
	    
	    sp.setPassword("1angkaBesar");
	    sp.setConfirmationPassword("1angkaBesar");
	    
	    String fname = randomFirstName();
	    sp.setFirstName(fname);
	    
	    String lname = randomLastName();
	    sp.setLastName(lname);
	    sp.setCity("Bogor");
	    sp.setSggList();
	}

	@When("^Click on Daftar button$")
	public void click_on_Daftar_button() throws Throwable {
		sp.clickBtnRegister();
	}

	
	@Then("^We can view the verification methods \"([^\"]*)\"$")
	public void we_can_view_the_verification_methods(String text) throws Throwable {
		driver.getPageSource().contains(text) ;
	}
	
	@Then("^close browser$")
	public void close_browser() throws Throwable {
		Thread.sleep(3000);
	    driver.close();
	}

}
