package bases;

import utils.Dice;

//人間を表現する抽象クラス
public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);

	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int run = Dice.get(1, 10);
		int dam = run * offensive;
		// 相手のHPをダメージ値だけ減らす
		target.hp -= dam;
		// 自分の攻撃力を1だけ減らす
		super.offensive--;
		// コンソールにステータスを表示
		System.out.println(
				"「" + name + "」" + "が" + "「" + weapon + "」" + "で攻撃！" + "「" + target + "」" + "に" + dam + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した。");
	}
}