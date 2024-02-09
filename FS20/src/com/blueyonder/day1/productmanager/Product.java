package com.blueyonder.day1.productmanager;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int productID;
    private StringBuilder productName;
    private float price;
    private int quantityOnHand;
    private Category category;

    public void editProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Product Name: " + productName + " | Enter new name or press enter to skip: ");
        String newProductName = sc.nextLine();
        if (!newProductName.isEmpty())
            productName.replace(0, productName.length(), newProductName);

        System.out.print("Price: $" + price + " | Enter new price or press enter to skip: ");
        String newPrice = sc.nextLine();
        if (!newPrice.isEmpty())
            price = Integer.parseInt(newPrice);

        System.out.print("Quantity On Hand: " + quantityOnHand + " | Enter new quantity or press enter to skip: ");
        String newQuantity = sc.nextLine();
        if (!newQuantity.isEmpty())
            quantityOnHand = Integer.parseInt(newQuantity);

        do {
            System.out.print("Category: " + category.name() + " | Enter new category or press enter to skip: ");
            String newCategory = sc.nextLine();
            if (newCategory.isEmpty())
                break;
            if (newCategory.equalsIgnoreCase("asset") || newCategory.equalsIgnoreCase("consumable")) {
                category = Category.valueOf(newCategory);
                break;
            } else
                System.out.println("Invalid category, please re-enter.");
        } while (true);
    }

    public void display() {
        System.out.println("ProductID: " + productID);
        System.out.println("ProductName: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity On Hand: " + quantityOnHand);
        System.out.println("Category: " + category.name());
    }
}
