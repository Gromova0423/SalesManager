package Retro;

public class Main {
    public static void main(String[] args) {
        long[] RetroSales = {200, 100, 500, 300, 1000};
        for (long i = 0; i < RetroSales.length; i++) {
            System.out.println(RetroSales[Math.toIntExact(i)]);
        }
        SalesManager salesManager = new SalesManager(RetroSales);
        long x = salesManager.max();
        System.out.println("Максимальная выручка:" + x);
    }
}
