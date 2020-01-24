package testScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.*;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.en.Given;		
import io.cucumber.java.en.Then;
import org.junit.runner.RunWith;
@CucumberOptions(
		features = "TestScripts"
		,glue= {"src/TestRunner"}
		)

public class main {
	
	public static WebDriver InitilizeDriver() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();
        return driver;


	}

}