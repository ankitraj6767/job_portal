package com.blueyonder.day1.productmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        int choice;
        do {
            System.out.print("\nMenu:\n1: Add Product | 2: Edit Product | 3: Display All Products | 4: Exit\nEnter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            int productID;
            switch (choice) {
                case 1:
                    int price, quantityOnHand;
                    StringBuilder productName;
                    Category category;
                    System.out.println("Enter the details:");

                    do {
                        System.out.print("Product ID: ");
                        productID = sc.nextInt();
                        sc.nextLine();
                        int tempProductID = productID;
                        List<Product> existing = products.stream().filter(p -> p.getProductID() == tempProductID).toList();
                        if (!existing.isEmpty())
                            System.out.println("Duplicate Product ID, please re-enter.");
                        else
                            break;
                    } while (true);

                    System.out.print("Product Name: ");
                    productName = new StringBuilder(sc.nextLine());

                    System.out.print("Price: ");
                    price = sc.nextInt();

                    System.out.print("Quantity On Hand: ");
                    quantityOnHand = sc.nextInt();
                    sc.nextLine();

                    do {
                        System.out.print("Category (asset | consumable): ");
                        String categoryString = sc.next();
                        if (categoryString.equalsIgnoreCase("asset") || categoryString.equalsIgnoreCase("consumable")) {
                            category = Category.valueOf(categoryString);
                            break;
                        } else
                            System.out.println("Invalid category, please re-enter.");
                    } while (true);

                    products.add(new Product(productID, productName, price, quantityOnHand, category));
                    break;
                case 2:
                    System.out.print("Enter the Product ID: ");
                    productID = sc.nextInt();
                    int tempProductID = productID;
                    List<Product> findProduct = products.stream().filter(p -> p.getProductID() == tempProductID).toList();
                    if (findProduct.isEmpty())
                        System.out.println("Invalid Product ID.");
                    else {
                        sc.nextLine();
                        findProduct.getFirst().editProduct();
                    }
                    break;
                case 3:
                    if (products.isEmpty()) {
                        System.out.println("No product is added yet.");
                        break;
                    }
                    System.out.println("The products are: \n");
                    for (Product product : products) {
                        product.display();
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Thank you, see you again!");
                    break;
                default:
                    System.out.println("Invalid selection, please choose again.");
            }
        } while (choice != 4);
    }
}
