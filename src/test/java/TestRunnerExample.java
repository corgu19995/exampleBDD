import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/"
        ,glue={"co/com/cliente/proyecto/test/stepdefinition/"}
        ,format = {"pretty", "json:target/result.json"}
)
public class TestRunnerExample {

}
