
public class Srok_Proekta {

	public final static double PI = 3.14;
	public static int ItsMeThinking = 3; // months equals to diameter

	public static void main(String[] args) {

		/*
		 * Srok equal to 2*PI*r/2 = PI*r Найдите длину окружности, радиус
		 * которой равен 24 см. Число π округлите до сотых. Воспользуемся
		 * формулой длины окружности: C = 2πR ≈ 2 · 3,14 · 24 ≈ 150,72 см
		 */

		double Result = calculateLength(ItsMeThinking);

		System.out.println(Result);

	}

	public static double calculateLength(double ItsMeThinking) {
		return PI * ItsMeThinking / 2 + 0.5;
	}

}