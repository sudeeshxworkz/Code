class Calculator{
	
	public static void main(String[] calculator){
		System.out.println("main started"); 
		
		//invoked
		add(85,79);	//pass value in paranthisis ->statemnet / arguments
		add1(123,123);	
		sub(124,25);
		// add(589,789);
		// add(128,741);
		// add(93,95);
		// add(582,456);
		// add(105,56);
		// add(999,93);
		// add(218,29);
		System.out.println("main ended");

	}
	
	//method write fron <-- mathodname-returntype-accessspecifier
	public static void add(int Sudeesh, int Sri){
		int SudeeshSri = Sudeesh + Sri;
		System.out.println(SudeeshSri);
	}
	
	public static void add1(int n,int m){
		int addition = n + m;
		System.out.println(addition);
	}
	
	public static void sub(int num1, int num2){
		int total= num1 - num2;
		System.out.println(total); 
	}
	
}