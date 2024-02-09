package com.blueyonder.day4.productSort;

import java.util.*;

public class ProductSort {

    public static void main(String[] args) {
        int numberOfProducts=5;
        List<Product> products=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<numberOfProducts;i++)
        {
            System.out.println("Enter details for product #"+(i+1));
            System.out.print("Name: ");
            String name=sc.nextLine();
            System.out.print("Price: ");
            double price=sc.nextDouble();
            sc.nextLine();
            Product p=new Product(name,price);
            products.add(p);
        }
        System.out.println("All Products:");
        System.out.println(products);
        System.out.println();
        System.out.println("Sorted by name (alphabetical):");
        products.sort(Comparator.comparing(Product::getName));
        System.out.println(products);
        System.out.println();
        System.out.println("Sorted by price (ascending):");
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println(products);
        System.out.println();
        System.out.println("Sorted by price (descending):");
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println(products);
    }
}
