import org.junit.jupiter.api.Test;

public class AnnotatedStepsTest {

    private static final String REPOSITORY = "selenide/selenide";
    private static final String ISSUE = "Emulate css print media type";

    private WebSteps steps = new WebSteps();

    @Test
    public void checkTheIssueInTheRepository () {
        steps.openMainPage();
        steps.searchRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssuesTab();
        steps.checkTheIssue(ISSUE);

    }
}
