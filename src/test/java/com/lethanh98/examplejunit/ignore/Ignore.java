package com.lethanh98.examplejunit.ignore;

import com.lethanh98.examplejunit.cal.CalNhan;
import com.lethanh98.examplejunit.cal.impl.CalNhanImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Sử dụng khi ignore một test khi require có sự thay đổi, chúng ta thay đổi code nhưng chưa kịp chỉnh sửa test
 * Khi đó chúng ta sử dụng Ignore  thì test case đó sẽ không được chạy
 */
public class Ignore {
    @Test()
    public void nhanTest1() {
        System.out.println("nhanTest1 not Ignore ");
        CalNhan calNhan = new CalNhanImpl();
        Assert.assertEquals(100, calNhan.nhan(10, 10), 0);

    }

    @Test()
    @org.junit.Ignore(value = "nhanTest đang được bypass")
    public void nhanTest() {
        System.out.println("nhanTest Ignore ");
        CalNhan calNhan = new CalNhanImpl();
        Assert.assertEquals(100, calNhan.nhan(10, 10), 0);

    }
}
