package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CashbackHackServiceTest {
    @Test
    public void ShouldCalculateAmountOfCashbackWhenBelow1000() {
        CashbackHackService cashbackHack = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHack.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCalculateAmountOfCashbackWhenAbove1000() {
        CashbackHackService cashbackHack = new CashbackHackService();
        int amount = 12533;
        int actual = cashbackHack.remain(amount);
        int expected = 13_000 - amount;
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCalculateAmountOfCashbackWhen1000() {
        CashbackHackService cashbackHack = new CashbackHackService();
        int amount = 1_000;
        int actual = cashbackHack.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
