class SeriesName{
	public static void main(String series[]){
		
		DisneyHotstar ser = new DisneyHotstar();
		ser.setSeriesName("Spartacus");
		ser.setSeriesRatings(7);
		ser.setSeriesGenre("Action");
		
		
		System.out.println("Series Name is:"+ser.getSeriesName());
		System.out.println("Series Name is:"+ser.getRatings());
		System.out.println("Series Name is:"+ser.getGenre());
		
		
	}
}