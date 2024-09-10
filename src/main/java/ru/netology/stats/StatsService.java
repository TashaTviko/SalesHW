package ru.netology.stats;

public class StatsService {
    public long calculateSumSale(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public long calculateAverageSale(long[] sales) {
        return calculateAverageSale(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMounth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMounth]) {
                maxMounth = i;
            }
        }

        return maxMounth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowAverageSale(long[] sales) {
        int belowAverageCounter = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                belowAverageCounter++;
            }
        }

        return belowAverageCounter;
    }

    public int aboveAverageSale(long[] sales) {
        int aboveAveragecounter = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                aboveAveragecounter++;
            }
        }

        return aboveAveragecounter;
    }
}

