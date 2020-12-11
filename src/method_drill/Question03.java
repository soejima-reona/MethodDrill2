package method_drill;

public class Question03 {

	//戻り値なし　　引数２
	static void printMessage(String message, int count) {

		//変数iが、引数countより小さいときはメッセージ出力（countより大きくなったら抜ける）
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	public static void main(String[] args) {

		// Question03 のメソッドの動作検証
		printMessage("Hello", 5);

	}

}
