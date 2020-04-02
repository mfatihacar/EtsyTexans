package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
