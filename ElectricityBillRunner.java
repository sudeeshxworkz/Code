class ElectricityBillRunner {
    public static void main(String[] bill) {
        ElectricityBill bill1 = new ElectricityBill();
        bill1.rrNo = "RR001";
        bill1.accountId = "AC1001";
        bill1.address = "123 Main St, San City, Mysuru";
        bill1.showBill();

        ElectricityBill bill2 = new ElectricityBill();
        bill2.rrNo = "RR002";
        bill2.accountId = "AC1002";
        bill2.address = "456 Maple Ave, Kodialbail, Mangalore";
        bill2.showBill();

        ElectricityBill bill3 = new ElectricityBill();
        bill3.rrNo = "RR003";
        bill3.accountId = "AC1003";
        bill3.address = "789 Oak Dr, Indiranagar, Bangalore";
        bill3.showBill();

        ElectricityBill bill4 = new ElectricityBill();
        bill4.rrNo = "RR004";
        bill4.accountId = "AC1004";
        bill4.address = "101 Pine Rd, Bannergatta, Bangalore";
        bill4.showBill();

        ElectricityBill bill5 = new ElectricityBill();
        bill5.rrNo = "RR005";
        bill5.accountId = "AC1005";
        bill5.address = "202 Birch Ct, CarStreet, Mangalore";
        bill5.showBill();

        ElectricityBill bill6 = new ElectricityBill();
        bill6.rrNo = "RR006";
        bill6.accountId = "AC1006";
        bill6.address = "303 Cedar Blvd, City F";
        bill6.showBill();

        ElectricityBill bill7 = new ElectricityBill();
        bill7.rrNo = "RR007";
        bill7.accountId = "AC1007";
        bill7.address = "404 Elm St, Electronic City, Bangalore";
        bill7.showBill();

        ElectricityBill bill8 = new ElectricityBill();
        bill8.rrNo = "RR008";
        bill8.accountId = "AC1008";
        bill8.address = "505 Fir Ln, Hootgali, Mysuru";
        bill8.showBill();

        ElectricityBill bill9 = new ElectricityBill();
        bill9.rrNo = "RR009";
        bill9.accountId = "AC1009";
        bill9.address = "606 Spruce Way, Kuvempunagara, Mysuru";
        bill9.showBill();
    }
}