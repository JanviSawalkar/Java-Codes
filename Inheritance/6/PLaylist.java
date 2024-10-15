class Playlist{

	Playlist(){

		System.out.println("In const: Playlist");

	}

}

class FavSongsPlaylist extends Playlist{

	FavSongsPlaylist(){

		System.out.println("In const: FavSOngsPLaylist");


	}

}

class Client{

	public static void main(String[] args){

		Playlist pl = new FavSongsPlaylist();

	}


}