package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.sumAllSales(sales));
        System.out.println(service.averageSumOfSales(sales));
        System.out.println(service.MonthMaxSales(sales));
        System.out.println(service.MonthMinSales(sales));
        System.out.println(service.MonthBellowAverage(sales));
        System.out.println(service.monthAboveAverage(sales));
    }


}