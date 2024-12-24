class ElectricityBillRunner {
    public static void main(String[] bill) {
        ElectricityBill bill1 = new ElectricityBill("RR001", "AC1001", "123 Main St, San City, Mysuru");
        bill1.showBill();

        ElectricityBill bill2 = new ElectricityBill("RR002", "AC1002", "456 Maple Ave, Kodialbail, Mangalore");
        bill2.showBill();

        ElectricityBill bill3 = new ElectricityBill("RR003", "AC1003", "789 Oak Dr, Indiranagar, Bangalore");
        bill3.showBill();

        ElectricityBill bill4 = new ElectricityBill("RR004", "AC1004", "101 Pine Rd, Bannergatta, Bangalore");
        bill4.showBill();

        ElectricityBill bill5 = new ElectricityBill("RR005", "AC1005", "202 Birch Ct, CarStreet, Mangalore");
        bill5.showBill();

        ElectricityBill bill6 = new ElectricityBill("RR006", "AC1006", "303 Cedar Blvd, City F");
        bill6.showBill();

        ElectricityBill bill7 = new ElectricityBill("RR007", "AC1007", "404 Elm St, Electronic City, Bangalore");
        bill7.showBill();

        ElectricityBill bill8 = new ElectricityBill("RR008", "AC1008", "505 Fir Ln, Hootgali, Mysuru");
        bill8.showBill();

        ElectricityBill bill9 = new ElectricityBill("RR009", "AC1009", "606 Spruce Way, Kuvempunagara, Mysuru");
        bill9.showBill();
    }
}