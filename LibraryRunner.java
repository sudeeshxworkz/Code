class LibraryRunner {
    public static void main(String[] library) {
        Library lib1 = new Library();
        lib1.libraryId = 1;
        lib1.address = "123 Main KT St";
        lib1.type = "Public";
        lib1.libraryOwnerName = "Mr. Rao";
        lib1.showDetails();

        Library lib2 = new Library();
        lib2.libraryId = 2;
        lib2.address = "456 Oak Lashkar St";
        lib2.type = "Private";
        lib2.libraryOwnerName = "Ms. Sharma";
        lib2.showDetails();

        Library lib3 = new Library();
        lib3.libraryId = 3;
        lib3.address = "789 Pine Nazarbad St";
        lib3.type = "University";
        lib3.libraryOwnerName = "Dr. Gupta";
        lib3.showDetails();

        Library lib4 = new Library();
        lib4.libraryId = 4;
        lib4.address = "101 Maple Vani vilas St";
        lib4.type = "Research";
        lib4.libraryOwnerName = "Mr. Desai";
        lib4.showDetails();

        Library lib5 = new Library();
        lib5.libraryId = 5;
        lib5.address = "202 Birch Deveraja St";
        lib5.type = "Public";
        lib5.libraryOwnerName = "Ms. Verma";
        lib5.showDetails();

        Library lib6 = new Library();
        lib6.libraryId = 6;
        lib6.address = "303 Cedar Small Clock St";
        lib6.type = "Private";
        lib6.libraryOwnerName = "Mr. Mehta";
        lib6.showDetails();

        Library lib7 = new Library();
        lib7.libraryId = 7;
        lib7.address = "404 Spruce Chamaraja St";
        lib7.type = "University";
        lib7.libraryOwnerName = "Dr. Singh";
        lib7.showDetails();

        Library lib8 = new Library();
        lib8.libraryId = 8;
        lib8.address = "505 Elm Church St";
        lib8.type = "Research";
        lib8.libraryOwnerName = "Ms. Patel";
        lib8.showDetails();

        Library lib9 = new Library();
        lib9.libraryId = 9;
        lib9.address = "606 Willow MG St";
        lib9.type = "Public";
        lib9.libraryOwnerName = "Mr. Joshi";
        lib9.showDetails();
    }
}