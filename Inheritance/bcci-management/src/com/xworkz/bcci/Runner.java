package com.xworkz.bcci;

import com.xworkz.bcci.cricket.Cricket;
import com.xworkz.bcci.sport.Sport;

public class Runner     {
    public static void main(String[] args) {
        Sport sport = new Sport();
        Cricket cricket = new Cricket();
        sport.addMatches(1);
        cricket.addTime("20.00");
    }
}
