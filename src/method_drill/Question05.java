package method_drill;

public class Question05 {

	static boolean isEvenNumber(int value) {

		//引数が偶数＝true、　奇数＝false　を返す
		if (value % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		// Question05 動作検証
		boolean number = isEvenNumber(2000);
		System.out.println(number);
	}

}
