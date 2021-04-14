package basics;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/
public class EditButton extends Driverinit{

	public static void main(String[] args) throws InterruptedException {
		// System properties have been set and called from DriverUnit class.
		Driverinit dri=new Driverinit();
		dri.prop();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		/*driver.get("http://www.leafground.com/");
		//--------------EditBox-----------------
		  //Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt=\"Edit / Text Fields\"]")).click();
		//Enter your email address
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("megaya@gmail.com");
		//Append a text and press keyboard tab - By default selenium appends the sending keys
		driver.findElement(By.xpath("//input[@type=\"text\" and @value=\"Append \"]")).sendKeys(" Hello");
		//Get default text in edit box.
		String celvalue = driver.findElement(By.xpath("//input[@name=\"username\"][1]")).getAttribute("value");
		System.out.println("The default text entered are :" + celvalue);
		//Clear the text in edit box.
		driver.findElement(By.xpath("//input[@type=\"text\" and @value=\"Clear me!!\"]")).clear();
		//Confirm that edit field is disabled
		boolean flag = driver.findElement(By.xpath("//input[@disabled=\"true\"]")).isEnabled();
		if (flag == true) {
			System.out.println("The field is ennabled");
		} else {
			System.out.println("The field is Disabled");
			}
		driver.findElement(By.xpath("//img[@alt=\"logo Testleaf\"]")).click();		 
		Thread.sleep(3000);
		//-------------Button--------------
		 * //img[@alt="Buttons"]
		driver.findElement(By.xpath("//img[@class=\"wp-categories-icon svg-image\" and @alt=\"Buttons\"]")).click();
		Thread.sleep(3000);
		//Going Back to Home
		driver.findElement(By.xpath("//button[@id=\"home\"]")).click();
		driver.findElement(By.xpath("//img[@class=\"wp-categories-icon svg-image\" and @alt=\"Buttons\"]")).click();
		//getLocation of an attribute using Points type
		Point xyco=driver.findElement(By.xpath("//button[@id=\"position\"]")).getLocation();
		int xco=xyco.getX();
		int yco=xyco.getY();
		System.out.println("X positions is : "+xco+" and Y Position is : "+yco);
		//Getting color of an button using getCssValue attribute
		String col=driver.findElement(By.xpath("//button[@id=\"color\"]")).getCssValue("background-color");
		System.out.println("color is : "+col);
		//
		Dimension size=driver.findElement(By.xpath("//button[@id=\"color\"]")).getSize();
		int hi=size.getHeight();
		int wd=size.getWidth();
		System.out.println("height is : "+hi+" Width is :"+wd);*/
		
		//-------------HyperLink--------------
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//img[@alt=\"logo Testleaf\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"Link\"]")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
