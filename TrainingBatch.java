class TrainingBatch {
    String batchName;
    int noOfTrainees;
    String trainerName;
    String instituteName;
	
	public TrainingBatch(){
	System.out.println("TrainingBatch constructor is invoked");
}
    public void showBatch(){
		System.out.println("Batch Name:"+batchName);
        System.out.println("Number of Trainees:"+noOfTrainees);
        System.out.println("Trainer Name:"+trainerName);
        System.out.println("Institute Name:"+instituteName);
		System.out.println("----------------------");
		
		
	}
}