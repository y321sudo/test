import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args)throws Exception {
//インスタンス化
		Yuusha yuusha=new Yuusha();
		Hakase hakase=new Hakase();
		Zenigame zenigame=new Zenigame();
		Poppo poppo=new Poppo();
		MonsterBall monsterball=new MonsterBall();

//日時情報”save”で使用可
		Date now=new Date();
		SimpleDateFormat f=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String save=f.format(now);


//オーキド博士とサトシの出会い、卵からゼニガメが生まれる
		System.out.println();
		System.out.println(hakase.getName()+":やぁ"+yuusha.getName()+"、早速だが君にはポケモンを与えよう。この3つの卵から選びたまえ。");
		System.out.println(yuusha.getName()+":"+hakase.getName()+"ありがとう！この真ん中の卵にします！");
		System.out.println();

		System.out.println("◆家に戻って卵を温めていると・・・卵からポケモンが生まれた！◆");
		System.out.println("(^^)/"+zenigame.getName()+"、"+zenigame.getType()+"タイプポケモン\n"+zenigame.getText());
		System.out.println("レベル:"+zenigame.getLevel()+"　HP:"+zenigame.getHp());
		System.out.println();

		System.out.println("◆ここまでをセーブします。。。");
		System.out.println(save);
		System.out.println("　セーブが完了しました！◆");
		System.out.println();

//サトシとゼニガメ旅に出る、ポッポに遭遇
		System.out.println("◆早速"+yuusha.getName()+"と"+zenigame.getName()+"は旅に出た。◆");
		System.out.println("あ！ やせいの\n"+poppo.getName()+"が とびだしてきた！");
		System.out.println();
		System.out.println("ーーーティロリロリロリローーー");
		System.out.println();

//ポッポとゼニガメのバトル
		System.out.println("相手:"+poppo.getName()+" レベル:"+poppo.getLevel()+" HP:"+poppo.getHp());
		System.out.println("自分:"+zenigame.getName()+" レベル:"+zenigame.getLevel()+" HP:"+zenigame.getHp());
		System.out.println("→たたかう  どうぐ\n  ポケモン  にげる");
		System.out.println();

		zenigame.waterGun();
		poppo.setHp(poppo.getHp()-40);
		System.out.println(poppo.getName()+"のHPが"+poppo.getHp()+" になった。");
		System.out.println();

		poppo.bodyBlow();
		zenigame.setHp(zenigame.getHp()-40);
		System.out.println(zenigame.getName()+"のHPが"+zenigame.getHp()+" になった。");
		System.out.println();

		System.out.println("  たたかう→どうぐ\n  ポケモン  にげる");
		System.out.println(yuusha.getName()+"は"+monsterball.getName()+"を使った！");
		System.out.println();


	}

}
