class DisneyHotstar{
	private String seriesName;
	private int ratings;
	private String genre;
	
public DisneyHotstar(){
	System.out.println("Hotstar Constructor is created");
}
public void setSeriesName(String seriesName){
	this.seriesName = seriesName;
}
public String getSeriesName(){
	return seriesName;
}
public void setSeriesRatings(int ratings){
	this.ratings = ratings;
}
public int getRatings(){
	return ratings;
}
public void setSeriesGenre(String genre){
	this.genre = genre;
}
public String getGenre(){
	return genre;
}

}