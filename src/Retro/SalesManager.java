package Retro;

import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long average() {
        long[] sales2 = sales.clone();
        Arrays.sort(sales2);
        long min = sales2[0];
        long max = sales2[sales2.length - 1];
        long sum = 0;
        long average = 0;
        for (int i = 0; i < sales2.length; i++) {
            sum = sum + sales2[i];
            long sum2 = sum - min - max;
            average = sum2 / (sales2.length - 2);
        }
        return average;
    }
}

