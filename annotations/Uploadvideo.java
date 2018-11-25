package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Uploadvideo {

	public void video(WebDriver driver) {

		String myvideos = "https://www.youtube.com/my_videos?o=U";

		driver.get(myvideos);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yt-masthead-creation-button")));

		driver.findElement(By.id("yt-masthead-creation-button")).click();

		driver.findElement(By.id("creation-upload-menu-item")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("upload-hub-privacy-settings")));

		driver.findElement(By.id("upload-hub-privacy-settings")).click();

		driver.findElement(By.xpath("//*[@class='upload-hub-privacy-option-public yt-uix-button-menu-item']")).click();

	}
}
