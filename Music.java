class Music{
	
	static int noOfMusic=20;
	static String playlistName="Kannada Songs";
	static boolean isNewSongsAvailable=true;
	static char seriesOfTheMusic='K';
	
	public static void totalNumberOfMusic(){
		
		nameOfThePlaylist();
		System.out.println("total number of musics in the playlist are=="+noOfMusic);
	}
	
	public static void nameOfThePlaylist(){
		
		System.out.println("name of the playlist is=="+playlistName);
	}
	
}