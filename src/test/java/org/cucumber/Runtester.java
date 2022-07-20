package org.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
					glue="org.cucu",
					monochrome=true,
				    //plugin= {"pretty"},
					dryRun=false,
					tags= {"~@regression , @Smoke"}
)
public class Runtester {

}
