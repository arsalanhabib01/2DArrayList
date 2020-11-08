import java.util.*;
public class ArrayList2D {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> libraryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bookList = new ArrayList<String>();
		bookList.add("Java");
		bookList.add("C++");
		bookList.add("Oracle");
		System.out.println(bookList);
		libraryList.add(bookList);
		
		ArrayList<String> movieList = new ArrayList<String>();
		movieList.add("Tarzon");
		movieList.add("Troy");
		movieList.add("Gladiator");
		System.out.println(movieList);
		libraryList.add(movieList);
		
		ArrayList<String> gameList = new ArrayList<String>();
		gameList.add("Fifa");
		gameList.add("GTA");
		System.out.println(gameList);
		libraryList.add(gameList);
		
		System.out.println(libraryList);
		System.out.println(libraryList.get(1));
		System.out.println(libraryList.get(0).get(1));
		System.out.println(libraryList.get(1).remove(1));
		System.out.println(libraryList);
	}

}
