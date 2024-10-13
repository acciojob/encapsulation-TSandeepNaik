package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setNum(5);
        System.out.println("the private num is :"+obj.getNum());
    }




}