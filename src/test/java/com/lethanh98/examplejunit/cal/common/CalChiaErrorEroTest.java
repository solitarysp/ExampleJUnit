package com.lethanh98.examplejunit.cal.common;

import com.lethanh98.examplejunit.cal.CalChia;
import com.lethanh98.examplejunit.cal.impl.CalChiaImpl;
import org.junit.Assert;
import org.junit.Test;

public class CalChiaErrorEroTest {
    @Test(expected = ArithmeticException.class)
    public void chiaTest() {
        CalChia calNhan = new CalChiaImpl();
        Assert.assertEquals(100, calNhan.chia(10, 0), 0);
    }

}
