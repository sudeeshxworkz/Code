class TrainingBatch {
    String batchName;
    int noOfTrainees;
    String trainerName;
    String instituteName;
	
	public TrainingBatch(){
		this("Java Basics", 30, "Mr. Anil Kumar", "XYZ Institute");
	System.out.println("TrainingBatch constructor is invoked");
	}
	
	public TrainingBatch(String b, int n, String t, String i){
		batchName = b;
		noOfTrainees = n;
		trainerName = t;
		instituteName = i;
	}
    public void showBatch(){
		System.out.println("Batch Name:"+batchName);
        System.out.println("Number of Trainees:"+noOfTrainees);
        System.out.println("Trainer Name:"+trainerName);
        System.out.println("Institute Name:"+instituteName);
		System.out.println("----------------------");
		
		
	}
}