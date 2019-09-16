package crapsMain;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = new Main().InitialRoll(new Main().IsBetweenTwoToTwelve());
		System.out.println(result);
	}

	public int roll() {
		return 1+(int)(Math.random()*6);
	}
	public int IsBetweenTwoToTwelve() {
		return roll()+roll();
	}
	
	public int point = 0;
	
	public String InitialRoll(int sum) {
			return "You Win";
		
		
	}
	
	public String MatchPointNextRolls(int sum, int sum2) {
		System.out.println("Point is " + point);
		
			return "Roll was " + sum2 + " You Win";
	
	}


}
