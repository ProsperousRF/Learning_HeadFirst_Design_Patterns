package simuduck;

/**
 * @author Stanislav Rakitov
 */
public class MuteQuack implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
