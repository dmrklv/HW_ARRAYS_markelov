package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    public void shouldCalcSumOfSales() {
        long actual = service.sumAllSales(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSumOfSales() {
        long actual = service.averageSumOfSales(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulsCalcMonthMaxSales() {
        long actual = service.MonthMaxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthMinSales() {
        long actual = service.MonthMinSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void souldCalcMonthBellowAverage() {
        long actual = service.MonthBellowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcmonthAboveAverage() {
        long actual = service.monthAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}