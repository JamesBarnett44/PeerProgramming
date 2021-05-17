package pairprogramming;

import java.util.ArrayList;

public class Goldilocks {

	public static void main(String[] args) {

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

		//System.out.println(input.toString());

		System.out.println(goldilocks(input));

	}

	public static ArrayList<Integer> goldilocks(ArrayList<ArrayList<Integer>> weightTemp) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int gWeight = weightTemp.get(0).get(0);
		int maxTemp = weightTemp.get(0).get(1);

		for (int i = 1; i < weightTemp.size(); i++) {
			
			if ((weightTemp.get(i).get(0) >= gWeight) && (weightTemp.get(i)).get(1) <= maxTemp) {
				output.add(i);
			}

		}

		return output;

	}
}
