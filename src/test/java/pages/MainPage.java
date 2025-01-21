package pages;

public class MainPage extends BasePage {

    public MainPage(){
        super(driver);
    }

    //Method to navigate to 'www.freerangetester.com'
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }
    
}
