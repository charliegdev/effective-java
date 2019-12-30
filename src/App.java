import creating_destructing_objects.NutritionFacts;
import misc.Day;
import misc.EnumTest;
import misc.PlanetTest;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // To show the point, don't specify fat. That optional parameter would have its default value.
    NutritionFacts cocaCola =
        new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

    System.out.println(cocaCola);

    EnumTest firstDay = new EnumTest(Day.MONDAY);
    firstDay.tellItLikeItIs();

    PlanetTest.test(args);
  }
}
