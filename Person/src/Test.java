
public class Test {

	public static void main(String[] args) {
		Person taro=new Person("山田太郎",18);
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person saburo=new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person ichiro=new Person(25);
		System.out.println(ichiro.name);
		System.out.println(ichiro.age);

		Person hanako=new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);

	}
}
