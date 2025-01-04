package assignmentone;

/**
 * Javadoc comment.
 */
public class AlbumGenerator {
  // Method to generate an array of albums
  /**
 * Javadoc comment.
 */
  public Album[] generateAlbums() {

    Album[] arrays = new Album[4];

    // Create albums and add them to the arrays
    Album album1 = new Album("Dark Of The Moon", 1973, "Pink Floyd");
    Album album2 = new Album("Wish you Were Here", 1975, "Pink Floyd");
    Album album3 = new Album("Animals", 1977, "Pink Floyd");
    Album album4 = new Album("The Wall", 1979, "Pink Floyd"); // Make album4 final

    // Add albums to the array
    arrays[0] = album1;
    arrays[1] = album2;
    arrays[2] = album3;
    arrays[3] = album4;

    // Return the arrays of albums 
    return arrays;
  }


}
