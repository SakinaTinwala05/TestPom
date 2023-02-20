package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import HelperClass.HelperClass;

public class BasePage2 extends HelperClass {
	
	@FindBy(id = "ap_email")
	@CacheLookup
	private WebElement email;
	
	@FindBy(id = "continue")
	@CacheLookup
	private WebElement submit;
	
	@FindBy(id = "ap_password")
	@CacheLookup
	private WebElement password;
	
	@FindBy(id = "signInSubmit")
	@CacheLookup
	private WebElement signIn;
	
	public void enterEmail(String mail) {

		sendInput(email, mail);
	}
	
	public void continueButton(String sb) {

		sendInput(submit, sb);
	}
	
	public void enterPassword(String pw) {

		sendInput(password, pw);
	}
	
	public void signInButton(String login) {

		sendInput(signIn, login);
	}
	
	public void nevigateToForm2(String url) {

		launchbrowser(url);
	}
}
