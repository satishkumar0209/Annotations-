package play;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autonav {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "";
		String purl = "https://www.youtube.com";
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get(purl + "/watch?v=LOZNKZfiFUw");

		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement Auto = playerselements.Toggle(driver);
		Helpher.highLightElement(driver, Auto);
		a.moveToElement(Auto).click().build().perform();
		System.out.println("Autonav toggle is off paly 3 videos in playlist");
		
		Thread.sleep(4000);
		driver.get(purl+"/results?search_query=telugu+playlist&pbjreload=10");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@class='style-scope ytd-playlist-renderer'])[1]")).click();
		
		String url1=driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(url1);
		
		
		Thread.sleep(2000);
try {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='ytp-ad-skip-button ytp-button']")));
			driver.findElement(By.xpath("//*[@class='ytp-ad-skip-button ytp-button']")).click();
			
		}

		catch (Exception e) {
			System.out.println("Catch block running");
		}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ytp-progress-bar")));
		WebElement ele = driver.findElement(By.className("ytp-progress-bar "));
		int width = ele.getSize().getWidth();
		System.out.println(width);
		a.moveToElement(ele).moveByOffset((width / 1) - 829, 0).click().perform();
		


	}

}
