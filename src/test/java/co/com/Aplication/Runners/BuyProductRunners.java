package co.com.Aplication.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buyProducts.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "co.com.Aplication.StepsDefinitions",
        plugin = "pretty"
)


public class BuyProductRunners {
}
