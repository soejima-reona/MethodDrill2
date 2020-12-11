package method_drill;

public class Question13 {

	//処理の内容： 配列に含まれる Person オブジェクトの中で、最も年齢の小さなオブジェクトの参照を返す。
	//同じ年齢の Person オブジェクトがある場合には、配列の後ろの方を優先する
	static Person getYoungestPerson(Person[] persons) {

		//配列カウント
		int count = 0;

		//minの年齢を格納(比較用)
		int min = persons[0].getAge();

		for (int i = 0; i < persons.length;) {

			int age = persons[i].getAge();

			if (min >= age) {

				min = age;
				count = i;

			}

			++i;
		}

		System.out.println(count);
		return persons[count];
	}

	public static void main(String[] args) {

		Person soejima = new Person("soejima", 50);
		Person sei = new Person("sei", 30);
		Person yamada = new Person("yamada", 10);

		Person persons[] = { soejima, sei, yamada };

		//最年少のpersonの配列情報をget
		System.out.println(getYoungestPerson(persons).getName());

	}

}
