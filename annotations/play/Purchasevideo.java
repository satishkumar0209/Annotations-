package play;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Purchasevideo {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "";
		String purl = "https://www.youtube.com";
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get(purl  );
		
		Logintogmail log=new Logintogmail();
		log.gmail(driver);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Purchases']")));
		driver.findElement(By.xpath("//*[text()='Purchases']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Life Of Pi']")));
		driver.findElement(By.xpath("//*[@title='Life Of Pi']")).click();
		
		Playercontrol play=new Playercontrol();
		play.players(driver);
		
		
	}

}
