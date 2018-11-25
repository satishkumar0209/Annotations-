package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Editingcards {

	public void threewayseditingcards(WebDriver driver) throws InterruptedException {
		driver.get("https://www.youtube.com/my_videos");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@aria-label='Expand edit options'])[1]")).click();
		driver.findElement(By.xpath("(//*[text()='Cards'])[20]")).click();

		WebElement link = driver.findElement(By.id("creator-editor-title-link"));

		String keysPressed = Keys.chord(Keys.CONTROL, Keys.RETURN);

		link.sendKeys(keysPressed);

		windows win = new windows();
		win.Handle(driver);

		String url = driver.getCurrentUrl();

		driver.get("https://www.youtube.com/new?kevlar_control=1");

		driver.findElement(By.xpath("(//*[@class='yt-new-promo-page-button'])[2]")).click();

		driver.get(url);

		driver.findElement(By.xpath("(//*[@class='creator-bar-item'])[5]")).click();

		driver.get("https://www.youtube.com/my_videos?o=U");
		
		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Edit'])[1]")));

		
		driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		
		driver.findElement(By.xpath("(//*[@class='yt-uix-sessionlink'])[5]")).click();
		
		
		
	}

}
