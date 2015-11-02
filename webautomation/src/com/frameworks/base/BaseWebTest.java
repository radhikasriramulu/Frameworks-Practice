package com.frameworks.base;

//import com.wbl.utils.ExcelUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.frameworks.util.PageDriver;
import com.frameworks.util.WBy;


public abstract class BaseWebTest extends BaseTest {

    public PageDriver driver;
//    public ExcelUtils excelUtils;

    @BeforeSuite
    public void beforeSuite() {
        driver = new PageDriver(_config);
        WBy.loadJsonMap(String.format("%s/locators.json", System.getProperty("user.dir")));
//        excelUtils = new ExcelUtils();
    }

    @AfterSuite
    public void afterSuite() {

        driver.quit();
    }

}
