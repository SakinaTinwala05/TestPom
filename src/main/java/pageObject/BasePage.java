package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import HelperClass.HelperClass;

public class BasePage extends HelperClass {

	@FindBy(id = "RESULT_TextField-1")
	@CacheLookup
	private WebElement uname;

	@FindBy(id = "RESULT_TextField-2")
	@CacheLookup
	private WebElement lname;

	@FindBy(id = "RESULT_TextField-3")
	@CacheLookup
	private WebElement phone;

	@FindBy(id = "RESULT_TextField-4")
	@CacheLookup
	private WebElement country;

	@FindBy(id = "RESULT_TextField-5")
	@CacheLookup
	private WebElement city;

	@FindBy(id = "RESULT_TextField-6")
	@CacheLookup
	private WebElement email;

	@FindBy(id = "RESULT_RadioButton-7_0")
	@CacheLookup
	private WebElement gender1;

	@FindBy(id = "RESULT_RadioButton-7_1")
	@CacheLookup
	private WebElement gender2;

	@FindBy(id = "RESULT_CheckBox-8_0")
	@CacheLookup
	private WebElement chBox1;

	@FindBy(id = "RESULT_CheckBox-8_1")
	@CacheLookup
	private WebElement chBox2;

	@FindBy(id = "RESULT_CheckBox-8_2")
	@CacheLookup
	private WebElement chBox3;

	@FindBy(id = "RESULT_CheckBox-8_3")
	@CacheLookup
	private WebElement chBox4;

	@FindBy(id = "RESULT_CheckBox-8_4")
	@CacheLookup
	private WebElement chBox5;

	@FindBy(id = "RESULT_CheckBox-8_5")
	@CacheLookup
	private WebElement chBox6;

	@FindBy(id = "RESULT_CheckBox-8_6")
	@CacheLookup
	private WebElement chBox7;

	@FindBy(id = "RESULT_RadioButton-9")
	@CacheLookup
	private WebElement dropdown;

	@FindBy(id = "RESULT_TextField-10")
	@CacheLookup
	private WebElement file;

	@FindBy(id = "FSsubmit")
	@CacheLookup
	private WebElement submit;

	public void nevigateToForm1(String url) {

		launchbrowser(url);
	}

	public void enterFname(String fname) {

		sendInput(uname, fname);
	}

	public void enterLname(String surname) {

		sendInput(lname, surname);
	}

	public void enterPhone(String mobileNo) {

		sendInput(phone, mobileNo);
	}

	public void enterCountry(String con) {

		sendInput(country, con);
	}

	public void enterCity(String ct) {

		sendInput(city, ct);
	}

	public void enterEmail(String mail) {

		sendInput(email, mail);
	}

	public void enterMalegender(String male) {

		sendInput(gender1, male);
	}

	public void enterFemalegender(String femail) {

		sendInput(gender2, femail);
	}

	public void enterSunday(String sun) {

		sendInput(chBox1, sun);
	}

	public void enterMonday(String mon) {

		sendInput(chBox2, mon);
	}

	public void enterTuesday(String tue) {

		sendInput(chBox3, tue);
	}

	public void enterWednesday(String wed) {

		sendInput(chBox4, wed);
	}

	public void enterThursday(String thur) {

		sendInput(chBox5, thur);
	}

	public void enterFriday(String fri) {

		sendInput(chBox6, fri);
	}

	public void enterSaturday(String sat) {

		sendInput(chBox7, sat);
	}

	public void enterDropDown(String dd) {

		sendInput(dropdown, dd);
	}

	public void enterFileUpload(String fp) {

		sendInput(file, fp);
	}

	public void enterSubmitBtn(String sb) {

		sendInput(submit, sb);
	}
}