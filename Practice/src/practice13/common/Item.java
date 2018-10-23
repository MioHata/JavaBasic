package practice13.common;

public class Item {

	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */
	// フィールド
	String name;
	int additionalDamage;

	// セッター
	public void setName(String name) {
		this.name = name;
	}
	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	// ゲッター
	public String getName() {
		return this.name;
	}
	public int getAdditionalDamage() {
		return this.additionalDamage;
	}

	// コンストラクタ
	public Item(String name,int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}
}
