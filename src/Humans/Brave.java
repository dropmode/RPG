package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	public Brave(String name, String weapon) {
		super(name, weapon);
		setHp(HP);
		setOffensive(OFFENSIVE);
		
	}

	int HP = Dice.get(170, 230);

	public void setHp(int HP) {
		this.hp = HP;
	}

	int OFFENSIVE = Dice.get(7, 13);

	public void setOffensive(int OFFENSIVE) {
		this.offensive = OFFENSIVE;
	}
}