package methods;

public class Question2 {
	
	public static void main(String[]args) {
		boolean areWeInTrouble=monkeyTrouble(true,true);
		boolean areWeInTrouble1=monkeyTrouble(true,false);
		boolean areWeInTrouble2=monkeyTrouble(false,false);
		System.out.println("monkeyTrouble + (true, true)" + "-->" + areWeInTrouble);
		System.out.println("monkeyTrouble + (true, false)" + "-->" + areWeInTrouble1);
		System.out.println("monkeyTrouble + (flase, false)" +  "-->" +areWeInTrouble2);
		
		
		
	}
			
		
		public static boolean monkeyTrouble( boolean aSmile, boolean bSmile) {
			boolean result=false;
			if(aSmile==bSmile || !aSmile==!bSmile) {
				result=true;
			}else {
				result=false;
				
				
			}
		
		return result;

	}
	

}
