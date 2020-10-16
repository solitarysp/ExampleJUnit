package com.lethanh98.examplejunit.timeout;

import com.lethanh98.examplejunit.cal.CalNhan;
import com.lethanh98.examplejunit.cal.impl.CalNhanImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Sử dụng @Test(timeout=100) nếu chúng ta muốn test hiệu suất của một method.
 * Nếu vượt quá 100 như trên config thì test case sẽ false
 */
public class TimeoutTest {
    @Test(timeout = 100)
    public void nhanTest() throws InterruptedException {
        CalNhan calNhan = new CalNhanImpl();
        Assert.assertEquals(100, calNhan.nhan(10, 10), 0);

    }

    @Test(timeout = 1000)
    public void nhanTestTimeOut() throws InterruptedException {
        Thread.sleep(10);
        System.out.println("nhanTest Ignore ");
        CalNhan calNhan = new CalNhanImpl();
        Assert.assertEquals(100, calNhan.nhan(10, 10), 0);

    }
}
