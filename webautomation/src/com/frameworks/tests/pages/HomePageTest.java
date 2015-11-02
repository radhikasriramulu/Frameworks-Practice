package com.frameworks.tests.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.frameworks.base.BaseWebTest;
import com.frameworks.pages.HomePage;
import com.frameworks.util.Browsers;


public class HomePageTest extends BaseWebTest {

    private HomePage hp;

    @BeforeClass
    public void beforeClass() {
        hp = new HomePage(driver);
    }

    @Test(priority = 1, alwaysRun = true)
    public void testSlidesCount() throws IOException{
    if(driver.getBrowser() != Browsers.HtmlUnit) {
    	driver.getwScreenshot().takeScreenShot(driver._configuration.TakeScreenShot, driver._configuration.ScreenFolderPath);
    	assertEquals(8, hp.getSliderItemsCount());
    }
   }

    @Test(priority = 2)
    public void testFBLink()
    {
        boolean isFBPage=hp.getFacebookPage();
        assertTrue(isFBPage);
    }



}
