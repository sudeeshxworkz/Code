package org.xworkz.cinema;

import org.xworkz.cinema.bookmyshow.BookMyShow;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Movie running in screen 1");
        String screenOne = scanner.next();
        bookMyShow.setScreenOne(screenOne);

        System.out.println("Movie running in screen 2");
        String screenTwo = scanner.next();
        bookMyShow.setScreenTwo(screenTwo);

        System.out.println(bookMyShow);



    }
}
