# cucumber-FizzBuzz
Cucumber Framework Demo
#cucumber
	1. Install cucumber plugin
	2. Cucumber supports maven-archetype-quickstart
	3. Right click and convert to cucumber-project
	4. Cucumber-Java and Cucumber-Junit & Junit
	5. Feature file should be created under src/test/java
	6. Similarly stepdefinition files should be under src/test/java
	7. Tidy Gherkin plugin to generate the step definitions
# Runners
	1. TestRunner with Junit
	2. TestRunner with TestNG
# CucumberOptions
    @RunWith(Cucumber.class)
    @CucumberOptions(
    features = "src/test/resources/features", //Above features is path of feature file location
    glue = "com/stepdefinitions") //Glue is path of stepdefinition files
    public class JUnitTestrunner {
    }
# maven sure Fire Plugin and master thought plugin for cucumber reports.
