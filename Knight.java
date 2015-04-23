package the_game;

public class Knight extends Character {
	public Knight() {
		weaponBehavior = new useBowAndArrow();
	}
  public void display() {
	  System.out.println("I`m a Knight");
  }
}
