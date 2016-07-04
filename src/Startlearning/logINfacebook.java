package Startlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logINfacebook {
	
	public static void main (String[]args){
		//Open Browser
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.facebook.com";
	    String expectedTitle = "Facebook - Log In or Sign Up";
	    String actualTitle = "";

	
		driver.get(baseUrl);
	
		//Title page
		actualTitle = driver.getTitle();
		
		 //Titlepage result
		 //compare the actual title of the page witht the expected one and print
         //the result as "Passed" or "Failed"
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
					
	
		 //login
		 driver.findElement(By.id("email")).sendKeys("chardsantos931@yahoo.com");
		 driver.findElement(By.id("pass")).sendKeys("Brewing13");		
		 driver.findElement(By.id("loginbutton")).click();
		 
		//Driver close
		 driver.close();
	}
}
