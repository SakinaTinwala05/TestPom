package test;

import org.testng.annotations.Test;

import pageObject.BasePage;

public class TestForm1 {

	

	@Test
	public void personalInfo() {

		BasePage bP = new BasePage();
		
		bP.nevigateToForm1(
				"https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		bP.enterEmail("Sakina12@gmail.com");
		bP.enterFname("Sakina");
		bP.enterLname("Tinwala");
		bP.enterPhone("1234567890");
		bP.enterCountry("India");
		bP.enterCity("Ahmedabad");
		bP.enterMalegender("Male");
		bP.enterFemalegender("Female");
		bP.enterSunday("Sunday");
		bP.enterMonday("Monday");
		bP.enterTuesday("Tuesday");
		bP.enterWednesday("Wednesday");
		bP.enterThursday("Thursday");
		bP.enterFriday("Friday");
		bP.enterSaturday("Saturday");
		bP.enterDropDown("Morning");
		bP.enterFileUpload(null);
		bP.enterSubmitBtn(null);

	}
}