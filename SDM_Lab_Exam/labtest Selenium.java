//1-27 = https://automationexercise.com/login
//	Task Common
//	1. Open webpage
//	2. Maximize the page
//	3. Get Title and print in console
//	4. Fetch data that enter in to the text box
//	5. Perform operation as per given webpage(Sign up/Login)
//	6. After login print URL in console
//	7 Close browser(After all operations/task)
package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class labtest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 WebDriver wd = new ChromeDriver();
		wd.get("https://automationexercise.com/login");
		
		wd.manage().window().maximize();

		String t = wd.getTitle();
		System.out.println(t);

		WebElement we = wd.findElement(By.xpath("//input[@name = 'email']"));
		we.sendKeys("Grs123@gmail.com");
		String w1 = we.getAttribute("value");
		System.out.println(w1);

		Thread.sleep(3000);

		WebElement ws = wd.findElement(By.xpath("//input[@name = 'password']"));
		ws.sendKeys("1234#ured");
		String w2 = ws.getAttribute("value");
		System.out.println(w2);

		String u = wd.getCurrentUrl();
		System.out.println(u);
		
		
		
		wd.close();


	}

}
