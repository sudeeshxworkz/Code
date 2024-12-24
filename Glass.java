class Glass {
    int glassId;
    String type;
    
	public Glass(){
	System.out.println("Glass Constructor is invoked");
    }

	public Glass(int g, String t){
		glassId = g;
		type = t;
	}
	
	 public void showGlass(){
	    System.out.println("Glass Id:"+glassId);
        System.out.println("Glass Type:"+type);
		System.out.println("----------------------");
   }	
	
}