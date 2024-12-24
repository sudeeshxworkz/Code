class TrainingBatchRunner {
    public static void main(String[] batch) {
        TrainingBatch batch1 = new TrainingBatch();
        batch1.batchName = "Java Basics";
        batch1.noOfTrainees = 30;
        batch1.trainerName = "Mr. Anil Kumar";
        batch1.instituteName = "XYZ Institute";
        batch1.showBatch();

        TrainingBatch batch2 = new TrainingBatch();
        batch2.batchName = "Python Bootcamp";
        batch2.noOfTrainees = 25;
        batch2.trainerName = "Ms. Pooja Sharma";
        batch2.instituteName = "ABC Academy";
        batch2.showBatch();

        TrainingBatch batch3 = new TrainingBatch();
        batch3.batchName = "Web Development";
        batch3.noOfTrainees = 20;
        batch3.trainerName = "Mr. Rajesh Gupta";
        batch3.instituteName = "Tech Learners";
        batch3.showBatch();

        TrainingBatch batch4 = new TrainingBatch();
        batch4.batchName = "Data Science";
        batch4.noOfTrainees = 40;
        batch4.trainerName = "Dr. Shweta Desai";
        batch4.instituteName = "DataHub";
        batch4.showBatch();

        TrainingBatch batch5 = new TrainingBatch();
        batch5.batchName = "Machine Learning";
        batch5.noOfTrainees = 35;
        batch5.trainerName = "Mr. Amit Patel";
        batch5.instituteName = "ML Academy";
        batch5.showBatch();

        TrainingBatch batch6 = new TrainingBatch();
        batch6.batchName = "Cloud Computing";
        batch6.noOfTrainees = 28;
        batch6.trainerName = "Ms. Anjali Verma";
        batch6.instituteName = "Cloud Experts";
        batch6.showBatch();

        TrainingBatch batch7 = new TrainingBatch();
        batch7.batchName = "Cyber Security";
        batch7.noOfTrainees = 32;
        batch7.trainerName = "Mr. Rakesh Sharma";
        batch7.instituteName = "CyberSec Institute";
        batch7.showBatch();
		
        TrainingBatch batch8 = new TrainingBatch();
        batch8.batchName = "UI/UX Design";
        batch8.noOfTrainees = 22;
        batch8.trainerName = "Ms. Neha Joshi";
        batch8.instituteName = "Design Academy";
        batch8.showBatch();

        TrainingBatch batch9 = new TrainingBatch();
        batch9.batchName = "Digital Marketing";
        batch9.noOfTrainees = 27;
        batch9.trainerName = "Mr. Kunal Mehta";
        batch9.instituteName = "Marketing Hub";
        batch9.showBatch();
    }
}