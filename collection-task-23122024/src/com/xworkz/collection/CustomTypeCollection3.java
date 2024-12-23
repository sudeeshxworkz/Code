package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CustomTypeCollection3 {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovieId(1);
        movie.setMovieName("Venom");

        Movie movie1 = new Movie();
        movie1.setMovieId(2);
        movie1.setMovieName("SpiderMan");

        Collection collection = new ArrayList();
        collection.add(movie);
        collection.add(movie1);
        System.out.println(collection);

        Collection collection1 = new ArrayList();
        collection1.add("Spider-Verse");
        collection1.add(movie);
        collection1.add(movie1);
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
