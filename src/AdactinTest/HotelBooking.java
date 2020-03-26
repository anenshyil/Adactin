package AdactinTest;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class HotelBooking extends BaseClass {
	
	Map<String, String> m= new HashMap<>();
	
	
	@BeforeClass
	public static void diverInitialization() throws Throwable {
		
		driverLaunch("chrome");
		launchUrl("https://adactin.com/HotelApp/");		
	}
	
	
	@Before
	public void Login() throws Throwable {
			HomePage hp=new HomePage();
		
		
		sendKeyText(hp.getUsername(),"AnenShyilJ");
		sendKeyText(hp.getPassword(),"UAW99V");
		
		takemyscreen("TC-101");
		

	}
	
	@Test @org.junit.Ignore
	public void TC102() throws Throwable {
		System.out.println("********************* TC- 102 *****************************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");
		dropDownSelect(sh.getRoomNos(), "value", "3");
		clearField(sh.getDateIn());
		sendKeyText(sh.getDateIn(), "10/04/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "08/04/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		clickElement(sh.getSearchButton());
		takemyscreen("Error 102");
		System.out.println("102 Completed");
	}
	
	@Test @org.junit.Ignore
	public void TC103() throws Throwable {
		
		System.out.println("***********103*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");
		dropDownSelect(sh.getRoomNos(), "value", "3");
		clearField(sh.getDateIn());
		sendKeyText(sh.getDateIn(), "28/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "01/04/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		clickElement(sh.getSearchButton());
		takemyscreen("Error 103`EnteR Valid dates`");
		System.out.println("103 Completed");

	}
	
	@Test	@org.junit.Ignore
	public void TC104() throws Throwable {
		System.out.println("***********104*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");
		
		String Location1 = getElementAttribute(sh.getLocation());
		
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");
		dropDownSelect(sh.getRoomNos(), "value", "2");
		clearField(sh.getDateIn());
		sendKeyText(sh.getDateIn(), "04/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "05/03/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		clickElement(sh.getSearchButton());
		confirmationPage cp=new confirmationPage();
		String Location2 = getElementAttribute(cp.getLocationname());
		Assert.assertEquals(Location2, Location1);
	//	System.out.println("Locations given before & after Confirmation is equal-"+Location2.equals(Location1));
		takemyscreen("TC104");
		System.out.println("104 Completed");
		
	}
	
	@Test 	@org.junit.Ignore
	public void TC105() throws Throwable {
		
		System.out.println("***********105*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");
		
		String dateIn1 = getElementAttribute(sh.getDateIn());
		String dateOut1=getElementAttribute(sh.getDateOut());
		
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");
		dropDownSelect(sh.getRoomNos(), "value", "2");
		clearField(sh.getDateIn());
		sendKeyText(sh.getDateIn(), "04/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "05/03/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		clickElement(sh.getSearchButton());
		confirmationPage cp=new confirmationPage();
		
		String dateIn2 = getElementAttribute(cp.getCheckindate());
		String dateOut2=getElementAttribute(cp.getCheckOutDate());
		
		Assert.assertEquals(dateIn2, dateIn1);
		Assert.assertEquals(dateOut2, dateOut1);
		//System.out.println("Date-in given before & after Confirmation is equal-"+dateIn2.equals(dateIn1));
		//System.out.println("Date-out given before & after Confirmation is equal-"+dateOut2.equals(dateOut1));
		takemyscreen("TC105");
		System.out.println("TC105 Completed");
		
	}
	
	@Test @org.junit.Ignore
	public void TC106() throws Throwable {
		
		System.out.println("***********106*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");		
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");
	
		dropDownSelect(sh.getRoomNos(), "value", "2");		
		String NoOfRooms1 = getElementAttribute(sh.getRoomNos());
		clearField(sh.getDateIn());
		sendKeyText(sh.getDateIn(), "04/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "05/03/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		clickElement(sh.getSearchButton());
		confirmationPage cp=new confirmationPage();
		String NoofRooms2 = getElementAttribute(cp.getNoOfRooms());
		String str = NoofRooms2.replaceAll("[^\\d]", "");
		System.out.println(NoOfRooms1+"  "+str);
		Assert.assertEquals(str, NoOfRooms1);
		//System.out.println("No. of Rooms before & after Confirmation is equal-"+str.equals(NoOfRooms1));
		takemyscreen("TC106");
		System.out.println("TC106 Completed");
		
	}
	
	@Test @org.junit.Ignore
	public void TC107() throws Throwable 
	{
		
		System.out.println("***********107*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");		
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");
		String roomtype1 = getElementAttribute(sh.getRoomType());
		dropDownSelect(sh.getRoomNos(), "value", "2");
		clearField(sh.getDateIn());
		sendKeyText(sh.getDateIn(), "04/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "05/03/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		clickElement(sh.getSearchButton());
		confirmationPage cp=new confirmationPage();
		clickElement(cp.getCheckradiobutton());
		clickElement(cp.getContinueButton());
		
		String roomtype2 = getElementAttribute(cp.getRoomType());
		System.out.println(roomtype1+"  "+roomtype2);
		Assert.assertEquals(roomtype1, roomtype2);
		//System.out.println("Room selected before & after Confirmation is equal-"+roomtype1.equals(roomtype2));
		takemyscreen("TC107");
		System.out.println("TC107 Completed");

	}
	
	@Test 		@org.junit.Ignore
	public void TC108() throws Throwable {
		
		System.out.println("***********108*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		BookAHotel bh=new BookAHotel();
		
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");		
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");
		dropDownSelect(sh.getRoomNos(), "value", "2");
		clearField(sh.getDateIn());
		sendKeyText(sh.getDateIn(), "04/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "05/03/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		clickElement(sh.getSearchButton());
		confirmationPage cp=new confirmationPage();
		clickElement(cp.getCheckradiobutton());
		clickElement(cp.getContinueButton());
		
		
		String NoOfRoomsstr = getElementAttribute(bh.getNoOfRoom());
		System.out.println(NoOfRoomsstr);
		int noOfRooms = Integer.parseInt(NoOfRoomsstr.replaceAll("[^\\d]", ""));
		String NoOfDaysstr = getElementAttribute(bh.getNoOfDays());
		int noOfDays = Integer.parseInt(NoOfDaysstr.replaceAll("[^\\d]", ""));
		String ratePerDaystr = getElementAttribute(bh.getPricePerDay());
		int ratePerDay = Integer.parseInt(ratePerDaystr.replaceAll("[^\\d]", ""));
		
		int totBeforeGST=noOfRooms*noOfDays*ratePerDay;
		
		System.out.println(noOfRooms+" "+noOfDays+" "+ratePerDay);
		String totalprice = getElementAttribute(bh.getTotalPrice());
		String totalpric = totalprice.replaceAll("[^\\d]","");
		int totalPrice = Integer.parseInt(totalpric);
		//System.out.println(totalpric);
		//System.out.println(totalPrice+" "+totBeforeGST);
		Assert.assertNotEquals(totalPrice, totBeforeGST);
		takemyscreen("TC108");
		System.out.println("TC108 Completed");		
		

	}
	@Test			@org.junit.Ignore
	public void Tc109() throws Throwable {
		
		System.out.println("***********109*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");		
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");
	
		dropDownSelect(sh.getRoomNos(), "value", "2");		
		sendKeyText(sh.getDateIn(), "04/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "05/03/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		clickElement(sh.getSearchButton());
		confirmationPage cp=new confirmationPage();
		takemyscreen("TC109");
		System.out.println("TC109 Completed");

	}
	
	
	@Test @org.junit.Ignore
	public void Tc110() throws Throwable {
		
		System.out.println("***********110*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		BookAHotel bh=new BookAHotel();
		
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");		
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");
		dropDownSelect(sh.getRoomNos(), "value", "2");
		clearField(sh.getDateIn());
		sendKeyText(sh.getDateIn(), "05/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "06/03/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		clickElement(sh.getSearchButton());
		confirmationPage cp=new confirmationPage();
		clickElement(cp.getCheckradiobutton());
		clickElement(cp.getContinueButton());		
		
		String NoOfRoomsstr = getElementAttribute(bh.getNoOfRoom());
		int noOfRooms = Integer.parseInt(NoOfRoomsstr.replaceAll("[^\\d]", ""));
		String NoOfDaysstr = getElementAttribute(bh.getNoOfDays());
		int noOfDays = Integer.parseInt(NoOfDaysstr.replaceAll("[^\\d]", ""));
		String ratePerDaystr = getElementAttribute(bh.getPricePerDay());
		int ratePerDay = Integer.parseInt(ratePerDaystr.replaceAll("[^\\d]", ""));
		
		int totBeforeGST=noOfRooms*noOfDays*ratePerDay;
		double TotalafterGst=totBeforeGST/10;
		
		
		String totalprice = getElementAttribute(bh.getFinalToatal());
		String totalpric = totalprice.replaceAll("[^\\d]","");
		int totalPriceval = Integer.parseInt(totalpric);
		Assert.assertNotEquals(totalPriceval, TotalafterGst);
		System.out.println(totalprice);
		takemyscreen("TC110");
		System.out.println("TC110 Completed");	

	}
	
	
	@Test
	public void Tc111() throws Throwable {
		
		System.out.println("***********111*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");		
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");	
		dropDownSelect(sh.getRoomNos(), "value", "2");		
		sendKeyText(sh.getDateIn(), "05/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "06/03/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		
		m.put("Location", getElementAttribute(sh.getLocation()));
		m.put("Hotel", getElementAttribute(sh.getHotel()));
		m.put("RoomType", getElementAttribute(sh.getRoomType()));
		m.put("RoomNos", getElementAttribute(sh.getRoomNos()));
		m.put("Datein", getElementAttribute(sh.getDateIn()));
		m.put("DateOut", getElementAttribute(sh.getDateOut()));
		clickElement(sh.getSearchButton());
		confirmationPage cp=new confirmationPage();
		String locationCp = getElementAttribute(cp.getLocationname());
		String loc = m.get("Location");
		System.out.println(loc+" "+locationCp+" ");
		Assert.assertEquals(m.get("Location"),locationCp);
		Assert.assertEquals(m.get("Hotel"), getElementAttribute(cp.getHotelName()));		
		Assert.assertEquals(m.get("RoomType"), getElementAttribute(cp.getRoomType()));
		Assert.assertEquals(m.get("RoomNos"),getElementAttribute(cp.getNoOfRooms()).replaceAll("[^\\d]", ""));
		Assert.assertEquals(m.get("Datein"),getElementAttribute(cp.getCheckindate()));
		Assert.assertEquals(m.get("DateOut"), getElementAttribute(cp.getCheckOutDate()));
		
		}
	

	@Test  @org.junit.Ignore
	public void Tc112() throws Throwable {
		
		System.out.println("***********112*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");		
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");	
		dropDownSelect(sh.getRoomNos(), "value", "2");		
		sendKeyText(sh.getDateIn(),"05/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "06/03/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		clickElement(sh.getSearchButton());
		
		confirmationPage cp=new confirmationPage();
		BookAHotel bh=new BookAHotel();
		clickElement(cp.getCheckradiobutton());		
		clickElement(cp.getContinueButton());
		takemyscreen("Checkcheck");

		String Gstamt = getElementAttribute(bh.getGstAmt()).replaceAll("[^\\d]", "");
		double GST = Double.parseDouble(Gstamt);
		String FinalTotal = getElementAttribute(bh.getFinalToatal()).replaceAll("[^\\d]","");
		double finaltot=(Double.parseDouble(FinalTotal))/10;
		double Totalamt=GST*0.1;
		System.out.println(GST);
		double result=Totalamt+GST;
		System.out.println(result+" "+finaltot);
		Assert.assertEquals(finaltot, result);
		takemyscreen("TC110");
		System.out.println("TC110 Completed");	
		
		
	}
	
	@Test
	public void Tc113() throws Throwable {
		
		System.out.println("***********112*****************");
		HomePage hp=new HomePage();
		SearchHotel sh=new SearchHotel();
		clickElement(hp.getSubmit());		
		dropDownSelect(sh.getLocation(), "value", "Sydney");		
		dropDownSelect(sh.getHotel(), "value","Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");	
		dropDownSelect(sh.getRoomNos(), "value", "2");		
		sendKeyText(sh.getDateIn(),"05/03/2020");
		clearField(sh.getDateOut());
		sendKeyText(sh.getDateOut(), "06/03/2020");		
		dropDownSelect(sh.getAdultRooms(), "value", "2");
		dropDownSelect(sh.getChildRoom(), "value", "2");
		
	}
	
	@After
	public void reTriggerUrl() {
		//launchUrl("https://adactin.com/HotelApp/");	
		SearchHotel sh=new SearchHotel();
		clickElement(sh.getLogout());
		clickElement(sh.getClicktologin());
		
	}
	
	@AfterClass
	public static void closeDriver()
	{
		driver.close();
	}

}