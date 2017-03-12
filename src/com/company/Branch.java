package com.company;

import java.util.ArrayList;

/**
 * Created by idejesus on 12/03/2017.
 */
public class Branch {
    private  String mName;
    private ArrayList<Customer> mCustomerArrayList;

    public Branch(String name) {
        mName = name;
        mCustomerArrayList = new ArrayList<>();
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            mCustomerArrayList.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i <mCustomerArrayList.size(); i++){
            Customer checkedCustomer = mCustomerArrayList.get(i);
            if (checkedCustomer.getName().equals(customerName)) {

                return checkedCustomer;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return  true;
        }
        return false;
    }


    public String getName() {
        return mName;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return mCustomerArrayList;
    }
}
