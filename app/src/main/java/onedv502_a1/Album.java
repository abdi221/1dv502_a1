package onedv502_a1;

/**
 * Album class.
 */
public class Album {
  private String name;
  private int releaseYear;
  private String artist;

  /**
   * Constructor for album class
   */
  public Album(String name, int releaseYear, String artist) {
    this.name = name;
    this.releaseYear = releaseYear;
    this.artist = artist;
  }

  public void setName(String name) {
    if (this.name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name should not be null or empty");
    }
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setYear(int releaseYear) {
    if (this.releaseYear > 2029 || this.releaseYear < 1800) {
      throw new IllegalArgumentException("The entered release year should not be before 1800 or after 2029");
    }
    this.releaseYear = releaseYear;
  }

  public int getReleaseYear() {
    return releaseYear;
  }



}