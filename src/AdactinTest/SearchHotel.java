package AdactinTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	@FindBy(name="location")
	private WebElement Location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement Hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement RoomType;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement RoomNos;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement DateIn;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement DateOut;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement AdultRooms;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement ChildRoom;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement SearchButton;

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	
	@FindBy(xpath="//a[text()='Click here to login again']")
	private WebElement	clicktologin;
	
	public WebElement getClicktologin() {
		return clicktologin;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNos() {
		return RoomNos;
	}

	public WebElement getDateIn() {
		return DateIn;
	}

	public WebElement getDateOut() {
		return DateOut;
	}

	public WebElement getAdultRooms() {
		return AdultRooms;
	}

	public WebElement getChildRoom() {
		return ChildRoom;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	
}
