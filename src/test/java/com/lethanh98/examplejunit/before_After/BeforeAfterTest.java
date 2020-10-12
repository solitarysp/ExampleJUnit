package com.lethanh98.examplejunit.before_After;

import com.lethanh98.examplejunit.cal.CalNhan;
import com.lethanh98.examplejunit.cal.impl.CalNhanImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeforeAfterTest {
    int one;
    int two;
    int result;

    @Before
    public void setUp() {
        System.out.println("Start Before");
        one = 2;
        two = 2;
        result = 4;
    }

    @After
    public void tearDown() {
        System.out.println("Start After");
    }

    @Test
    public void beforeAfterTest() {
        CalNhan calNhan = new CalNhanImpl();
        Assert.assertEquals(result, calNhan.nhan(one, two), 0);
    }
}
