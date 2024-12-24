class ElectricCar {
    public static void main(String[] elec) {
        Car car = new Car();
        car.setModel("Model S");
        car.setMake("Tesla");
        car.setPrice(1299999.99);

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Price: " + car.getPrice());
    }
}