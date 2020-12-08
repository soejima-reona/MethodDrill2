package method_drill;

public class Question02 {

	static double printCircleArea(double radius) {

		//円の面積＝半径(引数)*半径(引数)*円周率
		return radius * radius * Math.PI;
	}

	public static void main(String[] args) {
		// Question02のメソッドの動作検証
		double prinCircleArea = printCircleArea(2.0);
		System.out.println("円の面積は" + prinCircleArea);
	}
}
