package SeleniumAddCartAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAddCartAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		Setup ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
//		Browser window maximize command
		driver.manage().window().maximize();
		
//		Browser Get command
		driver.get("https://www.saucedemo.com/");
		
//		Browser tab working time command
		Thread.sleep(3000);
		
		
//		==========================
//		@Test Login
//		==========================
		
//		Get the filed UserName
		WebElement UserName = driver.findElement(By.xpath("//input[@id='user-name']"));
		UserName.sendKeys("standard_user");
		
//		Get the filed Password
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("secret_sauce");
		
//		Browser tab working time command
		Thread.sleep(3000);
		
//		Get the filed Login button
		WebElement LoginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		LoginButton.click();
		
//		Browser tab working time command
		Thread.sleep(3000);
		
		
		
		
//		==========================
//		@Test Add to Cart
//		==========================
		
//		Get the click Product Add button
		WebElement AddButton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
		AddButton.click();
		
//		Browser tab working time command
		Thread.sleep(3000);
		
//		Get the click cart icon
		WebElement CartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		CartIcon.click();
		
//		Browser tab working time command
		Thread.sleep(3000);
		
		
		
		
//		================================
//		@Test Checkout and Checkout Info
//		================================
		
//		Get the click Checkout button
		WebElement CheckoutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
		CheckoutButton.click();
		
//		Browser tab working time command
		Thread.sleep(3000);
		
//		Get the filed FirstName
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		FirstName.sendKeys("Omar");
		
//		Get the filed LastName
		WebElement LastName = driver.findElement(By.xpath("//input[@id='last-name']"));
		LastName.sendKeys("Faruk");
		
//		Get the filed PostCode
		WebElement PostCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		PostCode.sendKeys("1216");
		
//		Browser tab working time command
		Thread.sleep(3000);
		
		
//		Get the click Continue button
		WebElement ContinueButton = driver.findElement(By.xpath("//input[@id='continue']"));
		ContinueButton.click();
		
//		Browser tab working time command
		Thread.sleep(3000);
		
		
//		Get the click Finish button
		WebElement FinishButton = driver.findElement(By.xpath("//button[@id='finish']"));
		FinishButton.click();
		
//		Browser tab working time command
		Thread.sleep(3000);
		
		
//		Get the click BackHome button
		WebElement BackHomeButton = driver.findElement(By.xpath("//button[@id='back-to-products']"));
		BackHomeButton.click();
		
//		Browser tab working time command
		Thread.sleep(3000);
		
		
		
//		==========================
//		@Test Logout
//		==========================
		
//		Get the click Menu button
		WebElement MenuButton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		MenuButton.click();
		
//		Browser tab working time command
		Thread.sleep(3000);
		
//		Get the click Logout button
		WebElement LogoutButton = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		LogoutButton.click();
		
		
//		Browser tab working time command
		Thread.sleep(6000);
		
//		Browser tab close command
		driver.quit();

	}

}
