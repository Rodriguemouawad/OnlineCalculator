package TestRunner;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.*;
import io.cucumber.core.cli.Main;

@CucumberOptions(
		
		features = "TestSscripts" ,glue= {"src/TestRunner"}
		)
public class TestRunner {	
	@Test
	@Given("that we Open Chrome and launch the online calculator Web App")
	public void openURL() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.online-calculator.com/full-screen-calculator/");
		//maximize window
		driver.manage().window().maximize();
	}

	@Then("^we substract \"(.*?)\" - \"(.*?)\"$")
	public void Substract(String number1, String number2) throws AWTException {
		 Robot robot = new Robot();  // Robot class throws AWT Exception	
		 robot.delay(3500);
		 
		 if (number1=="3")
		 {
		 robot.mouseMove(800, 550);
		 robot.delay(1000);
		 robot.keyPress(KeyEvent.BUTTON1_DOWN_MASK);	
         robot.keyPress(KeyEvent.BUTTON1_DOWN_MASK);
		 }
		 if (number1=="5")
		 {
		 robot.mouseMove(700, 110);
		 robot.delay(1000);
		 robot.keyPress(KeyEvent.BUTTON1_DOWN_MASK);	
         robot.keyPress(KeyEvent.BUTTON1_DOWN_MASK);
		 }
         
	}


}