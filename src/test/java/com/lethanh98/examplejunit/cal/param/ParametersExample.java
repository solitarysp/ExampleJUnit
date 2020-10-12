package com.lethanh98.examplejunit.cal.param;

import com.lethanh98.examplejunit.cal.CalNhan;
import com.lethanh98.examplejunit.cal.impl.CalNhanImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Test với 1 mảng các expected mong muốn và data truyền vào.
 * Bản chất nó sẽ chạy nhiều lần với nhiều instance test khác nhau. Các data được truyền vào contactor
 */
@RunWith(value = Parameterized.class)
public class ParametersExample {
    private double expected;
    private int valueOne;
    private int valueTwo;

    public ParametersExample(double expected, int valueOne, int valueTwo) {
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    // config cac param mong muốn
    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters() {
        return Arrays.asList(new Integer[][]{
                {2, 1, 2},  //expected, valueOne, valueTwo
                {4, 2, 2},  //expected, valueOne, valueTwo
                {6, 3, 2},  //expected, valueOne, valueTwo
        });
    }

    // start test
    @Test()
    public void nhanTest() {
        CalNhan calNhan = new CalNhanImpl();
        assertEquals(expected, calNhan.nhan(valueOne, valueTwo), 0);
    }
}
