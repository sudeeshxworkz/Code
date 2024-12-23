package com.xworkz.booking;

import com.xworkz.booking.train.Train;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Train train = new Train();

        System.out.println("Enter Train Number");
        int number = scanner.nextInt();
        train.setTrainNo(number);

        System.out.println("Enter source");
        String sor = scanner.next();
        train.setSource(sor);

        System.out.println("Enter destination");
        String dest = scanner.next();
        train.setDestination(dest);


    }
}
