package methods;

public class Question3 {
	
	public static void main(String[]args) {
		
		
		int myTotal = sumDouble(1,2);
		int myTotal1 = sumDouble(3,2);
		int myTotal2 = sumDouble(2,2);
		
		System.out.println("sumDouble(1,2)"+ "-->" +  myTotal);
		System.out.println("sumDouble(3,2)"+ "-->" +   myTotal1);
		System.out.println("sumDouble(2,2)"+ "-->" +   myTotal2);

		}

		
	public static int sumDouble(int valueOne , int valueTwo) {
	int result= valueOne + valueTwo;
	if (valueOne == valueTwo) {
		result = (valueOne + valueTwo)*2;
	}else{
		result = valueOne + valueTwo;


	}
	return result;
	}
		
	}


