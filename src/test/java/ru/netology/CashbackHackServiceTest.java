package ru.netology;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService cash = new CashbackHackService();

    @Test
    public void remainLessThanBoundary() {

        int actual = cash.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void remainLessThanBoundaryTwo() {

        int actual = cash.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void remainEqualToBoundary() {

        int actual = cash.remain(1_000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void remainGreaterThanBoundary() {

        int actual = cash.remain(1_500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void remainLimitValueCheck() {

        int actual = cash.remain(0);
        int expected = 1_000;
        assertEquals(expected, actual);
    }
}