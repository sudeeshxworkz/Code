class HeadSet{
static boolean isConnected;
public static void main(String[] jbl){
	isConnected=onOrOff();
	System.out.println("HeadSet Connected: "+isConnected);
	isConnected=onOrOff();
	System.out.println("HeadSet Connected: "+isConnected);
	isConnected=onOrOff();
	System.out.println("HeadSet Connected: "+isConnected);
	isConnected=onOrOff();
	System.out.println("HeadSet Connected: "+isConnected);
	isConnected=onOrOff();
	System.out.println("HeadSet Connected: "+isConnected);

	
	
}
public static boolean onOrOff(){
	
	System.out.println("Start of OnOrOff");
	isConnected = !isConnected ? true:false;
	System.out.println("End of OnOrOff");
	return isConnected;
}
}
