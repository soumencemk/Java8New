package com.soumen.test;

/**
 * @author Soumen Karmakar
 * 3/19/2018
 */
public interface Boat {

    default void drive(){
        System.out.println("BOAT is Driving");
    }
}
