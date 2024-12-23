package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class StringCollection {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("Sudeesh");
        collection.add("Prajwal");
        collection.add("Bilwesh");
        collection.add("Jack");
        collection.add("Sri");
        System.out.println(collection);

        Collection collection1  = new ArrayList();
        collection1.add("Arjun");
        collection1.add("Liki");
        collection1.addAll(collection);

        collection1.remove("Jack");


        System.out.println(collection1.containsAll(collection1));

    }
}
