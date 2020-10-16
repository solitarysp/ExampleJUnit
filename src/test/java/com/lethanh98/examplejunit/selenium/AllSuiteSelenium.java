package com.lethanh98.examplejunit.selenium;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {
        TestEmailAuto.class
        ,TestLoginAuto.class
        ,Test2LoginAuto.class
})
public class AllSuiteSelenium {
}
