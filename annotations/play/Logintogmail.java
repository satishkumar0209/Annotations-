package play;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logintogmail {

	public void gmail(WebDriver driver) throws InterruptedException {

		String url = "https://www.youtube.com/";

		driver.get(url);

		try {
			
			System.out.println("Try block running");
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			driver.findElement(By.xpath("//*[text()='Sign in']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Email or phone']")));

			driver.findElement(By.xpath("//*[@placeholder='Email or phone']")).sendKeys("sftest.desktop002@gmail.com");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Password']")));
			
			driver.findElement(By.xpath("//*[@placeholder='Password']")).click();

			driver.findElement(By.id("Passwd")).sendKeys("yt_testing");

			driver.findElement(By.id("signIn")).click();
		}

		catch (Exception e) {
			System.out.println("Catch block running");
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			driver.get(url);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Sign in']")));

			driver.findElement(By.xpath("//*[text()='Sign in']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));

			driver.findElement(By.id("identifierId")).sendKeys("");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='CwaK9']")));

			driver.findElement(By.xpath("//*[@class='CwaK9']")).click();

			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Enter your password']")));

			driver.findElement(By.xpath("//*[@aria-label='Enter your password']")).sendKeys("");

			driver.findElement(By.xpath("//*[@class='CwaK9']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("img")));

		}
	}

}
