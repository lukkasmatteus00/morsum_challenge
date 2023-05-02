package com.saucedemo.runners;

    import org.junit.runner.RunWith;
    import cucumber.api.CucumberOptions;
    import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        //tags            = "@addProducts",
        plugin          = {"pretty","html:cucumber-html-reports"},
        features        = "src/test/resources/features/",
        glue            = {"com.saucedemo.steps"}
)

public class Saucedemo {
}