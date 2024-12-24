class BreadRunner {
    public static void main(String[] bread) {
        Bread bread1 = new Bread();
        bread1.showBread();

        Bread bread2 = new Bread("Wonder Bread", 12, "Multi Grain");
        bread2.showBread();

        Bread bread3 = new Bread("Harvest Gold", 14, "White Bread");
        bread3.showBread();

        Bread bread4 = new Bread("Modern Bread", 8, "Brown Bread");
        bread4.showBread();

        Bread bread5 = new Bread("Sunfeast", 6, "Fruit Bread");
        bread5.showBread();
		
        Bread bread6 = new Bread("Kwality", 16, "Garlic Bread");
        bread6.showBread();

        Bread bread7 = new Bread("Nature's Own", 12, "Honey Wheat");
        bread7.showBread();

        Bread bread8 = new Bread("Sara Lee", 18, "Sourdough");
        bread8.showBread();

        Bread bread9 = new Bread("Dimpfelmeier", 20, "Rye Bread");
        bread9.showBread();
    }
}