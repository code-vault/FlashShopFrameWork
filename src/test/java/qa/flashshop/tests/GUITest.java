package qa.flashshop.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import qa.flashshop.pages.HomePage;

public class GUITest {
	HomePage home = new HomePage();
	
	@Test
	public void testLogo() {
		home.clickOnLogo();
	}
}
