package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private static final int INITIAL=10;

    public Customer() {
    }

    public static void main(String[] args) {
    System.out.println("111");
    ArrayList<String> arrayList1 = new ArrayList<>();
    say();
    Date date = new Date();
    }

    public static int getINITIAL() {
        return INITIAL;
    }

    public static void say() {
        System.out.println("Hello");
    }
}
