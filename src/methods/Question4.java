package methods;

public class Question4 {
	
public static void main(String[]args) {
		
		
		int diffTotal = difference21(19);
		int diffTotal1 = difference21(10);
		int diffTotal2 = difference21(30);
		int diffTotal3 = difference21(21);
		
		System.out.println("difference21(19)"+ "-->" +  diffTotal);
		System.out.println("difference21(10)"+ "-->" +  diffTotal1);
		System.out.println("difference21(30)"+ "-->" +  diffTotal2);
		System.out.println("difference21(21)"+ "-->" +  diffTotal3);

		}

		
	public static int difference21 (int number) {
	int result= number - 21;
	if (number > 21) {
		result = (number - 21)*2;
	}else{
		result= number - 21;


	}
	return result;
	}
		
	}


