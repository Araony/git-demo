package com.atguigu.bean;

import java.util.ArrayList;

public class TemplateTest {
    private static final Customer c=new Customer();
    public static void main(String[] args) {

     say("Hello World!");

    }
    public static void say(String s){
        String[] arr=new String[]{"张飞","关羽","黄忠","马超","赵云"};
    
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s1 : arr) {
            System.out.println(s1);
        }
        for (int i = 0; i < arr.length; i++) {
            String s1 = arr[i];
        }
        ArrayList<String> list=new ArrayList<>();
        list.add("张飞");
        list.add("关羽");
        list.add("黄忠");
        list.add("马超");
        list.add("赵云");
        for (String s1 : list) {
            System.out.println(s1);
        }

    }

}
