/*
* Created by: Michael balcerzak
* Created on: 4-Nov-2016
* Created for: ICS3U
* Daily Assignment – Unit#3-05
* This program find all the magic squares in 9 diffrent digits in an array
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicSquare {

	public static void main(String[] args) {

		int[] magicSqurare = new int[] {1,2,3,4,5,6,7,8,9};
		
		for(int counter = 1; counter < 10; counter++) {
			for(int counter2 = 1; counter2 < 10; counter2++) {
				for(int counter3 = 1; counter3 < 10; counter3++) {
					for(int counter4 = 1; counter4 < 10; counter4++) {
						for(int counter5 = 1; counter5 < 10; counter5++) {
							for(int counter6 = 1; counter6 < 10; counter6++) {
								for(int counter7 = 1; counter7 < 10; counter7++) {
									for(int counter8 = 1; counter8 < 10; counter8++) {
										for(int counter9 = 1; counter9 < 10; counter9++) {
											
											magicSqurare[0] = counter;
											magicSqurare[1] = counter2;
											magicSqurare[2] = counter3;
											magicSqurare[3] = counter4;
											magicSqurare[4] = counter5;
											magicSqurare[5] = counter6;
											magicSqurare[6] = counter7;
											magicSqurare[7] = counter8;
											magicSqurare[8] = counter9;		
											
											int number1 = 0;
											int number2 = 1;
											int number3 = 2;
											int number4 = 3; 
											int number5 = 4;
											int number6 = 5;
											int number7 = 6;
											int number8 = 7;
										
											number1 = magicSqurare[0] + magicSqurare[1] + magicSqurare[2];
											number2 = magicSqurare[3] + magicSqurare[4] + magicSqurare[5];
											number3 = magicSqurare[6] + magicSqurare[7] + magicSqurare[8];
											number4 = magicSqurare[0] + magicSqurare[3] + magicSqurare[6];
											number5 = magicSqurare[1] + magicSqurare[4] + magicSqurare[7];
											number6 = magicSqurare[2] + magicSqurare[5] + magicSqurare[8];
											number7 = magicSqurare[0] + magicSqurare[4] + magicSqurare[8];
											number8 = magicSqurare[2] + magicSqurare[4] + magicSqurare[6];
											
											if ((number1 == number2) && (number1 == number3) && (number1 == number4) && (number1 == number5) &&(number1 == number6) && (number1 == number7) && (number1 == number8) && (number2 == number3) && (number2 == number4) && (number2 == number5) &&(number2 == number6) && (number2 == number7) && (number2 == number8) && (number3 == number4) && (number3 == number5) &&(number3 == number6) && (number3 == number7) && (number3 == number8)&& (number4 == number5) && (number4 == number6) && (number4 == number7) && (number4 == number8) && (number5 == number6) && (number5 == number7) && (number5 == number8) && (number6 == number7) && (number6 == number8) && (number7 == number8)) {
												System.out.println(Arrays.toString(magicSqurare) + "there is a magic squrare");
											}
											
										}
									}
								}
							}
						}
					}
				}
			}
		}		
	}
}
