package com.zerobank.library.stepdefinitions;

import com.zerobank.library.pages.DashboardMenuPage;
import com.zerobank.library.pages.PayBillsPage;
import io.cucumber.java.en.*;

import java.util.Map;

public class PayeeStepDefs {
    PayBillsPage payBillsPage = new PayBillsPage();
DashboardMenuPage dashboardMenuPage= new DashboardMenuPage();
    @Given("{} tab")
    public void add_New_Payee_tab(String tabName) {
        dashboardMenuPage.goToTab(tabName);
    }


    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> table) {
        payBillsPage.newPayeeNameInput.sendKeys(table.get("Payee Name"));
        payBillsPage.newPayeeAddressInput.sendKeys(table.get("Payee Address"));
        payBillsPage.newPayeeAccountInput.sendKeys(table.get("Account"));
        payBillsPage.newPayeeDetailsInput.sendKeys(table.get("Payee details"));
        payBillsPage.addNewPayeeButton.click();
    }



}
