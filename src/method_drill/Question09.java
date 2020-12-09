package method_drill;

public class Question09 {

	static String getLongestString(String[] array) {

		//引数で受け取る配列の要素のうち、最も文字数の大きい文字列を返す。
		//文字数が同じものが複数存在する場合は、配列の後ろの方の要素を優先する。

		//引数の文字列を配列に入れる
		String[] data = array;

		//配列カウント
		int count = 0;
		//maxの文字数を格納
		int max = 0;

		for (int i = 0; i < data.length;) {

			//文字列を入れる（比較用）
			String character = data[i];

			//文字数を比較して、max以上だったら文字数と配列の要素数を保持
			if (max <= character.length()) {
				max = character.length();
				count = i;
			}

			++i;
		}

		//文字列を返す
		return "最も文字数の大きい文字列は 「" + data[count] + "」";
	}

	public static void main(String[] args) {

		// Question09 動作検証
		String data[] = { "aa", "bb", "ccc", "d", "eee", "ff" };

		//文字列の出力
		String character = getLongestString(data);
		System.out.println(character);

	}

}
