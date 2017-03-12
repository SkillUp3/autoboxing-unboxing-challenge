package com.company;

import java.util.ArrayList;

/**
 * Created by idejesus on 12/03/2017.
 */
public class Bank {
    private String mName;
    private ArrayList<Branch> mBranchArrayList;

    public Bank(String name) {
        mName = name;
        mBranchArrayList = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            mBranchArrayList.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < mBranchArrayList.size(); i++) {
            Branch checkedBranch = mBranchArrayList.get(i);
            if (checkedBranch.getName().equals(branchName)) {

                return checkedBranch;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch" + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomerArrayList();
            for(int i = 0; i <branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) +"]");
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j <transactions.size(); j++){
                        System.out.println("["+ (j+1) + "] Amount "+ transactions.get(j));
                    }
                }
            }return  true;
        }else{
            return false;
        }


    }

}
