package the_game;

public class theGameSimulator {
	public static void main (String[] args) {
		Character king = new King();
		king.display();
		king.performFight();
		king.drink();
		//king.setWeaponBehavior(new useKnife());
		//king.performFight();
	}
}
 