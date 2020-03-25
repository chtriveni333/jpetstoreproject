package com.JpetTestrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/functionalTests/JpetTest1.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		//tags = {"@TS_01,@TS_02,@TS_03,@TS_04,@TS_05,@TS_06,@TS_07,@TS_08,@TS_09,@TS_10,@TS_11,@TS_12,@TS_13,@TS_14,@TS_15,@TS_16,@TS_17,@TS_18,@TS_19,"},
		tags= {"@TS_01,@TS_02,@TS_03,@TS_04,@TS_05,"},//aditya
		//tags= {"@TS_06,@TS_07,@TS_08,@TS_09,@TS_10,"},//narendra
		//tags= {"@TS_11,@TS_12,@TS_13,@TS_14,@TS_15,"},//jahnavi
		//tags= {"@TS_16,@TS_17,@TS_18,@TS_19,"},//triveni
		glue = {"com.JpetStepDefinition"},
		monochrome = true
		)
		






public class TestRunnerJpet {

}
