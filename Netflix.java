class Netflix {
    private int showId;
    private String showName;
    private String genre;
    private int seasons;

    
    public Netflix() {
        System.out.println("Netflix Constructor is created");
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public int getShowId() {
        return showId;
    }

	
    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowName() {
        return showName;
    }

    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getSeasons() {
        return seasons;
    }
}