package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	public Oak(String name, String weapon) {
		super(name, weapon);
	}

	int HP = Dice.get(170, 230);

	public void setHp(int HP) {
		this.hp = HP;
	}

	int OFFENSIVE = Dice.get(9, 15);

	public void setOffensive(int OFFENSIVE) {
		this.offensive = OFFENSIVE;
	}

}
