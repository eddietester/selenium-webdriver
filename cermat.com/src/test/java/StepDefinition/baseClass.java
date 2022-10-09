package StepDefinition;

import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.signUpPage;

public class baseClass {
	
	public WebDriver driver;
	public signUpPage sp;
	
	
	public String randomEmail(){
		String StringEmail = RandomStringUtils.randomAlphanumeric(8);
		return (StringEmail);
	}
	
	public String randomFirstName(){
		String StringFirstName = RandomStringUtils.randomAlphabetic(4);
		return (StringFirstName);
	}
	
	public String randomLastName(){
		String StringLastName = RandomStringUtils.randomAlphabetic(8);
		return (StringLastName);
	}
	
	public int randomPhoneNumber(){
		 int int_random = ThreadLocalRandom.current().nextInt();  
		 return (int_random);
	}

}
