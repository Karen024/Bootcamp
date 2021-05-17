package Exercise.Day16.Shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Shop shop = new Shop("Yerevan City", "Komitas", 500, 550.0, 300_000.0);
        System.out.println(shop.toString());
        System.out.println();
        shop.buyingProduct(550, scn);
        System.out.println();
        System.out.println(shop.toString());
    }
}
