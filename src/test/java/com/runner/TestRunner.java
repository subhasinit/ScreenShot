package com.runner;

import org.junit.runner.RunWith;

import com.repot.Reprting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
// @CucumberOptions(
// dryRun=false,snippets=SnippetType.CAMELCASE,stepNotifications=true,plugin =
// "pretty", json:target//index.json"),monochrome = true, name = "verify Amazon
// search with credentials", features = "src\\test\\resources", glue =
// "com.stepdefinetion")
@CucumberOptions(plugin = { "pretty",
		"json:target//index.json" }, features = "src\\test\\resources", glue = "com.stepdefinetion")
public class TestRunner {
	@Afterclass
	public static void afterclass() {
		Reprting.generateJvmReport("C:\\Users\\Subha\\eclipse-workspace\\Cucumber\\target");
	}
}