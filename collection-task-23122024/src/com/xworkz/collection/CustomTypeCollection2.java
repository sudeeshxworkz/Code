package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CustomTypeCollection2 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookId(101);
        book.setBookName("The Alchemist");
        Book book1 = new Book();
        book1.setBookId(102);
        book1.setBookName("Ikiga");
        Book book2 = new Book();
        book2.setBookId(103);
        book2.setBookName("Rich Dad Poor Dad");

        Collection collection = new ArrayList();
        collection.add(book);


        Collection collection1 = new ArrayList();
        collection1.add(book1);

        Collection collection2 = new ArrayList();
        collection2.add(book2);

        System.out.println(collection);
        System.out.println(collection1);
        System.out.println(collection2);

        collection2.addAll(collection);
        collection2.addAll(collection1);

        System.out.println("addAll "+collection2);

        collection2.containsAll(collection);
        System.out.println("ContainAll : "+collection2);


        collection2.containsAll(collection);
        System.out.println("ContainAll : "+collection2);

        System.out.println("ContainAll : "+collection2.containsAll(collection));

        System.out.println("Contains : "+collection2.contains("Brinjal"));

        collection2.removeAll(collection);
        System.out.println("removeAll : "+collection2);

        collection.clear();
        System.out.println("clear : "+collection2);

        collection2.removeAll(collection1);
        System.out.println("removeAll : "+collection2);

    }}
