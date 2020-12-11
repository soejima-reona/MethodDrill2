package method_drill;

public class Question11 {

	//■ 引数列がクラスの参照(Person クラスを用いる例) 戻り値なし
	//処理の内容： "こんにちは xx さん" というメッセージを出力する。
	//xx には引数列で渡された Person オブジェクトの名前( name )を入れる。
	//ヒント： Person クラスのインスタンス変数 name は private 修飾子が付いているので、
	//直接参照できない。 getName メソッドを用いて取得する。
	static void printMessage(Person person) {

		String name = person.getName();

		System.out.println("こんにちは" + name + "さん");
	}

	public static void main(String[] args) {

		Person person = new Person("aaaa", 25);
		printMessage(person);
	}

}
