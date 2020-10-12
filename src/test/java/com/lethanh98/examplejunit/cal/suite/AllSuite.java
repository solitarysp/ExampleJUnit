package com.lethanh98.examplejunit.cal.suite;

import com.lethanh98.examplejunit.cal.param.ParametersExample;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Tạo một Suite để chạy một loạt các test case khác nhau.
 * CÓ thể chạy 1 Suite khác nữa
 */
@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {CalCommonSuite.class, ParametersExample.class})
public class AllSuite {
}
