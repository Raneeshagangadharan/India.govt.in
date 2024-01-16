package mainproject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Indiagovt {
WebDriver driver;
	
	By register= By.xpath("//*[@id=\"block-block-4\"]/div/div/div[2]/a[3]");
	By username= By.name("name");
	By email= By.name("mail");
	By firstname= By.xpath("//*[@id=\"edit-profile-main-field-first-name-und-0-value\"]");
	By lastname= By.xpath("//*[@id=\"edit-profile-main-field-last-name-und-0-value\"]");
	By country= By.xpath("//*[@id=\"edit-profile-main-field-country-und\"]");
	By state= By.xpath("//*[@id=\"edit-profile-main-field-state-und-hierarchical-select-selects-0\"]");
	By pincode= By.xpath("//*[@id=\"edit-profile-main-field-pin-code-und-0-value\"]");
	By education= By.xpath("//*[@id=\"edit-profile-main-field-education-und\"]");
	By create= By.name("op");
	By adsearch= By.id("advsearchbtn");
	By title= By.xpath("//*[@id=\"edit-title\"]");
	By section= By.xpath("//*[@id=\"edit-term-node-tid-depth\"]");
	By sortby= By.xpath("//*[@id=\"edit-sort-by\"]");
	By search= By.xpath("//*[@id=\"edit-submit-advance-metadata-search\"]");
	By signin= By.xpath("//*[@id=\"block-block-4\"]/div/div/div[2]/a[2]");
	By signname= By.xpath("//*[@id=\"edit-name\"]");
	By password= By.xpath("//*[@id=\"edit-pass\"]");
	
	public Indiagovt(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void regclick()
	{
		driver.findElement(register).click();
	}
	
	public void values(String uname,String mail,String fname,String lname)
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
	}
	
	public void values1()
	{
		WebElement cntrydrop=driver.findElement(country);
		Select dropcntry= new Select(cntrydrop);
		dropcntry.selectByValue("166230");
	}
	
	public void values2()
	{
		WebElement statedrop=driver.findElement(state);
		Select dropstate= new Select(statedrop);
		dropstate.selectByValue("297102");
	}
	
	public void values3(String pcode)
	{
		driver.findElement(pincode).sendKeys(pcode);
	}
	
	public void values4()
	{
		WebElement edudrop=driver.findElement(education);
		Select dropedu= new Select(edudrop);
		dropedu.selectByValue("Graduate/Post Graduate-General");
	}
	
	public void click()
	{
		driver.findElement(create).click();
	}
	
	public void mouseover()
	{
		WebElement topics= driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a/img"));
		Actions act=new Actions(driver);
		act.moveToElement(topics).perform();
	}
	
	public void screenshot() throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//full page
		FileHandler.copy(src, new File("C:\\Users\\Ranjitha\\OneDrive\\Desktop\\screen20.png"));
	}
	public void elescreenshogt() throws IOException
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img"));//particular element
		File src1= button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("C:\\Users\\Ranjitha\\OneDrive\\Desktop\\screen21.png"));
	}
	
	public void clickk()
	{
		driver.findElement(adsearch).click();
	}
	public void values5(String ttl)
	{
		driver.findElement(title).sendKeys(ttl);
	}
	public void values6()
	{
		WebElement sectiondrop= driver.findElement(section);
		Select dropstn= new Select(sectiondrop);
		dropstn.selectByValue("166722");
	}
	public void values7()
	{
		WebElement sortdrop= driver.findElement(sortby);
		Select dropsort= new Select(sortdrop);
		dropsort.selectByValue("changed");
	}
	public void clickkk()
	{
		driver.findElement(search).click();
	}
	
	public void clickss()
	{
		driver.findElement(signin).click();
	}
	
	public void values8()
	{
		WebElement signnameele= driver.findElement(signname);
		signnameele.sendKeys("suni");
		WebElement passwordele= driver.findElement(password);
		Actions actions= new Actions(driver);
	    actions.keyDown(signnameele,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	    actions.keyDown(signnameele,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	    actions.keyDown( passwordele,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	    actions.perform();
	}


}
