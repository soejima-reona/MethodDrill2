package method_drill;

public class Question16 {

	public static void main(String[] args) {

		Person soejima = new Person("soejima", 50);
		Person sei = new Person("sei", 25);

		sei.isSameAge(soejima);
		System.out.println(sei.isSameAge(soejima));

	}

}
