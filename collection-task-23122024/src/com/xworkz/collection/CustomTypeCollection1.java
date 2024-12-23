package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CustomTypeCollection1 {
    public static void main(String[] args) {
        Song song = new Song();
        song.setSong_id(1);
        song.setSong_name("Blinding Lights");
        Song song1 = new Song();
        song1.setSong_id(2);
        song1.setSong_name("Starboy");
        Song song2 = new Song();
        song2.setSong_id(3);
        song2.setSong_name("Save your tears");

        Collection collection = new ArrayList();
        collection.add(song);
        collection.add(song1);
        collection.add(song2);

        System.out.println(collection);

        Collection collection1 = new ArrayList();
        Song song3 = new Song();
        song3.setSong_id(4);
        song3.setSong_name("Too late");
        collection1.add(song3);
        collection1.addAll(collection);
        System.out.println(collection1);

        collection1.containsAll(collection);
        System.out.println("ContainAll : "+collection1);


        collection1.containsAll(collection);
        System.out.println("ContainAll : "+collection1);

        System.out.println("ContainAll : "+collection1.containsAll(collection));

        System.out.println("Contains : "+collection1.contains("Brinjal"));

        collection1.removeAll(collection);
        System.out.println("removeAll : "+collection1);

        collection.clear();
        System.out.println("clear : "+collection1);

        collection1.removeAll(collection);
        System.out.println("removeAll : "+collection1);



    }
}
