package ru.netology;

import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {
    CashbackHackService cash = new CashbackHackService();

    @Test
    public void remainLessThanBoundary() {

        int actual = cash.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainLessThanBoundaryTwo() {

        int actual = cash.remain(1);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainEqualToBoundary() {

        int actual = cash.remain(1_000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainGreaterThanBoundary() {

        int actual = cash.remain(1_500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void remainLimitValueCheck() {

        int actual = cash.remain(0);
        int expected = 1_000;
        Assert.assertEquals(actual, expected);
    }
}