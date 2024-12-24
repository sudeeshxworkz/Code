class BlinkItTester{
	public static void main(String[] testing){
		boolean ref = BlinkItRunner.addCategory("Vegetables&Fruits");
		BlinkItRunner.addCategory("Cold Drinks & Juices");
		BlinkItRunner.addCategory("Bakery & Biscuits");
		BlinkItRunner.addCategory("Dry Fruits, Masala & Oil");
		BlinkItRunner.addCategory("Pharma & Wellness");
		BlinkItRunner.addCategory("Ice Creams & Frozen Desserts");
		BlinkItRunner.addCategory("Beauty & Cosmetics");
		BlinkItRunner.addCategory("Magazines");
		BlinkItRunner.addCategory("Dairy & Breakfast");
		BlinkItRunner.addCategory("Instant & Frozen Food");
		BlinkItRunner.addCategory("Sweet Tooth");
		BlinkItRunner.addCategory("Sauces & Spreads");
		BlinkItRunner.addCategory("Organic & Premium");
		BlinkItRunner.addCategory("Cleaning Essentials");
		BlinkItRunner.addCategory("Personal Care");
		
		
		
		
		BlinkItRunner.getCategory();
		
		BlinkItRunner.updateCategory("Magazines","Books");
		
		BlinkItRunner.getCategory();
		
		
		
	}
}