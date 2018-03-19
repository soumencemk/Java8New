package com.soumen.test;

/**
 * @author Soumen Karmakar
 * 3/19/2018
 */
public class TestClass implements Vehicle, Boat {

    public static void main(String[] args) {
        new TestClass().drive();
        Vehicle.blowHorn();
    }


    @Override
    public void drive() {
        System.out.println("HA HA");
    }
}
