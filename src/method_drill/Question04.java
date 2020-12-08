package method_drill;

public class Question04 {

	//引数列なし、戻り値あり
	static String getMessage() {

		return "よろしくおねがいします";
	}

	public static void main(String[] args) {

		// Question04 動作検証
		String message = getMessage();
		System.out.println(message);
	}

}
