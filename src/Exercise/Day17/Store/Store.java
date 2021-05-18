package Exercise.Day17.Store;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private String[] products;

    public Store() {
    }

    public Store(int countOfWorkers, String name, String phoneNumber, String[] products) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50) {
            this.countOfWorkers = countOfWorkers;
        } else {
            System.out.println("Wrong input");
        }
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Wrong input");
        }
        if (phoneNumber.length() == 8 && countOfDigitsInString(phoneNumber) == 8) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Wrong input");
        }
        this.products = products;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String[] getProducts() {
        return products;
    }

    public void buyProducts(String product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(product)) {
                System.out.println("We have that product, to buy call on this number " + phoneNumber);
                return;
            }
        }
        System.out.println("Sorry we dont have that product");
    }

    public int countOfDigitsInString(String string) {
        int countOfDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                if (Character.getNumericValue(string.charAt(i)) >= 0) {
                    countOfDigits++;
                }
            }
        }
        return countOfDigits;
    }
}
