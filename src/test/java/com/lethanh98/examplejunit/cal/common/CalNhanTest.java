package com.lethanh98.examplejunit.cal.common;

import com.lethanh98.examplejunit.cal.CalNhan;
import com.lethanh98.examplejunit.cal.impl.CalNhanImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Chạy test 1 method bình thường
 */
public class CalNhanTest {
    @Test()
    public void nhanTest() {
        CalNhan calNhan = new CalNhanImpl();
        Assert.assertEquals(100, calNhan.nhan(10, 10),0);

    }
}
