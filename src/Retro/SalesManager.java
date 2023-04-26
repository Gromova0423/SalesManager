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

    public int average() {
        int[] sales2 = sales.clone();
        Arrays.sort(sales2);
        int min = sales2[0];
        int max = sales2[sales2.length - 1];
        int sum = 0;
        int average = 0;
        for (int i = 0; i < sales2.length; i++) {
            sum = sum + sales2[i];
            int sum2 = sum - min - max;
            average = sum2 / (sales2.length - 2);
        }
        return average;
    }
}

