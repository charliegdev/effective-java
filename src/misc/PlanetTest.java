package misc;

public class PlanetTest {
  public static void test(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: java Planet <earth_weight>");
      System.err.println("Example: java Planet 82");
      System.exit(-1);
    }

    double earthWeight = Double.parseDouble(args[0]);
    double mass = earthWeight / Planet.EARTH.surfaceGravity();

    for (Planet p : Planet.values()) {
      System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
    }
  }

}
