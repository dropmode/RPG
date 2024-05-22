package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	public Fighter(String name, String weapon) {
		super(name, weapon);
		setHp(HP);
		setOffensive(OFFENSIVE);
	}

	int HP = Dice.get(240, 300);

	public void setHp(int HP) {
		this.hp = HP;
	}

	int OFFENSIVE = Dice.get(17, 23);

	public void setOffensive(int OFFENSIVE) {
		this.offensive = OFFENSIVE;
	}

}
