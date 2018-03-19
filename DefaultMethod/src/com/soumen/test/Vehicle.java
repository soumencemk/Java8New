package com.soumen.test;

/**
 * @author Soumen Karmakar
 * 3/19/2018
 */
public interface Vehicle {

    default void drive(){
        System.out.println("Vehicle is driving");
    }

    static void blowHorn(){
        System.out.println("PO PO PO");
    }
}
