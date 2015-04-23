package the_game;

public class King extends Character {
  public King() {
	  weaponBehavior = new useSword();
  }
  public void display() {
	  System.out.println("I`m a King");
  }
}
