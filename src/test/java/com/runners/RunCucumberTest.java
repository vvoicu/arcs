package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.apps.reqres.defs" }, features = "src/test/resources/features/reqres_tests.feature")
public class RunCucumberTest {

}
