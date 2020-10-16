package com.lethanh98.examplejunit;

import com.lethanh98.examplejunit.apiTest.ApiTest;
import com.lethanh98.examplejunit.before_After.BeforeAfterTest;
import com.lethanh98.examplejunit.before_class_and_after_class.BeforeClassAndAfterClass;
import com.lethanh98.examplejunit.cal.suite.AllSuite;
import com.lethanh98.examplejunit.ignore.Ignore;
import com.lethanh98.examplejunit.repo.Testconnectdb;
import com.lethanh98.examplejunit.selenium.AllSuiteSelenium;
import com.lethanh98.examplejunit.timeout.TimeoutTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {
        AllSuiteSelenium.class
        , TimeoutTest.class
        , Testconnectdb.class
        , Ignore.class
        , AllSuite.class
        , BeforeClassAndAfterClass.class
        , BeforeAfterTest.class
        , ApiTest.class
})
public class SuiteAll {
}
