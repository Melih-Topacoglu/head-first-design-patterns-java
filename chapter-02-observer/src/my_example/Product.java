package my_example;

import java.util.List;
import java.util.ArrayList;

public class Product implements Subject {
    private List<Observer> observers;
    private String productName;
    private int productStock;

    public Product(String productName) {
        this.productName = productName;
        this.productStock = 0;
        this.observers = new ArrayList<>();
    }

    public String getProductName() {
        return productName;
    }

    public int getProductStock() {
        return productStock;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(productName, productStock);
        }
    }

    public void stockAdded() {
        notifyObservers();
    }

    public void setStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("Illegal quantity value!");
            return;
        }
        if (productStock == 0) {
            productStock += quantity;
            stockAdded();
            return;
        }
        productStock += quantity;
    }

    public void removeStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("remove quantity can not be 0 or lower");
            return;
        }
        if (quantity > productStock) {
            System.out.println("There is not enough product in stock");
            return;
        }
        productStock -= quantity;

    }
}
