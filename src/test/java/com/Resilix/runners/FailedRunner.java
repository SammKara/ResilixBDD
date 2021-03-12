package com.Resilix.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "@target/failed.txt",
			glue = "com.hcs.steps",
			plugin = {"pretty"}
		)
public class FailedRunner {

}
