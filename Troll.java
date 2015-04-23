package the_game;

public class Troll extends Character { 
	public Troll() {
		weaponBehavior = new useAxe();
	}
  public void display() {
	  System.out.println("I`m a Troll");
  }
}
