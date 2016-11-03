import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] magicSquare = new int[] {1,2,3,4,5,6,7,8,9};
		List<int[]> magicSquareList = new ArrayList<int[]>();
		
		int remove;
		int input; 
		
		for(int counter = 0; counter < 9; counter++) {
			for(int counter2 = 0; counter2 < 9; counter2++) {
				remove = magicSquare[counter2];
				input = magicSquare[counter];
				magicSquare[counter] = remove;
				magicSquare[counter2] = input;
				magicSquareList.add(magicSquare);
				magicSquare = new int[] {1,2,3,4,5,6,7,8,9};
			}
		}
		
		int number1 = 0;
		int number2 = 1;
		int number3 = 2;
		int number4 = 3; 
		int number5 = 4;
		int number6 = 5;
		int number7 = 6;
		int number8 = 7;
		
		int[] magicSquareArray = new int[9];
		
		while ((number1 == number2) && (number1 == number3) && (number1 == number4) && (number1 == number5) &&(number1 == number6) && (number1 == number7) && (number1 == number8) && (number2 == number3) && (number2 == number4) && (number2 == number5) &&(number2 == number6) && (number2 == number7) && (number2 == number8) && (number3 == number4) && (number3 == number5) &&(number3 == number6) && (number3 == number7) && (number3 == number8)&& (number4 == number5) && (number4 == number6) && (number4 == number7) && (number4 == number8) && (number5 == number6) && (number5 == number7) && (number5 == number8) && (number6 == number7) && (number6 == number8) && (number7 == number8)) {
			magicSquareArray = magicSquareList.get(0);
			magicSquareList.remove(0);
		
			number1 = magicSquareArray[0] + magicSquareArray[1] + magicSquareArray[2];
			number2 = magicSquareArray[3] + magicSquareArray[4] + magicSquareArray[5];
			number3 = magicSquareArray[6] + magicSquareArray[7] + magicSquareArray[8];
			number4 = magicSquareArray[0] + magicSquareArray[3] + magicSquareArray[6];
			number5 = magicSquareArray[1] + magicSquareArray[4] + magicSquareArray[7];
			number6 = magicSquareArray[2] + magicSquareArray[5] + magicSquareArray[8];
			number7 = magicSquareArray[0] + magicSquareArray[4] + magicSquareArray[8];
			number8 = magicSquareArray[2] + magicSquareArray[4] + magicSquareArray[6];
			
		} 
		 System.out.println(Arrays.toString(magicSquareArray));
		
	}

}
