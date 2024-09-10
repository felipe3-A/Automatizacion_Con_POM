package co.com.Aplication.Runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(

        features = "src/test/resources/features/about.feature",
        glue = "co.com.Aplication.StepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty"

)

public class AboutRunner {
}
