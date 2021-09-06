import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {


    @Step("Открываем главную страницу Github")
    public void openMainPage() {
        open("https://github.com/");

    }
    @Step("Ищем репозиторий {repository}")
    public void searchRepository(String repository) {
        $(".header-search-input").setValue(repository).submit();
    }
    @Step("Переходим в репозиторий {repository}")
    public void goToRepository (String repository) {
        $(linkText(repository)).click();

    }
    @Step("Переходим в раздел Issues")
    public void openIssuesTab() {
        $(partialLinkText("Issues")).click();
    }

    @Step("Проверяем, что среди Issues есть необходимая")
    public void checkTheIssue(String issue) {
        $(withText(issue)).shouldBe(visible);
    }
}
