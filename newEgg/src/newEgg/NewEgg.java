package newEgg;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class NewEgg {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.newegg.com/");
	
	driver.findElement(By.xpath("//a[contains(@href,'https://secure.newegg.com/NewMyAccount/AccountLogin.aspx')]")).click();
	driver.findElement(By.xpath("//a[contains(@href,'https://secure.newegg.com/NewMyAccount/LoginAssistance.aspx')]")).click();
	
	driver.findElement(By.name("loginname")).sendKeys("ctschallenge1@gmail.com");
	
try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.className("btnSubmit")).click();
	//driver.get("https://www.google.com/gmail/about/#");
	driver.navigate().to("https://www.google.com/gmail/about/#");
	
	driver.findElement(By.xpath("//a[contains(@href,'https://accounts.google.com/AccountChooser?service=mail&continue=https://mail.google.com/mail/')]")).click();
	
	driver.findElement(By.id("identifierId")).sendKeys("ctschallenge1@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	
	driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("2018@Challenge");
	driver.findElement(By.id("passwordNext")).click();
	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=':3a']")).click();
	/*List<WebElement> email = driver.findElements(By.xpath("//*[@id=':3a']"));
	
	System.out.println(email.size());

	for(WebElement emailsub : email){
	    if(emailsub.getText().equals("Newegg.com - Password Retrieve") == true){

	           emailsub.click();
	           break;
	        }
	    }
	
*/	driver.findElement(By.xpath("//a[contains(@href,'https://secure.newegg.com/NewMyAccount/CreatePassword.aspx')]")).click();
	

java.util.Set<String> st = driver.getWindowHandles();
java.util.Iterator<String> it = st.iterator();
String pid = it.next();
String cid = it.next();
driver.switchTo().window(cid);
System.out.println(driver.getTitle());

driver.findElement(By.id("newpassword")).sendKeys("Connector@1");
driver.findElement(By.id("newpassword1")).sendKeys("Connector@1");
	driver.findElement(By.className("atnSecondary")).click();
	driver.findElement(By.xpath("//a[contains(@href,'https://secure.newegg.com/NewMyAccount/AccountLogin.aspx')]")).click();
	driver.findElement(By.id("UserName")).sendKeys("ctschallenge1@gmail.com");
	driver.findElement(By.id("UserPwd")).sendKeys("Connector@1");
	driver.findElement(By.className("btnSubmit")).click();
	
	driver.findElement(By.id("haQuickSearchBox")).sendKeys("Micro SD Card");
	driver.findElement(By.xpath("//*[@id='haFormQuickSearch']/div/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"bodyArea\"]/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[10]/a")).click();
	driver.findElement(By.xpath("//*[@id='landingpage-cart']/div/div[2]/button")).click();
	
	driver.findElement(By.id("haQuickSearchBox")).sendKeys("PS4 games");
	driver.findElement(By.xpath("//*[@id='haFormQuickSearch']/div/div[3]/button")).click();
	driver.findElement(By.xpath("//a[contains(@href,'Item=N82E16879261688&cm_re=PS4_games-_-79-261-688')]")).click();
	driver.findElement(By.xpath("//*[@id='landingpage-cart']/div/div[2]/button")).click();
	
	driver.findElement(By.id("haQuickSearchBox")).sendKeys("Smart Thermostats");
	driver.findElement(By.xpath("//*[@id='haFormQuickSearch']/div/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"bodyArea\"]/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[8]/div/a")).click();
	driver.findElement(By.xpath("//*[@id='landingpage-cart']/div/div[2]/button")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("(//a[@class='fa fa-close centerPopup-close button-decline'])[4]")).click();
	
	driver.findElement(By.name("CHKITEM")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//driver.findElement(By.xpath("//*[@id='SelectedAlert']")).click();
	
	System.out.println(driver.findElement(By.xpath("//*[@id=\"bodyArea\"]/div[10]/form[1]/table[1]/thead/tr/th[1]/h1")).getText());
	
	}
}
