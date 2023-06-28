package chapter3;

public class SongTest {

	public static void main(String[] args) {
		Song song = new Song();
		song.setAlbum("Real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTitle("좋은날");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
		
		
		Song song2 = new Song("love dive", "parker", "ive", "aaaa", 3, 2); {
			song2.show();
		}
		
		Song song3 = new Song("사건의 지평선", "윤하"); {
			song3.show();
		}
		
		

	}

}
