package sample;

public class PoisonMatango extends Matango{
	int numberOfAttacks = 5;
	PoisonMatango(char suffix) {   //Matangoクラスに引数なしコンストラクタがないので同じ引数でコンストラクタを定義する
		super(suffix);             //スーパークラスにそのまま渡す
	}
	@Override
	public void attack(Hero h) {
		super.attack(h);          //スーパークラスのattackメソッドの呼び出し
		if (this.numberOfAttacks > 0) {
			System.out.println("さらに毒の胞子をばら撒いた！");
			int dmg = h.hp /5;
			h.hp -= dmg;          //現在のhpの5分の1をダメージとして計算し、hpから引く
			System.out.println(dmg + "ポイントのダメージ");
			this.numberOfAttacks--;
		}
	}
}
