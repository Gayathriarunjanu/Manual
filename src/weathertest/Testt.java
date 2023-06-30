package weathertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import weather.Pageclass;


public class Testt {

WebDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://openweathermap.org");
}

@Test
public void weathertest() {
	Pageclass ob=new Pageclass(driver);
ob.setvalues("vaikom");
ob.clickButton();



}




























}
