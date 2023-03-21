package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\POM_Cucumber\\OrangeHRM_POM_CUCUMBER\\features\\AddNewEmployeeReg.feature",
glue="Stepdefinations",monochrome=true,dryRun=false)
public class TestRun 
{

}
