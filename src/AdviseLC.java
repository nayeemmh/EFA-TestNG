import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdviseLC {
	
	 public String baseUrl = "http://103.36.103.63/KANDAREEBANKING/Home";
	 String driverPath = "E:\\Selenium\\Chromedriver.exe";
	 public WebDriver driver; 
	 Actions actions;
	    
	    
  @Test (priority = 0)
  public void Login() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      driver.manage().window().maximize();
      driver.findElement(By.name("UserCode")).sendKeys("Mis");
      driver.findElement(By.name("Password")).sendKeys(" ");
      driver.findElement(By.xpath("/html/body/form/div/div/div/div/div[2]/div[8]/button")).click();
      String expectedtitle = "Export Finance Management";
      String actualtitle = driver.getTitle();
      Assert.assertEquals(actualtitle, expectedtitle);
  }
  
  @Test (priority = 1)
  public void LcAdvise() {
	  
	  WebElement element = driver.findElement(By.xpath("//*[@id=\"dockpanel\"]/div[3]"));
	  actions.moveToElement(element).perform();
	  actions.moveToElement(element).moveToElement(driver.findElement(By.xpath("//*[@id=\"dockpanel\"]/div[3]/div/ul/li[1]/a"))).click().build().perform();
		
  }
}
