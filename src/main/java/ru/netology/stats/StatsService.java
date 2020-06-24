package ru.netology.stats;

public class StatsService {


    public long countSumOfSales(long[] salesOnMonths) {
        long sum = 0;
        for (long month : salesOnMonths) {
            sum += month;
        }
        return sum;
    }


    public long countAverageSum(long[] salesOnMonths) {
        return countSumOfSales(salesOnMonths) / salesOnMonths.length;
    }

    public long monthOfMaxSales(long[] salesOnMonths) {
        long numberOfMonthSale = salesOnMonths[0];
        long indexOfMonth = 0;

        for(int i = 0; i < salesOnMonths.length; i++) {
            if (salesOnMonths[i] >= numberOfMonthSale) {
                numberOfMonthSale = salesOnMonths[i];
                indexOfMonth = i + 1;
            }
        }
        return indexOfMonth;
    }


    public long monthOfMinSales(long[] salesOnMonths) {
        long numberOfMonthSales = salesOnMonths[0];
        long indexOfMonth = 0;
        for (int i = 0; i < salesOnMonths.length; i++) {
            if (salesOnMonths[i] <= numberOfMonthSales) {
                numberOfMonthSales = salesOnMonths[i];
                indexOfMonth = i + 1;
            }
        }
        return indexOfMonth;
    }

    public long monthsUnderAverage(long[] salesOnMonths) {
        long average = countAverageSum(salesOnMonths);
        long newMonths = 0;
        for (long month : salesOnMonths) {
            if (month < average) {
                newMonths++;
            }
        }
        return newMonths;
    }

    public long monthsOverAverage(long[] salesOnMonths) {
        long average = countAverageSum(salesOnMonths);
        long newMonths = 0;
        for (long month : salesOnMonths) {
            if (month < average) {
                newMonths++;
            }
        }
        return newMonths;
    }
}