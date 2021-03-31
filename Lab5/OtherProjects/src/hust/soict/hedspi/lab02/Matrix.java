import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row, column;
        do{
            System.out.println("Input the numbers of columns of Array:");
            column = input.nextInt();
            System.out.println("Input the numbers of rows of Array: ");
            row = input.nextInt();
            if(column<=0||row<=0)
                System.out.println("Error. Enter again");
        }while (column<=0||row<=0);
        
        //matrix 1
        int[][] matrix1 = new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.println("Input the value of element ["+ (i+1) +"] ["+ (j+1) +"] of the matrix 1?");
                matrix1[i][j]=input.nextInt();
            }
        }
        //matrix 2
        int[][] matrix2 = new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.println("Input the value of element ["+ (i+1) +"] ["+ (j+1) +"] of the matrix 1?");
                matrix2[i][j]=input.nextInt();
            }
        }
        
        int[][] matrix_sum = new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
            	matrix_sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.println("The value of element [" + (i+1) +"][" + (j+1) +"] of Matrix before added is " + matrix_sum[i][j]);
            }
        }
	}

}
