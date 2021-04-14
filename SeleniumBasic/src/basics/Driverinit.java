package basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverinit {
	public void prop() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Selenium Materials\\chromedriver_win32\\chromedriver.exe");

		//WebDriverWait wai=new WebDriverWait(driver, 40); 
		 //WebElement ele=wai.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"home\"]"))); 
		 //ele.click(); 
		 //WebElement but=wai.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt=\"Buttons\"]"))); but.click();
		 
	}
}
