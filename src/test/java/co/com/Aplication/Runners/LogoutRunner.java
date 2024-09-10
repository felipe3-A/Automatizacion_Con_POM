package co.com.Aplication.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/logout.feature",
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "co.com.Aplication.StepsDefinitions"


)


public class LogoutRunner {
}
