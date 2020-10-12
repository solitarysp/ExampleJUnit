package com.lethanh98.examplejunit.before_class_and_after_class;

import com.lethanh98.examplejunit.cal.CalNhan;
import com.lethanh98.examplejunit.cal.impl.CalNhanImpl;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Sử dụng để khởi tạo các config chung cho nhiều test. Các config này sẽ ở dạng global.
 * Các method sẽ là static. Fw sẽ tự động call khi bắt đầu start và trước khi stop test
 */
public class BeforeClassAndAfterClass {
    static int one;
    static int two;
    static int result;

    @BeforeClass
    public static void setUp() {
        System.out.println("Start Before");
        one = 2;
        two = 2;
        result = 4;
    }

    @AfterClass
    public static void tearDown() {
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
