class TrainingBatchRunner {
    public static void main(String[] batch) {
        TrainingBatch batch1 = new TrainingBatch();
        batch1.showBatch();

        TrainingBatch batch2 = new TrainingBatch("Python Bootcamp", 25, "Ms. Pooja Sharma", "ABC Academy");
        batch2.showBatch();

        TrainingBatch batch3 = new TrainingBatch("Web Development", 20, "Mr. Rajesh Gupta", "Tech Learners");
        batch3.showBatch();

        TrainingBatch batch4 = new TrainingBatch("Data Science", 40, "Dr. Shweta Desai", "DataHub");
        batch4.showBatch();

        TrainingBatch batch5 = new TrainingBatch("Machine Learning", 35, "Mr. Amit Patel", "ML Academy");
        batch5.showBatch();

        TrainingBatch batch6 = new TrainingBatch("Cloud Computing", 28, "Ms. Anjali Verma", "Cloud Experts");
        batch6.showBatch();

        TrainingBatch batch7 = new TrainingBatch("Cyber Security", 32, "Mr. Rakesh Sharma", "CyberSec Institute" );
        batch7.showBatch();
		
        TrainingBatch batch8 = new TrainingBatch("UI/UX Design", 22, "Ms. Neha Joshi", "Design Academy");
        batch8.showBatch();

        TrainingBatch batch9 = new TrainingBatch("Digital Marketing", 27, "Mr. Kunal Mehta", "Marketing Hub");
        batch9.showBatch();
    }
}