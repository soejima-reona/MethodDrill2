package method_drill;

public class Question07 {

	//引数列が複数、戻り値あり
	static String getMessage(String name, boolean isKid) {

		if (isKid == true) {
			return "こんにちは。" + name + "ちゃん。";
		}
		return "こんにちは。" + name + "さん。";
	}

	public static void main(String[] args) {

		//Question07 動作検証
		String message = getMessage("山田", false);
		System.out.println(message);
	}

}
