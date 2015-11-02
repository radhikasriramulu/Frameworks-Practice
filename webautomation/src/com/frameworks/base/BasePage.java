package com.frameworks.base;

import org.apache.log4j.Logger;

import com.frameworks.util.PageDriver;


public abstract class BasePage {

    public Logger _logger;
    public PageDriver driver;

    public BasePage(PageDriver driver) {
        _logger = Logger.getLogger(BaseTest.class);
        this.driver = driver;
    }
}
