package projectmain;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mainproject.Indiagovt;

public class Indiagovttest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.india.gov.in/");
	}
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Indiagovt ig= new Indiagovt(driver);
		ig.regclick();
		ig.values("ranee", "ranee@123", "ranee", "sanju");
		ig.values1();
		ig.values2();
		ig.values3("679330");
		ig.values4();
		ig.click();
		ig.mouseover();
	}
	@Test
	public void test1() throws IOException
	{
		Indiagovt ig=new Indiagovt(driver);
		ig.screenshot();
		ig.elescreenshogt();
	}
	
	@Test
	public void test2()
	{
		Indiagovt ig=new Indiagovt(driver);
		ig.clickk();
		ig.values5("pancard");
		ig.values6();
		ig.values7();
		ig.clickkk();
		
	}
	@Test
	public void test3()
	{
		Indiagovt ig=new Indiagovt(driver);
		ig.clickss();
		ig.values8();
	}


}
