package pages;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage{

    public void openHomePage() {
        open(BASE_URL);
    }
}
