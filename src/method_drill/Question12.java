package method_drill;

public class Question12 {

	static boolean isAdult(Person person) {

		int age = person.getAge();

		if (age >= 20) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		Person person = new Person("aaa", 20);
		System.out.println(isAdult(person));
	}

}
