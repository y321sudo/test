
public class Human {
//フィールド
	private String name=null;
	private int gender='0';    //性別(1:男 2:女)

//コンストラクタ
	Human(String m){
		this.name=m;
	}
	Human(){
	}

	//以下メソッド
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public int gender(){
		return gender;
	}
	public void setGender(int gender){
		switch(gender){
		case 1:
			System.out.println("おとこ");
			break;
		case 2:
			System.out.println("おんな");
			break;
		default:
			System.out.println("エラー:半角数字の1か2を入力してください");
		}
	}








}






