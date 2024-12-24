class Apple{
	private String modelName;
	private String modelType;
	private double price;
	
	public Apple(String modelName,String modelType,double price){
		this.modelName = modelName;
		this.modelType = modelType;
		this.price = price;
		
	}
	public void setModelName(String modelName){
		this.modelName = modelName;
	}
	public String getModelName(){
		return modelName;
	}
	public void setModelType(String modelType){
		this.modelType = modelType;
	}
	public String getModelType(){
		return modelType;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}


}