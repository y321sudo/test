
public class MonsterBall extends Item{

	public MonsterBall(){
		super.setName("モンスターボール");

	}

	public void release(){
		int a=super.getHp();
		int b=super.getLevel();
		if(a<20&&b<25){
			System.out.println("つかまえた！");
		}else if(a<40||b<25){
			System.out.println("なんとかつかまえられた！");
		}else{
			System.out.println("逃げられてしまった！");
		}
	}

}
