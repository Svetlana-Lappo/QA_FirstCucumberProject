package de.sconto.steps;

import de.sconto.pages.HomePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static de.sconto.pages.HomePage.baseURL;

public class HomePageSteps implements En {

    HomePage homepage;

    public HomePageSteps(){

        Given("I am on the Homepage", () -> {
           // System.setProperty("selenide.browser","Edge");
            homepage = open(baseURL,HomePage.class);
            homepage.acceptCookies();
        });
    }
}
