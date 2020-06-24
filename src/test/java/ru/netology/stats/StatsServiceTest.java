package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] salesOnMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void countSumOfSales() {
        StatsService service = new StatsService();

        long expected = 180;

        long actual = service.countSumOfSales(salesOnMonths);

        assertEquals(expected, actual);
    }

    @Test
    void countAverageSum() {
        StatsService service = new StatsService();

        long expected = 15;

        long actual = service.countAverageSum(salesOnMonths);

        assertEquals(expected, actual);
    }


    @Test
    void monthOfMaxSales() {
        StatsService service = new StatsService();

        long expected = 8;

        long actual = service.monthOfMaxSales(salesOnMonths);

        assertEquals(expected, actual);
    }

    @Test
    void monthOfMinSales() {
        StatsService service = new StatsService();

        long expected = 9;

        long actual = service.monthOfMinSales(salesOnMonths);

        assertEquals(expected, actual);
    }

    @Test
    void monthsUnderAverage() {
        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.monthsUnderAverage(salesOnMonths);

        assertEquals(expected, actual);
    }

    @Test
    void monthsOverAverage() {
        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.monthsOverAverage(salesOnMonths);

        assertEquals(expected, actual);
    }
}
