package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Linkcardnormaluser {

	public void linkcardnormaluser(WebDriver driver) throws InterruptedException {
		driver.get("https://www.youtube.com/cards?v=kL22yYZbF6Y");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='Add card']")).click();

		driver.findElement(By.xpath("(//*[@class='annotator-clickcard-right'])[5]")).click();
		
		driver.findElement(By.id("annotator-prs-url-link")).sendKeys("https://www.impactguru.com/how-it-works?utm_source=28may-mobile&utm_campaign=all&utm_medium=sema&device=c&matchtype=e&keyword=crowdfunding%20sites&adposition=1t1&adgroup=60810276636&model=&location=1007765&network=g&source=google&medium=sema&gclid=Cj0KCQiArenfBRCoARIsAFc1FqfPvXeDnf_KylQW6Wri8GNfv2Y3k5BiZPNjiHZiDl7TukJoIDR5PKUaAgJ3EALw_wcB\n");
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@placeholder='e.g. “Support us”']")).sendKeys("hello");
		
		driver.findElement(By.xpath("//*[@placeholder='e.g. “Support our next project”']")).sendKeys("Hai");

		driver.findElement(By.xpath("//*[text()='Create card']")).click();
		
		driver.findElement(By.xpath("//*[text()='Add card']")).click();

		driver.findElement(By.xpath("(//*[@class='annotator-clickcard-right'])[5]")).click();
		
		driver.findElement(By.id("annotator-prs-url-link")).sendKeys("https://www.spreadshirt.com/sell-merchandise");

		driver.findElement(By.xpath("//*[text()='Next']")).click();

		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

		driver.findElement(By.id("annotator-prs-title-merch")).clear();

		driver.findElement(By.id("annotator-prs-title-merch")).sendKeys("spreadshirt");

		driver.findElement(By.name("custom_message")).sendKeys("Hai");

		driver.findElement(By.name("teaser_text")).sendKeys("hello");

		driver.findElement(By.xpath("//*[text()='Create card']")).click();
	}

}
