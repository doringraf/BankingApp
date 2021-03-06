package com.zerobank.library.stepdefinitions;


import com.zerobank.library.pages.AccountActivity;
import com.zerobank.library.pages.DashboardMenuPage;
import com.zerobank.library.utilities.ConfigurationReader;
import com.zerobank.library.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

public class NavigationStepDefs {
    DashboardMenuPage dashboardMenuPage = new DashboardMenuPage();
    AccountActivity accountActivity = new AccountActivity();

    @Given("I am on the {} page")
    public void i_am_on_the_Login_page(String pageName) {
        String url = ConfigurationReader.getProperty("url");

        switch (pageName.toLowerCase()){
            case "login":
                url = ConfigurationReader.getProperty("url")+"/login.html";
                Driver.getDriver().get(url);
                break;
            case "home":
                Driver.getDriver().get(url);
            case "main":
                break;
            default:
                dashboardMenuPage.goToMenu(pageName);
                break;
        }

    }

    @When("I navigate to {} page")
    public void i_navigate_to_page(String pageName) {
        dashboardMenuPage.goToMenu(pageName);
    }

    @Given("the user accesses the {} tab")
    public void the_user_accesses_the_tab(String tabName) {
        if (tabName.toLowerCase().equals("find transactions")){
            accountActivity.findTransactions.click();
        }
        dashboardMenuPage.goToTab(tabName);
    }

}
