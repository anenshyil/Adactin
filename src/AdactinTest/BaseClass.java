package AdactinTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javafx.beans.property.SetProperty;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver driverLaunch(String drivername) {
		
		if(drivername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(drivername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\gecko.exe");
			driver=new FirefoxDriver();
		}
		else if(drivername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\driver\\internetexplorer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
			return driver;
		}
	
	public static Boolean isDisplayedcheck(WebElement element)
	{
		return element.isDisplayed();
	}
	
	public static void clearField(WebElement element)
	{
		element.clear();
	}
	
	public static void launchUrl(String url)
	{
		driver.get(url);
	}
	
	public static void sendKeyText(WebElement element,String text) 
	{
		element.sendKeys(text);
			}
	
	public static void takemyscreen(String filename) throws Throwable {
		File des=new File(System.getProperty("user.dir")+"//Screenshots//"+filename+".png");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(temp, des);
	}
	
	public static void clickElement(WebElement element) {
		element.click();
	}
	
	
	public static void dropDownSelect(WebElement element,String method,String value) throws InterruptedException {
		//Thread.sleep(5000);
		Select sc=new Select(element);
		
		if(method.equalsIgnoreCase("value"))
		{
			sc.selectByValue(value);			
		}
		else if(method.equalsIgnoreCase("index"))
		{
			int value1=Integer.parseInt(value);
			sc.selectByIndex(value1);
		}
		else if(method.equalsIgnoreCase("text"))
		{
			sc.selectByVisibleText(value);
		}
		
	}
	
	public static void mouseHover(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static void mouseHoverClick(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).click().build().perform();
	}
	public static void ExplicitWait(WebElement element) {
		WebDriverWait w=new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(element));

	}
	
	public static String getElementAttribute(WebElement element) {
		
		return element.getAttribute("value");

	}
	
	public static String getElementText(WebElement element) {
		
		return element.getText();

	}
}
