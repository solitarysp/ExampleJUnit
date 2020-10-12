package com.lethanh98.examplejunit.cal.suite;

import com.lethanh98.examplejunit.cal.common.CalChiaErrorEroTest;
import com.lethanh98.examplejunit.cal.common.CalNhanTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {CalNhanTest.class, CalChiaErrorEroTest.class})
public class CalCommonSuite {
}
