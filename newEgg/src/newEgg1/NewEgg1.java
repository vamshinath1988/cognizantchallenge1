

package newEgg1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NewEgg1 {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
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

	
	
	List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zA zE']"));

	// Mailer name for which i want to check do i have an email in my inbox 
	String MyMailer = "info@newegg.com";

	// real logic starts here
	for(int i=0;i<unreademeil.size();i++){
	    if(unreademeil.get(i).isDisplayed()==true){
	        // now verify if you have got mail form a specific mailer (Note Un-read mails)
	        // for read mails xpath loactor will change but logic will remain same
	        if(unreademeil.get(i).getText().equals(MyMailer)){
	            System.out.println("Yes we have got mail form " + MyMailer);
	            // also you can perform more actions here 
	            // like if you want to open email form the mailer
	            break;
	        }else{
	            System.out.println("No mail form " + MyMailer);
	        }
	    }
	
	
	
	
	
	
//	List<WebElement> email = driver.findElements(By.xpath("//span[text()='Newegg.com - Password Retrieve']"));
//	
//	System.out.println(email.size());
//
//	for(WebElement emailsub : email){
//	    if(emailsub.getText().equals("Newegg.com - Password Retrieve") == true){
//
//	           emailsub.click();
//	           break;
//	        }
//	    }
	
	
	
	
	
	driver.findElement(By.xpath("//a[contains(@href,'https://secure.newegg.com/NewMyAccount/CreatePassword.aspx')]")).click();
	

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
	}
	}
}
