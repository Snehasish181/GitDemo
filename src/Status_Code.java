import java.util.Optional;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v107.network.Network;
import org.openqa.selenium.devtools.v107.network.model.Request;
import org.openqa.selenium.devtools.v107.network.model.Response;

import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithAnnotationDefaultValue;
import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;


public class Status_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Grid\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	DevTools devTools=	driver.getDevTools();
	devTools.createSession();
	devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
	
	devTools.addListener(Network.requestWillBeSent(), request->
	
	{
		
	Request	req =request.getRequest();
	//System.out.println(req.getUrl());
	//System.out.println(req.getHeaders());
	}
			
			
			
			);
	
	//Even will fired -
	 
	devTools.addListener(Network.responseReceived(), response ->
	
	{
	
		Response res = response.getResponse();
		//System.out.println(res.getUrl());
		//System.out.println(res.getStatus());
		if(res.getStatus().toString().startsWith("4"))
		{
			System.out.println(res.getUrl() +" " + "is falling With Status Code" + " "+ res.getStatus());
		
		
	}
	}	
			
			);
	
	driver.get("https://rahulshettyacademy.com/angularAppdemo");
	driver.findElement(By.cssSelector("button[routerlink='/library']")).click();
	
	}

}
