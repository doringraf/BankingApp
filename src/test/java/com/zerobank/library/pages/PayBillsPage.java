package com.zerobank.library.pages;

import com.zerobank.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage {
    public PayBillsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "sp_payee")
    public WebElement payeeOptions;

    @FindBy(id = "sp_account")
    public WebElement accountOptions;

    @FindBy(id = "sp_amount")
    public WebElement amountInput;

    @FindBy(id = "sp_date")
    public WebElement dateInput;

    @FindBy(id = "sp_description")
    public WebElement descriptionInput;

    @FindBy(id = "pay_saved_payees")
    public WebElement payButton;

    @FindBy(id = "alert_content")
    public WebElement alertMessageBox;

    @FindBy(id = "np_new_payee_name")
    public WebElement newPayeeNameInput;

    @FindBy(id = "np_new_payee_address")
    public WebElement newPayeeAddressInput;

    @FindBy(id = "np_new_payee_account")
    public WebElement newPayeeAccountInput;

    @FindBy(id = "np_new_payee_details")
    public WebElement newPayeeDetailsInput;

    @FindBy(id = "add_new_payee")
    public WebElement addNewPayeeButton;


}
