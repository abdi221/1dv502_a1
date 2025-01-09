package onedv502_a1;

/**
 * Album class.
 */
public class Album {
  private String name;
  private int releaseYear;
  private String artist;

  /**
   * Constructor for album class.
   */
  public Album(String name, int releaseYear, String artist) {
    this.name = name;
    this.releaseYear = releaseYear;
    this.artist = artist;
  }

  /**
   * This method is checking for if the char is more than 4 without whitespace.
   *
   * @param name returns the name.
   *
   */
  public void setName(String name) {
    if (name == null) {
      this.name = "No name";
    } else if (name != null && name.trim().length() < 4) { 
      System.out.println("The name should be more than four characters long");
      this.name = "No name";
    } else {
      this.name = name;
    }
    
  }

  public String getName() {
    return name;
  }

  /**
   * checks the validity of the given release year.
   *
   * @param releaseYear returns the year.
   *
   */
  public void setYear(int releaseYear) {
    if(releaseYear >= 1801 && releaseYear <= 2029) {
      this.releaseYear = releaseYear;
    } else if (releaseYear < 1801 || releaseYear >= 2029) {
      System.out.println("The entered release year should not be before 1800 or after 2029");
      this.releaseYear = -1;
    }
     
    }

  public int getReleaseYear() {
    return releaseYear;
  }

  /**
   * this method is checking for improper values for artist.
   
   * @param artist checks if the artist paramter is null or empty, if not assigns it to this.artist.
   *
   */
  public void setArtist(String artist) {
    if (artist == null || artist.length() < 4) {
      this.artist = "No artist";
  } else {
      this.artist = artist;
  }
  }
  public String getArtist() {
    return artist;
  }

}