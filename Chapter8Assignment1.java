//Chapter 8 Book Assignment 1
//Made From Scratch

//Assignment:
//(Sum elements column by column) Write a method that returns the 
//sum of all the elements in a specified column in a matrix using the following header:
//public static double sumColumn(double[][] m, int columnIndex)

public class Chapter8Assignment1
{
	public static void main(String[] args) {
	    int mainColumnIndex = 0;
		double[][] array =
		{{1.5, 2, 3, 4},
		 {5.4, 6, 7, 8},
         {9, 10, 11, 12}};
		double sumReturn = sumColumn(array, mainColumnIndex);
		System.out.println("Sum of the elements at column " + mainColumnIndex + " is " + sumReturn);
	}
	
	public static double sumColumn(double[][] m, int columnIndex)
	{
	    double columnTotal = 0;
	    for(int row = 0; row < m.length; row++)
	    {
	        columnTotal += m[row][columnIndex];
	    }
	    return columnTotal;
	}
}