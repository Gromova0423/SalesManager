package Retro;

public class Main {
    public static void main(String[] args) {
        int[] RetroSales = {200, 100, 500, 300, 1000};
        for (int i = 0; i < RetroSales.length; i++) {
            System.out.println(RetroSales[i]);
        }
        SalesManager salesManager = new SalesManager(RetroSales);
        int x = salesManager.max();
        System.out.println("Максимальная выручка:" + x);
    }
}
