package annotations;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calltoactioninlivepage {
	public void call(WebDriver driver) throws IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='iv-promo-img iv-click-target']")));

		driver.findElement(By.xpath("//*[@class='iv-promo-img iv-click-target']")).click();
		Set<String> set = driver.getWindowHandles();

		Iterator<String> it = set.iterator();

		String pw = it.next();

		String cw = it.next();

		String ccw = it.next();

		System.out.println(cw);

		driver.switchTo().window(ccw);

		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.switchTo().window(pw);
		

	}

}
