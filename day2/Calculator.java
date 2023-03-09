package week1.day2;


public class Calculator {

	public int add (int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public int mul (int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	public void sub(int num1, int num2) {
		System.out.println("Subtraction");
		return;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(1, 2, 3));
		System.out.println(calc.mul(3, 2));
		
	}
}
