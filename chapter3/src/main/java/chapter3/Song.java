package chapter3;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() {
		
	}
	
	public Song(String title, String artist) { // 오버로드
//		this.title = title;
//		this.artist = artist;
		
		this(title, artist,"", "", 0, 0); // 중복된 코드를 붙여넣기 보다는 다른 곳의 원본 코드를 이용하는 방식을 쓸 것.
		// this는 다른 생성자를 불러올 수 있다.
		
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(); // 다른 생성자 호출시 앞쪽에서 사용. 이하의 다른 코드 이후에 배치하면 에러.
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	
	
	
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	
	public void show() {
		System.out.println(artist + " " + title + " " + album + " " + year + " " + track + "번 track  " + composer);
	}
	
	
	
	
	

}
