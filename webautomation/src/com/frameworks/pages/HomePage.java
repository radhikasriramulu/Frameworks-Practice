package com.frameworks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.frameworks.util.Browsers;
import com.frameworks.util.PageDriver;
import com.frameworks.util.WBy;
import com.frameworks.util.WJavascriptExecutor;


public class HomePage extends PortalPage {

    public HomePage(PageDriver driver) {
        super(driver);
        _logger.debug("Open Home Page");
        driver.findElement("header.home").click();
    }

    public int getSliderItemsCount() {
        return driver.findElements("home.slider.items").size();
    }
    


    public boolean getFacebookPage()
    {
        boolean status = false;
        try{
	        driver.visibilityWait(WBy.get("header.social.fblink"));
            if(driver.getBrowser() != Browsers.HtmlUnit) {
                WebDriver wd = driver.getWebDriver();
                WebElement element = wd.findElement(WBy.get("header.social.fblink"));
                WJavascriptExecutor js = new WJavascriptExecutor(wd, element);
                js.executeScript("arguments[0].click();");
            }
            else
            {
                driver.findElement("header.social.fblink").click();
            }

            status = driver.getCurrentUrl().contains("facebook")?true:false;
        }
        catch(Exception e)
        {
        	_logger.error(e);
        }
        return status;
    }


}
