package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class IntergerCollection {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1131);
        collection.add(3242);
        collection.add(1141);
        collection.add(1143);
        collection.add(1141);
        System.out.println(collection);

        Collection collection1  = new ArrayList();
        collection1.add(234);
        collection1.add(123);
        collection1.addAll(collection);

        collection1.remove(123);


        System.out.println(collection1.containsAll(collection1));




    }
}
