package crapsMain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MainTest {
	//Test for range of dice throw sum
	@Test
	public void insideRange(){
	  int random = new Main().IsBetweenTwoToTwelve();
	  int high = 12;
	  int low = 2;
	  assertTrue(high >= random);
	  assertTrue(low  <= random);  
	}
	
	//Initial Roll
	@Test
	void InitialWinIsSevenorEleven(){
		String result = new Main().InitialRoll(7);
		String result1 = new Main().InitialRoll(11);
		assertEquals("You Win", result);
		assertEquals("You Win", result1);
	}
	
	@Test
	void InitialLosesIs2or3(){
		String result = new Main().InitialRoll(2);
		String result1 = new Main().InitialRoll(3);
		assertEquals("You Lose", result);
		assertEquals("You Lose", result1);
	}

	@Test
	void InitialPointIs9or8(){
		String result = new Main().InitialRoll(8);
		String result1 = new Main().InitialRoll(9);
		assertEquals("Point is" + result, result);
		assertEquals("Point is" + result1, result1);
	}
	
	
	//Point Match Roll
	@Test
	void PointMatchesPoint(){
		String result = new Main().MatchPointNextRolls(4, 4);
		assertEquals("You Win", result);
	}
	
	//If you roll a seven you lose
	@Test
	void PointRollSeven(){
		String result = new Main().MatchPointNextRolls(4, 7);
		assertEquals("You Lose", result);
	}
	
	
}
