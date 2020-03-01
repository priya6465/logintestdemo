package Testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verifytiltle {
@Test
public void VerifyHomePageTitle()
{
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("");
	
}
	

}
