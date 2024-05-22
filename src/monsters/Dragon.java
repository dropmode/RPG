package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	public Dragon(String name, String weapon) {
		super(name, weapon);
		setHp(HP);
		setOffensive(OFFENSIVE);
		
	}

	int HP = Dice.get(270, 330);

	public void setHp(int HP) {
		this.hp = HP;
	}

	int OFFENSIVE = Dice.get(12, 18);

	public void setOffensive(int OFFENSIVE) {
		this.offensive = OFFENSIVE;
	}

}
