package de.sconto.steps;

import de.sconto.pages.LoginPage;
import io.cucumber.java8.En;


import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;


public class LoginSteps implements En {

    LoginPage loginPage;

    public LoginSteps() throws InterruptedException {

        When("I click on the Login icon",() ->{
            loginPage = page(LoginPage.class);
            loginPage.clickOnLoginTab();
        });
        Then("I see Login page", () ->{
            loginPage.loginHeader().should(exist);
            loginPage.loginHeader().shouldHave(text("Anmelden"));
        });
        When("I insert valid user credentials", () ->{
            loginPage.validLoginInput();
        });
        And("I click on the Login button", () ->{
            loginPage.clickOnSubmitButton();
        });
        Then("I should see MyAccount icon", () ->{
            loginPage.validMyAccountIcon().should(exist);
        });
        When("I click on MyAccount icon",() ->{
            loginPage.clickOnMyAccountIcon();
        });
        Then("I should see my Name",() ->{
            loginPage.accountTitle().should(exist);
            loginPage.accountTitle().shouldHave(text("Hallo, Sophia Krum"));
        });



    }
}


