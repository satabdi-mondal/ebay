package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/feature", 
	glue = {"StepDefinition"},
	monochrome = true   
	


	)
	public class TestRunner {

	}

