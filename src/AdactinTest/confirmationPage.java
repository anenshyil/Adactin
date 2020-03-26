package AdactinTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmationPage extends BaseClass{
	


	public WebElement getLocationname() {
		return locationname;
	}

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement locationname;



	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement hotelName;

	

	public WebElement getHotelName() {
		return hotelName;
	}

	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement checkindate;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private	WebElement checkOutDate;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement noOfDays;
	
	
	
	public WebElement getNoOfDays() {
		return noOfDays;
	}

	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement noOfRooms;
	
	
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}



	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement roomType;
	


	public WebElement getRoomType() {
		return roomType;
	}



	@FindBy(xpath="//input[@type='radio']")
	private WebElement checkradiobutton;
	
	
	
	public WebElement getCheckradiobutton() {
		return checkradiobutton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getPricePerNight() {
		return pricePerNight;
	}

	public WebElement getTotalPrice() {
		return TotalPrice;
	}

	public WebElement getGST() {
		return GST;
	}

	public WebElement getFinaBilledValue() {
		return finaBilledValue;
	}

	@FindBy(xpath="//input[@type='submit']")
	private WebElement	continueButton;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement pricePerNight;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	private WebElement  TotalPrice;
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	private WebElement GST;
	
	@FindBy(xpath="(//input[@type='text'])[10]")
	private WebElement finaBilledValue;

	public confirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
}
