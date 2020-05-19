package topic1;

public class TheObviousExample {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("The answer is " + math(7,7, "division"));
			
	}
	
	
	
	public static int math(int num1, int num2, String option) {
		switch(option) {
		
		case "addition":
			return addition(num1, num2);
		case "subtraction":
			return subtraction(num1, num2);
		case "multiplication":
			return multiplication(num1, num2);
		default:
			return division(num1, num2);
		}
	}


	private static  int division(int num1, int num2) {
		int result = num1/num2;
		return result;	
	}



	private static int multiplication(int num1, int num2) {
		
		int result = num1*num2;
		return result;


	}



	private static int subtraction(int num1, int num2) {
		int result = num1-num2;
		return result;
	}



	private static int addition(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	
	

}
