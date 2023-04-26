package Retro;

import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
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

