package method_drill;

public class Question10 {

	// ■ 引数列がクラスの参照(Point クラスを用いる例)

	//引数で受け取る Point オブジェクトの、原点からの距離を返す
	//ヒント：点 (x, y) の原点からの距離は Math.sqrt(x*x+y*y) で求まる。
	static double getDistanceFromOrigin(Point p) {

		double distance = Math.sqrt(p.x * p.x + p.y * p.y);

		return distance;

	}

	public static void main(String[] args) {

		Point pp = new Point(3.5, 5.9);

		double aaa = getDistanceFromOrigin(pp);
		System.out.println(aaa);

	}

}

class Point {
	double x;
	double y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}