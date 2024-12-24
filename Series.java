class Series {
    public static void main(String[] net) {
        Netflix show = new Netflix();

        show.setShowId(12601);
        show.setShowName("Stranger Things");
        show.setGenre("Science Fiction");
        show.setSeasons(4);

        System.out.println("Show ID: " + show.getShowId());
        System.out.println("Show Name: " + show.getShowName());
        System.out.println("Genre: " + show.getGenre());
        System.out.println("Seasons: " + show.getSeasons());
		
	}
}