package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	public Wizard(String name, String weapon) {
		super(name, weapon);
	}

	int HP = Dice.get(120, 180);

	public void setHp(int HP) {
		this.hp = HP;
	}

	int OFFENSIVE = Dice.get(12, 18);

	public void setOffensive(int OFFENSIVE) {
		this.offensive = OFFENSIVE;
	}

}
