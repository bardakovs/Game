package the_game;

public class Queen extends Character {
	public Queen() {
		weaponBehavior = new useKnife();
	}
public void display() {
	System.out.println("I`m a Queen");
}
}
