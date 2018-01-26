
public class Poppo extends Pokemon{

	public Poppo(){
		super.setName("ポッポ");
		super.setType("ノーマル・ひこう");
		super.setWeakness("でんき・こおり・いわ");
		super.setText("もりや はやしに おおく ぶんぷ。\nちじょうでも はげしく はばたいてすなを かけたりする。");
		super.setHp(100);
		super.setLevel(5);
	}


//以下メソッド
	public void bodyBlow(){
		String name=super.getName();
		System.out.println(name+"の たいあたり！");
		}


}
