import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LambdaStepsTest {

    private static final String REPOSITORY = "selenide/selenide";

    @Test
    public void checkRepositoryIssue() {
        step("Открываем главную страницу Github", () -> {
            open("https://github.com/");
        });
        step("Ищем репозиторий", () -> {
            $(".header-search-input").setValue(REPOSITORY).submit();
        });
        step("Переходим в репозиторий", () -> {
            $(linkText(REPOSITORY)).click();
        });

    }
}
