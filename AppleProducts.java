class AppleProducts{
	public static void main(String tim[]){
		
		Apple jeff = new Apple("Iphone 16 Pro","Smart Phone",150000.00);
		System.out.println(jeff);
		
		jeff.setModelName("Iphone 16 Pro");
		jeff.setModelType("Smart Phone");
		jeff.setPrice(150000.00);
		
		System.out.println("Model Name:"+jeff.getModelName());
		System.out.println("Model Name:"+jeff.getModelType());
		System.out.println("Model Name:"+jeff.getPrice());
		
	}
}