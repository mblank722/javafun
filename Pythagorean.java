public class Pythagorean {
  public static double calculateHypotenuse(int legA, int legB) {
    double hypotenuse = 0.0;
    hypotenuse = Math.sqrt( Math.pow(legA, 2) + Math.pow(legB, 2) );
    return hypotenuse;
  }
}
