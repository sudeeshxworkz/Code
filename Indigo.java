class Indigo {
    public static void main(String[] fly) {
        Flight flight = new Flight();
        flight.setFlightNumber("AI202");
        flight.setDeparture("New Delhi");
        flight.setDestination("Mumbai");

        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Departure: " + flight.getDeparture());
        System.out.println("Destination: " + flight.getDestination());
    }
}