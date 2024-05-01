package com.adactin.Stepdefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.adactin.Runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	public static WebDriver driver =RunnerClass.driver;
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adact_in_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	    
	}

	@When("^user Enter The Username in the Username Field$")
	public void user_Enter_The_Username_in_the_Username_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Jivita04");
		
	}

	@When("^user Enter The Password in the Password Field$")
	public void user_Enter_The_Password_in_the_Password_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	}   

	@Then("^user Clicked the login and It navigated to the search hotel page$")
	public void user_Clicked_the_login_and_It_navigated_to_the_search_hotel_page() throws Throwable {
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}

	@When("^user select the Location in the Location field$")
	public void user_select_the_Location_in_the_Location_field() throws Throwable {
		WebElement Location = driver.findElement(By.xpath("//select[@id='location']"));
		Location.click();
		
		Select s = new Select(Location);
		s.selectByIndex(3);

	}

	@When("^User Select the Hotel in the Hotels field$")
	public void user_Select_the_Hotel_in_the_Hotels_field() throws Throwable {
		WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']"));	
	    Hotels.click();
         
	    Select h = new Select(Hotels);
	    h.selectByValue("Hotel Hervey");
	    
	}

	@When("^User Select the Room type in the Room type field$")
	public void user_Select_the_Room_type_in_the_Room_type_field() throws Throwable {
		WebElement Rooms = driver.findElement(By.xpath("//select[@id='room_type']"));
	    Rooms.click();
	    
	    Select r = new Select(Rooms);
	    r.selectByVisibleText("Standard");
	    
	}

	@When("^User select the number of room in the Number of Rooms field$")
	public void user_select_the_number_of_room_in_the_Number_of_Rooms_field() throws Throwable {
		WebElement nos = driver.findElement(By.xpath("//select[@id='room_nos']"));
	    nos.click();
	    Select R = new Select(nos);
	    R.selectByIndex(5);
	
	}

	@When("^User select the number of Adults per room in the Adults per room field$")
	public void user_select_the_number_of_Adults_per_room_in_the_Adults_per_room_field() throws Throwable {
		WebElement Adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
	    Adults.click();
	    
	    Select A = new Select(Adults);
	    A.selectByIndex(2);
	    Thread.sleep(3000);
	}

	@Then("^user clicked the Search button and Its navigated to the select hotel page$")
	public void user_clicked_the_Search_button_and_Its_navigated_to_the_select_hotel_page() throws Throwable {
		WebElement Sea = driver.findElement(By.xpath("//input[@value='Search']"));
	    Sea.click(); 
	    
	    Thread.sleep(3000);
	}

	@When("^user Selects The Hotel by Clicking on the Radio button field$")
	public void user_Selects_The_Hotel_by_Clicking_on_the_Radio_button_field() throws Throwable {
		WebElement Rad = driver.findElement(By.xpath("//input[@type='radio']"));
		   Rad.click();
	}

	@Then("^user Clicked the continue Button and Its navigated to the Book A Hotel page$")
	public void user_Clicked_the_continue_Button_and_Its_navigated_to_the_Book_A_Hotel_page() throws Throwable {
		WebElement Sub = driver.findElement(By.xpath("//input[@type='submit']"));
		   Sub.click();
}

	@When("^User Enter First name in the First Name field$")
	public void user_Enter_First_name_in_the_First_Name_field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Ashokkumar");
	}

	@When("^User Enter Last name in the Last Name field$")
	public void user_Enter_Last_name_in_the_Last_Name_field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Velayudham");
	}
	

	@When("^User enter address in the Billing Address field$")
	public void user_enter_address_in_the_Billing_Address_field() throws Throwable {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("29 MGR NAGAR MANGADU");
	}   

	@When("^User enter Credit Card No in the Credit Card No field$")
	public void user_enter_Credit_Card_No_in_the_Credit_Card_No_field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");
	}

	@When("^User select the credit card type in the Credit Card Type field$")
	public void user_select_the_credit_card_type_in_the_Credit_Card_Type_field() throws Throwable {
		WebElement Card = driver.findElement(By.xpath("//select[@name='cc_type']"));
		   Card.click();
		   Select CC = new Select(Card);
		   CC.selectByIndex(3);
	}

	@When("^User select the month in the Expiry Date field$")
	public void user_select_the_month_in_the_Expiry_Date_field() throws Throwable {
		WebElement Mon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		   Mon.click();
		   
		   Thread.sleep(3000);
		   
		   Select m = new Select(Mon);
		   m.selectByIndex(9);
		   
	}

	@When("^User select the year in the Expiry Date field$")
	public void user_select_the_year_in_the_Expiry_Date_field() throws Throwable {
		WebElement Year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		   Year.click();
		   
		   Thread.sleep(4000);
		   
		   Select Y = new Select(Year);
		   Y.selectByIndex(16);
	}
	

	@When("^User enter CVV number in the CVV number field$")
	public void user_enter_CVV_number_in_the_CVV_number_field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("123");
	}

	@Then("^User Clicked the Book Now And Its navigated to the Booking Confirmation page$")
	public void user_Clicked_the_Book_Now_And_Its_navigated_to_the_Booking_Confirmation_page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='button']")).click();	
		Thread.sleep(5000);
	}
	
	@Then("^user click the logout button$")
	public void user_click_the_logout_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='logout']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		   
		   File src = ts.getScreenshotAs(OutputType.FILE);
		   File des = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot\\Adactin.png");
		   FileHandler.copy(src, des);
		
		}



}
