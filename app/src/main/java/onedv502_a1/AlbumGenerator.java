package onedv502_a1;

/**
 * class method.
 */
public class AlbumGenerator {

  /**
   * method for working with arrays and printing out some albums.
   *
   * @return an array of strings.
   *
   */
  public Album[] generateAlbums() {
    Album[]fourAlbums = new Album[4];
    Album darkSide = new Album("Dark Side of the moon ", 1973, " Pink Floyed");
    Album wishYouWereHere = new Album("Wish you were here ", 1975, " Pink Floyed");
    Album animals = new Album("Animals ", 1977, " Pink Floyed");
    Album theWall = new Album("The Wall ", 1979, " Pink Floyed");
    fourAlbums[0] = darkSide;
    fourAlbums[3] = theWall;
    fourAlbums[2] = animals; 
    fourAlbums[1] = wishYouWereHere;
    return fourAlbums;
  }
  

}
