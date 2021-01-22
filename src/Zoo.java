import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List <?> list) {
    System.out.println("Feeding birds");
    list.forEach(Bird::Eat);
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List <? super FlyingBird>  list, FlyingBird bird) {
    System.out.println("Accepting a bird to a section");
    list.add(bird);
    list.forEach(System.out::println);
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List <? super Bird> list, Bird newBird) {
    System.out.println("Adding a bird to the birds list");
    list.add(newBird);
    list.forEach(System.out::println);
  }
}