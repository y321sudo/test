
public class Yuusha extends Human {


		public Yuusha(String name){
			super(name);
		}
	@SuppressWarnings("resource")
	public Yuusha(){
		System.out.println("◆↓名前を入力◆");
		super.setName(new java.util.Scanner(System.in).nextLine());
		System.out.println("◆↓性別を半角数字で入力(1:おとこ 2:おんな)◆");
		super.setGender(new java.util.Scanner(System.in).nextInt());
	}
//勇者が持ってるアイテム
	MonsterBall monsterball;
	void release(){
		System.out.println(Yuusha.getName()+"は"+monsterball.getName()+"を投げた！");
	}
	//以下メソッド



}
