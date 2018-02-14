package newEgg;


import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class NewEgg {
	
	public static void main(String[] args) {
		
		FileInputStream f;
		 XSSFWorkbook wb;
		XSSFSheet s ;
		XSSFRow r ;
		XSSFCell c;


		
		String s1 = null;
		try {
			s1 = getCellData(1,0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s2 = null;
		try {
			s2 = getCellData(2,0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s3 = null;
		try {
			s3 = getCellData(3,0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s4 = null;
		try {
			s4 = getCellData(1,1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);


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
	/*try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
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
	
	driver.findElement(By.id("haQuickSearchBox")).sendKeys(s1);
	driver.findElement(By.xpath("//*[@id='haFormQuickSearch']/div/div[3]/button")).click();
	driver.findElement(By.xpath("//a[contains(@href,'https://www.newegg.com/Product/Product.aspx?Item=9SIA12K6PZ9055&cm_re=Micro_SD_Card-_-20-173-285-_-Product')]")).click();
	driver.findElement(By.xpath("//*[@id='landingpage-cart']/div/div[2]/button")).click();
	
	driver.findElement(By.id("haQuickSearchBox")).sendKeys(s2);
	driver.findElement(By.xpath("//*[@id='haFormQuickSearch']/div/div[3]/button")).click();
	driver.findElement(By.xpath("//a[contains(@href,'https://www.newegg.com/Product/Product.aspx?Item=9SIAFFC6UE9309&cm_re=PS4_games-_-9SIAFFC6UE9309-_-Product')]")).click();
	driver.findElement(By.xpath("//*[@id='landingpage-cart']/div/div[2]/button")).click();
	
	driver.findElement(By.id("haQuickSearchBox")).sendKeys(s3);
	driver.findElement(By.xpath("//*[@id='haFormQuickSearch']/div/div[3]/button")).click();
	driver.findElement(By.xpath("//a[contains(@href,'https://www.newegg.com/Product/Product.aspx?Item=9SIAB0M44F3022&cm_re=Smart_Thermostats-_-9SIAB0M44F3022-_-Product')]")).click();
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

	public static String getCellData(int row, int col) throws IOException {

		FileInputStream f;
		 XSSFWorkbook wb;
		XSSFSheet s ;
		XSSFRow r ;
		XSSFCell c;
	f = new FileInputStream("C:\\Users\\nathv\\Downloads\\List.xlsx");
	
	wb = new XSSFWorkbook(f);
	s = wb.getSheet("testsheet");
	r = s.getRow(row);
	c = r.getCell(col);
	return c.getStringCellValue();

	}






	
	}

