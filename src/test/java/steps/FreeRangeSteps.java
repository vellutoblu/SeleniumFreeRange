package steps;

import io.cucumber.java.en.Given;
import pages.MainPage;

public class FreeRangeSteps {

    MainPage landingPage = new MainPage();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigaToFRT(){
        landingPage.navigateToFreeRangeTesters();

    }
    
}
