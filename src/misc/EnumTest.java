package misc;

public class EnumTest {
  Day day;

  public EnumTest(Day day) {
    this.day = day;
  }

  public void tellItLikeItIs() {
    switch (day) {
      case MONDAY:
        System.out.println("Mondays suck.");
        break;
      case FRIDAY:
        System.out.println("Fridays are much better.");
        break;
      case SATURDAY:
      case SUNDAY:
        System.out.println("Weekends are the best.");
        break;

      default:
        System.out.println("Midweeks are so-so.");
        break;
    }
  }
}
