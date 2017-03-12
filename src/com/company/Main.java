package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("BDO");

        if(bank.addBranch("Makati")){
            System.out.println("Makati branch created");
        }

        bank.addCustomer("Makati", "Ian", 10000.00);
        bank.addCustomer("Makati", "Frenz", 20000.00);
        bank.addCustomer("Makati", "EJ", 50000.00);


        bank.addCustomerTransaction("Makati", "Ian", 5000);
        bank.addCustomerTransaction("Makati", "Frenz", 5000);
        bank.addCustomerTransaction("Makati", "EJ", 5000);


        bank.addBranch("BGC");
        bank.addCustomer("BGC", "Rap", 50000.00);

        bank.listCustomers("Makati", true);
        bank.listCustomers("BGC", false);

    }
}
