package app;


public class FizzBuzzWebApp {

	public String fnCheck(int num) {
		if(num % 3 == 0 && num % 5 !=0) return "Fizz";
		if(num % 5 == 0 && num % 3 !=0) return "Buzz";
		if(num % 15 == 0 ) return "FizzBuzz";
		if(num % 3 != 0 || num % 5 != 0 ) return "Divided "+String.valueOf(num)+" by 3\n"+"Divided "+String.valueOf(num)+" by 5";
		return "Invalid Item";
		
	}
	public String fnCheck(String s) {
		return "Invalid Item";
	}
	
}
