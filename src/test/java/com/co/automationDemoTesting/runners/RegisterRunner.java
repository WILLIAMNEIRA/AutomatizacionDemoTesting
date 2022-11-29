package com.co.automationDemoTesting.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/features/Register.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.automationDemoTesting.stepdefinitions")
public class RegisterRunner {
}

