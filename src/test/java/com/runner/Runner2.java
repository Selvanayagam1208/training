package com.runner;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"src\\test\\java\\Feature_file"},dryRun = !true,
glue = "Stepdefinition",
monochrome = true, tags = "@smoke or @sanity",
plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"})

public class Runner2 extends AbstractTestNGCucumberTests {

}
