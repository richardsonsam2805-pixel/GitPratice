
package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = (""), dryRun = true, snippets = SnippetType.CAMELCASE, stepNotifications = false, publish = true, monochrome = true, plugin = {
		"pretty", "json:target\\output.json" }, name = {
				"" }, glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources")
public class TestRunnerClass {

}
