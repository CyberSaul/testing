import java.util.Scanner;
import java.util.Random;

public class RPSDriver {

	static Scanner scan = new Scanner(System.in);

	static int[][][] matrixArray  = new int[3][3][3];
	static int[][][] matrixArray1 = new int[3][3][3];
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;		
		int c = options();

		if(c == 1) {			
			a = ab(0);
			b = ab(1);		
			int matrixArray[][][] = filler(a, b);
			int matrixArray1[][][] = function(matrixArray, c, a, b);
			ULTP(matrixArray1, a , b, c);

		}if(c == 2) {			
			a = ab(0);
			b = ab(1);		
			int matrixArray[][][] = filler(a, b);
			int matrixArray1[][][] = function(matrixArray, c, a, b);
			ULTP(matrixArray1, a , b, c);

		}if(c == 3) {			
			a = 2;
			b = 3;		
			int matrixArray[][][] = mFiller(a, b);
			int matrixArray1[][][] = mFunction(matrixArray, a, b);
			ULTP(matrixArray1, a , b, c);

		}if(c == 4) {
			a = ab(0);
			b = ab(1);
			int matrixArray[][][] = cFiller(a, b);
			int matrixArray1[][][] = function(matrixArray, c, a, b);
			ULTP(matrixArray1, a , b, c);

		}if(c == 5) {
			a = ab(0);
			b = ab(1);
			int matrixArray[][][] = tFiller(a, b);
			ULTP(matrixArray, a , b, c);

		}if(c == 6) {

		}if(c == 0) {

		}		
	}

	private static int options()
	{
		System.out.println("Your options are: \n" + 
				"-----------------\n" +
				"		1) Add 2 matrices                   DONE \n" + 
				"		2) Subtract 2 matrices              DONE \n" + 
				"		3) Multiply 2 matrices              2x3X3x2 ONLY\n" + 
				"		4) Multiply matrix by a constant    DONE\n" + 
				"		5) Transpose matrix                 DONE\n" + 
				"		6) Matrix trace                     In Progress\n" + 
				"		0) EXIT                             In Progress\n\n" +
				"Enter corressponding #: ");
		int c = scan.nextInt();

		return c;
	}	

	private static void ULTP(int[][][] matrixaArray, int a, int b, int c)
	{
		if(c != 3) {
			System.out.println("Matrix 1:");
			for (int y = 0; y < a; y++) {
				for (int x = 0; x < b; x++) {
					System.out.print(matrixArray[0][x][y]);
					System.out.print(" ");	
				}
				System.out.println("");
			}
		}if (c == 1 || c == 2) {
			System.out.println("Matrix 2:");
			for (int y = 0; y < a; y++) {
				for (int x = 0; x < b; x++) {
					System.out.print(matrixArray[1][x][y]);
					System.out.print(" ");	
				}
				System.out.println("");
			}
		}if (c == 3) {
			System.out.println("Matrix 1:");
			for (int x = 0; x < a; x++) {
				for (int y = 0; y < b; y++) {
					System.out.print(matrixArray[0][x][y] + " ");
				}
				System.out.println("");
			}
			System.out.println("Matrix 2:");
			for (int x = 0; x < b; x++) {
				for (int y = 0; y < a; y++) {
					System.out.print(matrixArray[1][x][y] + " ");	
				}
				System.out.println("");
			}
			System.out.println("Product: ");
			for (int y = 0; y < 2; y++) {
				for (int x = 0; x < 2; x++) {
					System.out.print(matrixArray[2][y][x] + " ");
				}
				System.out.println("");
			}
		}if (c == 4) {
			System.out.println("Constant: ");
			System.out.println(matrixArray[1][0][0]);	
		}if (c == 5) {
			for (int x = 0; x < b; x++) {
				for (int y = 0; y < a; y++) {
					System.out.print(matrixArray[0][x][y] + " ");	
				}
				System.out.println("");
			}
		}if (c != 5 && c != 3) {
			System.out.println("Product: ");
			for (int x = 0; x < a; x++) {
				for (int y = 0; y < b; y++) {
					System.out.print(matrixArray[2][y][x] + " ");
				}
				System.out.println("");
			}
		}
	}

	private static int[][][] filler(int a, int b) 
	{
		for (int i = 0; i < 2; i++) {	
			for (int y = 0; y < a; y++) {
				for (int x = 0; x < b; x++) {
					System.out.println("Matrix: " + (i + 1)  + " Row: " + (y + 1) + " slot: " + (x + 1));
					matrixArray[i][x][y] = scan.nextInt();
				}
			}
		}
		return matrixArray;
	}

	private static int[][][] mFiller(int a, int b)
	{
		for (int x = 0; x < a; x++) {
			for (int y = 0; y < b; y++) {
				System.out.println("Matrix: " + 1  + " Row: " + (x + 1) + " slot: " + (y + 1));
				matrixArray[0][x][y] = scan.nextInt();
			}
		}
		for (int x = 0; x < b; x++) {
			for (int y = 0; y < a; y++) {
				System.out.println("Matrix: " + 2  + " Row: " + (y + 1) + " slot: " + (x + 1));
				matrixArray[1][x][y] = scan.nextInt();
			}
		}		
		return matrixArray;
	}

	private static int ab(int unlock)
	{	
		String RC = "PH";
		if (unlock == 0) {
			RC = "columns";	
		}if (unlock == 1) {
			RC = "rows";
		}System.out.println("Enter # of " + RC + ": ");
		int ab = scan.nextInt();
		return ab;
	}





	private static int[][][] tFiller(int a, int b)
	{
		for (int x = 0; x < a; x++) {
			for (int y = 0; y < b; y++) {
				System.out.println("Row: " + (x + 1) + " slot: " + (y + 1));
				matrixArray[0][x][y] = scan.nextInt();
			}
		}		
		return matrixArray;
	}

	private static int[][][] cFiller(int a, int b)
	{
		for (int x = 0; x < a; x++) {
			for (int y = 0; y < b; y++) {
				System.out.println("Matrix: " + 1  + " Row: " + (x + 1) + " slot: " + (y + 1));
				matrixArray[0][x][y] = scan.nextInt();
			}
		}
		int constant = 0;	
		System.out.println("Enter constant: ");
		constant = scan.nextInt();	
		matrixArray[1][0][0] = constant;	
		return matrixArray;
	}

	private static int[][][] mFunction(int[][][] matrixArray,int a, int b)
	{
		int d = 0;

		for (int x = 0; x < 2; x++) 
		{
			for (int z = 0; z < 2; z++) 
			{
				for (int y = 0; y < 3; y++) 
				{
					d = d + matrixArray[0][x][y] * matrixArray[1][y][z];
				}
				matrixArray[2][x][z] = d;
				d = 0;
			}

		}

		return matrixArray;
	}

	private static int[][][] function(int[][][] matrixArray, int c, int a, int b) 
	{
		int constant = matrixArray[1][0][0];
		for (int y = 0; y < a; y++) {
			for (int x = 0; x < b; x++) {

				int d = matrixArray[0][x][y];
				int e = matrixArray[1][x][y];


				if(c == 1) {
					matrixArray[2][x][y] = (d + e);
				}else if (c == 2) {
					matrixArray[2][x][y] = (d - e);
				}else if (c == 4) {
					matrixArray[2][x][y] = (d * constant);
				}

			}

		}
		return matrixArray;
	}

}
