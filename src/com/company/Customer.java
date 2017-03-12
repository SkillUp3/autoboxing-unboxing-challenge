package com.company;

import java.util.ArrayList;

/**
 * Created by idejesus on 12/03/2017.
 */
public class Customer {
    private String mName;
    private ArrayList<Double> mTransactions;

    public Customer(String name, double initialAmount) {
        mName = name;
        mTransactions = new ArrayList<>();
        addTransaction(initialAmount);

    }

    public void addTransaction(double amount){
        mTransactions.add(amount);
    }

    public String getName() {
        return mName;
    }

    public ArrayList<Double> getTransactions() {
        return mTransactions;
    }
}
