package annotations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class windows {

	public void Handle(WebDriver driver) {

		Set<String> set = driver.getWindowHandles();

		Iterator<String> it = set.iterator();

		String pw = it.next();

		String cw = it.next();

		System.out.println(cw);

		driver.switchTo().window(cw);

	}

}
