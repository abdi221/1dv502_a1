package assignmentone;

/**
 * This is Javadoc comment.
 */
public class Album {
  // Declare private attributes
  private String name;
  private int releaseYear;
  private String artist;

  /**
   * This is Javadoc comment.
   */
  
  public Album(String name, int releaseYear, String artist) {
    this.name = name;
    this.releaseYear = releaseYear;
    this.artist = artist;

  }

  /** 
 * Setters and getters methods. 
 */
  public void setName(String newName) {
    if (newName != null && newName.length() >= 4) {
      this.name = newName;
    } else {
      this.name = "No name";
    }
  }
  /** 
   * Returns the name of the album.
 *
 * @return the name of the album
 */
  
  public String getName() {
    return name;
  }

  /** 
   * Sets the release year of the album.
 */
  public void setYear(int releaseYearen) {
    if (releaseYearen > 1800 && releaseYearen <= 2029) {
      this.releaseYear = releaseYearen;
    } else {
      this.releaseYear = -1;
    }
    
    
  }

  public int getYear() {
    return releaseYear;
  }

  /**
 * Sets the artist for this object.
 *
 * @param artist the name of the artist
 */
  public void setArtist(String artist) {
    if (artist != null && artist.length() > 4) {
      this.artist = artist;
    } else {
      this.artist = "No artist";
    }
  }

  /**
   * Returns the artist of the album.
   *
   * @return the artist of the album
  */
  public String getArtist() {
    return artist;
  }


}