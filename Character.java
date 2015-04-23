package the_game;

public abstract class Character {
	WeaponBehavior weaponBehavior;

	public Character() {
	}

	public abstract void display();

	public void performFight() {
		weaponBehavior.fight();
	}

	public void drink() {
		System.out.println("All Characters are drink, even Queen");
	}

	public void setWeaponBehavior(WeaponBehavior wb) {
		weaponBehavior = wb;
	}
}
