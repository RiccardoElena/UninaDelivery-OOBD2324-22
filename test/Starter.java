package test;

/**
 * This is the starter class for the test package.
 * <p>
 * This class has method main() as entry point.
 * 
 * <p>
 * Being a utility class, it cannot be instantiated, so it throws and exeption trying.
 * 
 * @version 1.0
 * @author Riccardo Elena
 */

public class Starter {

  // Contructors

  private void StringUtils() {
    throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");

  }

  // Methods
  public static void main(final String[] args) {
    System.out.println("Hello World!");
  }

}
