package ru.netology.stats;

public class StatsService {

    public int sumAllSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSumOfSales(long[] sales) {
        int sum = 0;
        int averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            averageSum = (sum / sales.length);
        }
        return averageSum;
    }


    public int MonthMaxSales(long[] sales) {
        int MaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    public int MonthMinSales(long[] sales) {
        int MinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinMonth]) {
                MinMonth = i;
            }
        }
        return MinMonth + 1;
    }

    public int MonthBellowAverage(long[] sales) {
        int monthCount = 0;
        int averageSum = averageSumOfSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthAboveAverage(long[] sales) {
        int monthAboveCount = 0;
        int averagesum = averageSumOfSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averagesum) {
                monthAboveCount++;
            }
        }
        return monthAboveCount;
    }
}
