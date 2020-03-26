package AdactinTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends BaseClass {
	
	public WebElement getNoOfRoom() {
		return noOfRoom;
	}


	public WebElement getNoOfDays() {
		return noOfDays;
	}


	public WebElement getPricePerDay() {
		return pricePerDay;
	}


	public WebElement getTotalPrice() {
		return totalPrice;
	}


	public WebElement getGstAmt() {
		return gstAmt;
	}


	public WebElement getFinalToatal() {
		return finalToatal;
	}


	@FindBy(id="room_num_dis")
	private WebElement noOfRoom;
	
	@FindBy(id="total_days_dis")
	private WebElement noOfDays;
	
	@FindBy(id="price_night_dis")
	private WebElement pricePerDay;
	
	@FindBy(id="total_price_dis")
	private WebElement totalPrice;
	
	@FindBy(id="gst_dis")
	private WebElement gstAmt;
	
	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotelName() {
		return hotelName;
	}


	@FindBy(id="final_price_dis")
	private WebElement finalToatal;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement location;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement hotelName;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement roomType;
	
	
	public WebElement getRoomType() {
		return roomType;
		
	}


	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}

}
