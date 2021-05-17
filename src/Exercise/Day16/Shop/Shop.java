package Exercise.Day16.Shop;

import java.util.Objects;
import java.util.Scanner;

public class Shop {
    private String name;
    private String address;
    private int countOfProduct;
    private double priceForProduct;
    private double shopBalance;

    public Shop(String name, String address, int countOfProduct, double priceForProduct, double shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }

    public Shop() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(int countOfProduct) {
        this.countOfProduct = countOfProduct;
    }

    public double getPriceForProduct() {
        return priceForProduct;
    }

    public void setPriceForProduct(double priceForProduct) {
        this.priceForProduct = priceForProduct;
    }

    public double getShopBalance() {
        return shopBalance;
    }

    public void setShopBalance(double shopBalance) {
        this.shopBalance = shopBalance;
    }

    public boolean checkOrder(int countOfOrder) {
        if (countOfProduct >= countOfOrder) {
            return true;
        }
        return false;
    }

    public void buyingProduct(int countOfOrder, Scanner scn) {
        boolean check = checkOrder(countOfOrder);
        if (check) {
            System.out.println("if you want to buy it, Please press 1 , if you don’t want to buy it press any bottom.");
            int answer = scn.nextInt();
            if (answer == 1) {
                double profit = calculateOrder(countOfOrder);
                addToShopBalance(profit);
                System.out.println("Thank you for buying our product");
                return;
            } else {
                System.out.println("Goodbye, have a nice day");
                return;
            }
        }
        System.out.println("Now we don’t have so much product,sorry");
    }

    public double calculateOrder(int countOfOrder) {
        countOfProduct = countOfProduct - countOfOrder;
        return (double) (countOfOrder * priceForProduct);
    }

    public void addToShopBalance(double money) {
        shopBalance = shopBalance + money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return countOfProduct == shop.countOfProduct &&
                Double.compare(shop.priceForProduct, priceForProduct) == 0 &&
                Double.compare(shop.shopBalance, shopBalance) == 0 &&
                Objects.equals(name, shop.name) &&
                Objects.equals(address, shop.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, countOfProduct, priceForProduct, shopBalance);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", countOfProduct=" + countOfProduct +
                ", priceForProduct=" + priceForProduct +
                ", shopBalance=" + shopBalance +
                '}';
    }
}
