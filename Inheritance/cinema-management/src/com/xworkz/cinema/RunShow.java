package com.xworkz.cinema;

import com.xworkz.cinema.pvr.PVR;
import com.xworkz.cinema.theatre.Theatre;

public class RunShow {
    public static void main(String[] args) {
        Theatre shows = new Theatre();
        PVR movies = new PVR();

        System.out.println(shows);
        System.out.println(shows.toString());
    }
}
