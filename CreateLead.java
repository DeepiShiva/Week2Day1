package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("http://leaftaps.com/opentaps/control/main");
		chrome.manage().window().maximize();
		WebElement username = chrome.findElement(By.id("username"));
				username.sendKeys("DemoSalesManager");
		WebElement password = chrome.findElement(By.id("password"));
				password.sendKeys("crmsfa");
		chrome.findElement(By.className("decorativeSubmit")).click();
		
		chrome.findElement(By.linkText("CRM/SFA")).click();
		chrome.findElement(By.linkText("Leads")).click();
		chrome.findElement(By.linkText("Create Lead")).click();
		
		chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepika");
		chrome.findElement(By.id("createLeadForm_lastName")).sendKeys("Shiva");
		chrome.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Deepi");
		chrome.findElement(By.name("departmentName")).sendKeys("QA");
		chrome.findElement(By.name("description")).sendKeys("Automation Engineer");
		chrome.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deepika@test.com");
		
		WebElement listval = chrome.findElement(By.name("generalStateProvinceGeoId"));
		Select val = new Select(listval);
		val.selectByVisibleText("New York");
		chrome.findElement(By.name("submitButton")).click();
		String pagetitle = chrome.getTitle();
		System.out.println(pagetitle);
		//chrome.close();
		
		
		 
	}

}
