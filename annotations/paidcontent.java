package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class paidcontent {

	public void paid(WebDriver driver) 
	{
		driver.findElement(By.xpath("(//*[@class='tab-header-title'])[4]")).click();
		
		driver.findElement(By.xpath("//*[@data-ng-model='product.has_paid_product_placement']")).click();
		
		driver.findElement(By.xpath("//*[@data-ng-model='product.show_paid_product_placement_overlay']")).click();
		
		driver.findElement(By.xpath("//*[@title='Save changes made to this video']")).click();
		
		WebElement link=driver.findElement(By.id("creator-editor-title-link"));
		
		String keysPressed =  Keys.chord(Keys.CONTROL, Keys.RETURN);
	
		link.sendKeys(keysPressed) ;
		
		

	}

}
