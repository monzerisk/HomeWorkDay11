package methods;

public class Question1 {
	
	public static void main(String[] args) {
		boolean amISleeping = sleepIn (true, false);
		
		boolean amISleeping1 = sleepIn (true, true);
	
		boolean amISleeping2 = sleepIn (false, false);
		
		boolean amISleeping3 = sleepIn (false, true); 
		
	
		System.out.println(amISleeping);
		System.out.println(amISleeping1);
		System.out.println(amISleeping2);
		System.out.println(amISleeping3);
		
		

		
	}

	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {

		boolean result = false;

		if (isWeekday == true && isVacation == true) {
			result = false;

		} else {

			result = true;

		}
		return result;

	}

}



