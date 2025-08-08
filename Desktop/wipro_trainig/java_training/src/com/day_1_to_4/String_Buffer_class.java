package com.day_1_to_4;

public class String_Buffer_class {

	public static void main(String[] args) {
		StringBuffer receipt = new StringBuffer();

        receipt.append("Supermart Receipt \n");
        receipt.append("Customer : venkat \n");
        receipt.append("Items : \n");
        receipt.append("1. Bread - 55₹\n");
        receipt.append("2. Coffee - 555₹\n");
        receipt.append("3. Apples - 155₹\n");
        receipt.append("Total: 865₹ \n");
        receipt.append("Thank You for Shopping \n");

        System.out.println("Original Receipt");
        System.out.println(receipt.toString());

        receipt.insert(33, "Date : 22-07-2025 \n");
        System.out.println("\n After Insert");
        System.out.println(receipt.toString());

        receipt.reverse();
        System.out.println("\n After Reverse");
        System.out.println(receipt.toString());
        
        receipt.reverse();

        int start = receipt.indexOf("3. Apples");
        int end = receipt.indexOf("Total:") - 1; 
        receipt.delete(start, end);
        System.out.println("\n After Delete");
        System.out.println(receipt.toString());
				

	}

}
