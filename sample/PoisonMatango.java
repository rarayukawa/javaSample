package sample;

public class PoisonMatango extends Matango{
	int numberOfAttacks = 5;
	PoisonMatango(char suffix) {
		super(suffix);
	}
	@Override
	public void attack(Hero h) {
		super.attack(h);
		if (this.numberOfAttacks > 0) {
			System.out.println("さらに毒の胞子をばら撒いた！");
			int dmg = h.hp /5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ");
			this.numberOfAttacks--;
		}
	}
}
