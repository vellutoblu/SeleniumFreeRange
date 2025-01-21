package pages;

public class MainPage extends BasePage {

    //locatos
    private String searchButton = "/div" ;

    public MainPage(){
        super(driver);
    }

    //Method to navigate to 'www.freerangetester.com'
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
        clickElement(searchButton);
    }
    
}
