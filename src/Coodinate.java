import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v107.emulation.Emulation;

public class Coodinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Grid\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools=	driver.getDevTools();
		devtools.createSession();
		Map<String,Object> Coordinates=new HashMap<String,Object>();
		Coordinates.put("latitude", 40);
		Coordinates.put("longitude", 3);
		Coordinates.put("accuracy", 1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", Coordinates);
		//devtools.send(Emulation.setGeolocationOverride(Optional.of(40),Optional.of(30), Optional.of(1)));
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
	String titleString=	driver.findElement(By.cssSelector(".our-story-card-title")).getText();
	System.out.println(titleString);
	}

}
