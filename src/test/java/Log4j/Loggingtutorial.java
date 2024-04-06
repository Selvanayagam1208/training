package Log4j;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loggingtutorial {
	public static Logger log;
	public static WebDriver driver;
	public static void main(String[] args) {
		log=LogManager.getLogger(Loggingtutorial.class);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		log.info("chrome setup successfully completed");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("setting timeout for 10 seconds");
		driver.get("https://myntra.com/");
		log.info("Logged into myntra");
		try {
			boolean displayed = driver.findElement(By.xpath("//a[contains(text(),'Women')]")).isDisplayed();
			System.out.println("successfully completed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			log.error("Excption occured",new Exception("no such element"));
		}
		finally
		{
			driver.quit();
			log.info("quit the browser");
		}
		
	}
}
