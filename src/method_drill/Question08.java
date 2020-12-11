package method_drill;

public class Question08 {

	static double getAverage(double[] array) {

		//配列の平均値を返す処理
		double sum = 0;

		//配列数分のデータを合計(sum)
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		//平均値
		double ave = sum / array.length;

		return ave;
	}

	public static void main(String[] args) {

		// Question08 動作検証
		double data[] = { 10, 20, 30, 40, 50, 60 };
		double average = getAverage(data);
		System.out.println(average);
	}

}
