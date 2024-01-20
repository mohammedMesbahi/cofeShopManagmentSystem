package com.example.cofeshopmanagmentsystem.modals;

public class Inventory {
    String id;
    String reference;
    String name;
    String quantity;
    String price;
    String image;
    String date;
    public static String[] typeList;

    static {
        typeList = new String[]{"Meals", "Drinks"};
    }



    public Inventory() {

    }
}
