package crapsMain;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
	}

	
	public int IsBetweenTwoToTwelve() {
		return ((1+(int)(Math.random()*6))+(1+(int)(Math.random()*6)));
	}
	
	public String InitialRoll(int sum) {
		int point = 0;
		return "You Win or You Lose or Point is" + point;
	}
	
	public String MatchPointNextRolls(int sum, int sum2) {
		return "You Win or You Lose";
	}


}
