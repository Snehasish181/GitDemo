import java.net.URI;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Predicate;

public class Basic_Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Grid\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	long starttime=	System.currentTimeMillis();
//		Predicate<URI> uripredicate= URI -> URI.getHost().contains("httpbin.org");
//		
//		((HasAuthentication)driver).register(uripredicate,UsernameAndPassword.of("foo", "bar"));
	
	//////////////////for window verification /// http://Username:Password@siteURL
	
		driver.get("http://foo:bar@httpbin.org/basic-auth/foo/bar");
		long endtime=	System.currentTimeMillis();
		System.out.println(endtime - starttime );
		
	}

}
