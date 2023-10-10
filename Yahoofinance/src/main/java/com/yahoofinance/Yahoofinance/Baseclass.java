package com.yahoofinance.Yahoofinance;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Baseclass 
{
   
	public static WebDriver driver;
	public static Properties prop;
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		driver = new ChromeDriver(); 
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
			
		}
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
	
}
}