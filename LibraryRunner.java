class LibraryRunner {
    public static void main(String[] library) {
        Library lib1 = new Library(1, "123 Main KT St", "Public", "Mr. Rao");
        lib1.showDetails();

        Library lib2 = new Library(2, "456 Oak Lashkar St", "Private", "Ms. Sharma");
        lib2.showDetails();

        Library lib3 = new Library(3, "789 Pine Nazarbad St", "University", "Dr. Gupta");
        lib3.showDetails();

        Library lib4 = new Library(4, "101 Maple Vani vilas St", "Research", "Mr. Desai");
        lib4.showDetails();

        Library lib5 = new Library(5, "202 Birch Deveraja St", "Public", "Ms. Verma");
        lib5.showDetails();

        Library lib6 = new Library(6, "303 Cedar Small Clock St", "Private", "Mr. Mehta");
        lib6.showDetails();

        Library lib7 = new Library(7, "404 Spruce Chamaraja St", "University", "Dr. Singh");
        lib7.showDetails();

        Library lib8 = new Library(8, "505 Elm Church St", "Research", "Ms. Patel");
        lib8.showDetails();

        Library lib9 = new Library(9, "606 Willow MG St", "Public", "Mr. Joshi");
        lib9.showDetails();
    }
}