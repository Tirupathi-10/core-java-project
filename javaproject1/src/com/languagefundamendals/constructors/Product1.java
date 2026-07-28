package com.languagefundamendals.constructors;

public class Product1 {

    String brand;
    String model;
    double price;
    String year;

    Product1() {
        this("Unknown");
        System.out.println("No-Arg Constructor of Product");
    }

    Product1(String brand) {
        this(brand, "T1 44W");
    }

    Product1(String brand, String model) {
        this(brand, model, 25000.0);
    }

    Product1(String brand, String model, double price) {
        this(brand, model, price, "2026");
    }

    Product1(String brand, String model, double price, String year) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    void display() {
        System.out.println("Brand  : " + brand);
        System.out.println("Model  : " + model);
        System.out.println("Price  : " + price);
        System.out.println("Year   : " + year);
    }
    public static void main(String[] args) {
        System.out.println("Product1 Running...");
    }
}

class Customer extends Product1 {

    String name;
    String loc;

    Customer() {
        this("Unknown", "Unknown", 0.0, "2026", "Unknown", "Unknown");
        System.out.println("No-Arg Constructor of Customer");
    }


    Customer(String brand, String model, double price, String year,
             String name, String loc) {

        super(brand, model, price, year);  

        this.name = name;
        this.loc = loc;
    }

    
    void display() {

        super.display();    

        System.out.println("Customer Name : " + name);
        System.out.println("Location      : " + loc);
    }

    public static void main(String[] args) {

        System.out.println("------ Object 1 ------");
        Customer c1 = new Customer();
        c1.display();

        System.out.println();

        System.out.println("------ Object 2 ------");
        Customer c2 = new Customer(
                "Vivo",
                "T1x",
                30000,
                "2025",
                "Tirupathi",
                "Hyderabad");

        c2.display();
    }
}