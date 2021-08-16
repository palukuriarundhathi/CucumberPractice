package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFeature {

	WebDriver driver;
	@Given("User Opening the Browser and Entering the URL")
	public void openingBrower() {

		System.out.println("This is Given Method");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.dnbdecisionmaker.com/dm/index.jsp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User Enters the UserName2 and Password2")
	public void enteringUserNamePwd() {

		System.out.println("This i When Method");
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
	}

	@Then("Verifying the Titile of the Page")
	public void titleVerify() throws InterruptedException {

		System.out.println("This is Then Method");
		
		Thread.sleep(5000);
		driver.close();
	}
	
}
