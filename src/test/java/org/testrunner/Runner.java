package org.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", 
				glue = { "stepDefinitions" }, tags= {"smoke"},
				plugin = {"pretty" ,"html:Report","junit:Report/report.xml" ,"json:Report/report.json"}
				)
public class Runner {

}