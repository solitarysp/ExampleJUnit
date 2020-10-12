package com.lethanh98.examplejunit;

import com.lethanh98.examplejunit.cal.suite.AllSuite;
import com.lethanh98.examplejunit.selenium.AllSuiteSelenium;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {AllSuite.class, AllSuiteSelenium.class})
public class SuiteAll {
}
