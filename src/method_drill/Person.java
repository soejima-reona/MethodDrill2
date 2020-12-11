package method_drill;

public class Person {

	//Personクラス

	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {

		if (age >= 0) {
			this.age = age;
		}
	}

	//引数で渡された Person オブジェクトの年齢と、自分自身の年齢が同じであれば true,
	//そうでなければ false を返す。
	boolean isSameAge(Person person) {

		int personAge = person.getAge();
		int myAge = age;

		if (personAge == myAge) {
			return true;
		}
		return false;
	}

}
