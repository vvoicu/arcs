package com.runners.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.runners.tests.RunCucumberTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//		WriteGakKeyToFile.class,
		RunCucumberTest.class })
public class RegressionSuite {

}
