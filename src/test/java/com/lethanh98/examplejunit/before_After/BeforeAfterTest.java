package com.lethanh98.examplejunit.before_After;

import com.lethanh98.examplejunit.cal.CalNhan;
import com.lethanh98.examplejunit.cal.impl.CalNhanImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Before và After sử dụng để mỗi một test được chạy thì các method Before và After sẽ được chạy 1 lần,
 * thường được sử dụng trong quá trình setup data
 */
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

    @Test
    public void beforeAfterTest2() {
        CalNhan calNhan = new CalNhanImpl();
        Assert.assertEquals(result, calNhan.nhan(one, two), 0);
    }
}
