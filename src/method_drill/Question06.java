package method_drill;

public class Question06 {

	static double getMinValue(double a, double b) {

		//引数のうち、小さいほうの値を返す
		if (a > b) {
			return b;
		} else
			return a;
	}

	public static void main(String[] args) {

		// Question06 動作検証
		double min = getMinValue(100, 101);
		System.out.println(min);
	}

}
