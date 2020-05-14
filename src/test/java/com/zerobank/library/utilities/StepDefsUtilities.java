package com.zerobank.library.utilities;
import java.util.*;
import com.zerobank.library.pages.AccountActivity;
import com.zerobank.library.pages.AccountSummary;
import com.zerobank.library.pages.DashboardMenuPage;
import com.zerobank.library.pages.LoginPage;

public class StepDefsUtilities {
   static AccountActivity accountActivity = new AccountActivity();
    static  LoginPage loginPage = new LoginPage();
    static AccountSummary accountSummary = new AccountSummary();
    static DashboardMenuPage dashboardMenuPage = new DashboardMenuPage();

    public static List<String> getListOf(String listOf){
       List<String> columnContent;
        columnContent = BrowserUtils.getElementsText(accountActivity.allDeposit);
        switch (listOf){
            case "deposit":
                columnContent = BrowserUtils.getElementsText(accountActivity.allDeposit);
                break;
            case "withdrawal":
                columnContent = BrowserUtils.getElementsText(accountActivity.allWithdrawal);
        }
        return columnContent;

    }
}
