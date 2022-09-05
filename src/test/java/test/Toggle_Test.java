package test;

import org.junit.Test;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import pages.BasePage;
import pages.ToggleAllPage;
import util.BrowserFactory;

public class Toggle_Test extends BasePage {
	WebDriver driver;

	@Test
	public void validatingCheckBox() throws InterruptedException {
		driver = BrowserFactory.init();

		ToggleAllPage toggleAll = PageFactory.initElements(driver, ToggleAllPage.class);
		toggleAll.addInputElement("RowdaaaRuth" + generateRandomNo(999));
		toggleAll.clickAddButtonElement();
		toggleAll.addInputElement("Selenium7770011" + generateRandomNo(999));
		toggleAll.clickAddButtonElement();
		toggleAll.addInputElement("Java777555" + generateRandomNo(999));
		toggleAll.clickAddButtonElement();
		toggleAll.clickToggleAllButton();

		Assert.assertEquals("Toggle All Checked", "Toggle All Checked");
			
		toggleAll.toggleReClickButton();
		toggleAll.chooseOneElement();
		toggleAll.clickRemoveButtonElement();
		toggleAll.clickToggleAllButton();
		toggleAll.clickRemoveButtonElement();

	}

}
