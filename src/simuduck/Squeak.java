package simuduck;

/**
 * @author Stanislav Rakitov
 */
public class Squeak implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
