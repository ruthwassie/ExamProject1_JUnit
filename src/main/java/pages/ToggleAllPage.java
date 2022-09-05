package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ToggleAllPage {

	WebDriver driver;

	public void toggleAll(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement ADD_INPUT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement ADD_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='on']")
	WebElement TOGGLE_ALL_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@value='on']")
	WebElement TOGGLE_RECLICK_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li/input")
	WebElement CHOOSE_ONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_BUTTON_ELEMENT;

	public void addInputElement(String something) throws InterruptedException {
		ADD_INPUT_ELEMENT.sendKeys(something);
		Thread.sleep(3000);

	}

	public void clickAddButtonElement() throws InterruptedException {
		ADD_BUTTON_ELEMENT.click();
		Thread.sleep(3000);
	}

	public void clickToggleAllButton() throws InterruptedException {
		TOGGLE_ALL_BUTTON.click();
		Thread.sleep(3000);
	}

	public void toggleReClickButton() throws InterruptedException {
		TOGGLE_RECLICK_ELEMENT.click();
		Thread.sleep(3000);
	}

	public void chooseOneElement() throws InterruptedException {
		CHOOSE_ONE_ELEMENT.click();
		Thread.sleep(3000);
		REMOVE_BUTTON_ELEMENT.click();

	}

	public void clickRemoveButtonElement() throws InterruptedException {
		TOGGLE_ALL_BUTTON.click();
		Thread.sleep(3000);
		REMOVE_BUTTON_ELEMENT.click();

	}

}
