package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	public Slime(String name, String weapon) {
		super(name, weapon);
	}

	int HP = Dice.get(70, 130);

	public void setHp(int HP) {
		this.hp = HP;
	}

	int OFFENSIVE = Dice.get(5, 11);

	public void setOffensive(int OFFENSIVE) {
		this.offensive = OFFENSIVE;
	}

}
