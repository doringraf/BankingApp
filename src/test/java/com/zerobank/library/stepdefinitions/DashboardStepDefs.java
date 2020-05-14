package com.zerobank.library.stepdefinitions;

import com.zerobank.library.pages.AccountActivity;
import com.zerobank.library.pages.DashboardMenuPage;
import com.zerobank.library.utilities.BrowserUtils;
import com.zerobank.library.utilities.Constants;
import com.zerobank.library.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DashboardStepDefs {
    DashboardMenuPage dashboardMenuPage = new DashboardMenuPage();
    AccountActivity accountActivity = new AccountActivity();

    @Given("{} page should have the title {string}")
    public void account_summary_page_should_have_the_title(String page, String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
