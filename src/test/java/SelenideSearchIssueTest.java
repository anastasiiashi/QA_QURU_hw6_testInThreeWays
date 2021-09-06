import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideSearchIssueTest {
    private static final String REPOSITORY = "selenide/selenide";
    private static final String ISSUE = "Emulate css print media type";

    @Test
    public void searchIssueTest() {

        //Открываем главную страницу Github
        open("https://github.com");
        //Ищем репозиторий
        $(".header-search-input").setValue(REPOSITORY).submit();
        //Переходим в репозиторий
        $(linkText(REPOSITORY)).click();
        //Переходим в раздел Issues
        $(partialLinkText("Issues")).click();
        //Проверяем, что среди Issues есть необходимая
        $(withText(ISSUE)).shouldBe(visible);

    }

}
