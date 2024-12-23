package com.xworkz.booking;

import com.xworkz.booking.metro.Metro;
import com.xworkz.booking.train.Train;
import com.xworkz.booking.urban.Urban;

public class Tester {
    public static void main(String[] args) {
        Train train = new Train();
        train.bookTrain(16575, "Mangaluru","Bengaluru");

        Train ref = new Metro();
        ref.bookTrain(32332,"Baiyapannahalli","Magadi road");

        Train ref1 = new Metro();
        ref1.bookTrain(42221,"Indiranagar","MG road");

        Train book = new Urban();
        book.bookTrain(62722,"Bengaluru","Mysuru");

        Train book1 = new Urban();
        book1.bookTrain(56484,"Hassan","Bengaluru");

    }


}
