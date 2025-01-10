package onedv502_a1;

import java.util.ArrayList;
import java.util.List;

/**
 * Javadoc comment.
 */
public class AlbumGenerator {
  private int releaseYear;
  private String name;
  private String artist;

  public AlbumGenerator(String name, int releaseYear, String artist) {
    this.name = name;
    this.releaseYear = releaseYear;
    this.artist = artist;
  }

  public void generatAlbums() {
    List<String> list = new ArrayList<>();
    list.add("Dark Side of the moon ");
    list.add("Wish you were here ");
    list.add("Animals ");
    list.add("The Wall ");
    ArrayList<String>fourAlbums = new ArrayList<>(list.size()); // create array of the same size as the list
    for (int i = 0; i < list.size(); i++) {
      fourAlbums.add(list.get(i));
    }

  }

  public String getName() {
    return name;
  }

  public String getArtist() {
    return artist;
  }

  public int getReleaseYear() {
    return releaseYear;
  }
  

}
