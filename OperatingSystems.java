class OperatingSystems {
    String name;
    String version;
	
   public OperatingSystems(){
	  this( "Windows", "10");
	System.out.println("OperatingSystems constructor is invoked");
	}
	
	public OperatingSystems(String n, String v){
		name = n;
		version = v;
	}
    public void showSystem(){
		System.out.println("OS Name:"+name);
        System.out.println("OS Version:"+version);
		System.out.println("----------------------");
		
		
	}
}