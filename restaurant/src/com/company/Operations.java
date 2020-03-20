package com.company;

import com.company.entity.Order;
import com.company.reader.InfoReader;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Operations {
    public void makeOperations(ArrayList<Order> orders, int n) {
        switch (n) {
            case 1:
            case 2:
                showOrdersIdentifiers(orders);
                int id = chooseIdentifier();
                readOrder(orders, id) ;
            case 3:
            case 4:

        }
    }

    public void showOrdersIdentifiers(ArrayList<Order> orders) {
        for(Order item : orders) {
                System.out.println(item.getId());
        }
    }

    public int chooseIdentifier() {
        InfoReader reader = new InfoReader();
        System.out.println("Input an id of order you want see: ");
        int id = reader.readId(System.in);
        return id;
    }

    public void readOrder(ArrayList<Order> orders, int id) {
        for(Order item : orders) {
            if(item.getId() == id) {
                System.out.println("Order: " + id + " " + item.toString());
                break;
            }
        }
    }




}
