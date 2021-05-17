package pairprogramming;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GoldilocksTest {

	// Goldilocks g = new

	@Test
	public void goldilocksTest() {
		
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> gWeightTemp = new ArrayList<Integer>();
		ArrayList<Integer> chairOne = new ArrayList<Integer>();
		ArrayList<Integer> chairTwo = new ArrayList<Integer>();
		ArrayList<Integer> chairThree = new ArrayList<Integer>();
		ArrayList<Integer> chairFour = new ArrayList<Integer>();
		ArrayList<Integer> chairFive = new ArrayList<Integer>();

		gWeightTemp.add(100);
		gWeightTemp.add(120);
		//System.out.println(gWeightTemp.toString());

		chairOne.add(30);
		chairOne.add(30);

		chairTwo.add(130);
		chairTwo.add(100);

		chairThree.add(30);
		chairThree.add(30);

		chairFour.add(30);
		chairFour.add(30);

		chairFive.add(120);
		chairFive.add(120);

		input.add(gWeightTemp);
		input.add(chairOne);
		input.add(chairTwo);
		input.add(chairThree);
		input.add(chairFour);
		input.add(chairFive);
		
		ArrayList<>
		assertEquals([2,5], Goldilocks.goldilocks(input));
	}

}
