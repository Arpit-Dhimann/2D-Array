//PROBLEMS: For a given matrix of rows x cols, print its transpose.

import java.util.*;
public class Matrix_Transpose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of Array : ");
        int rows = sc.nextInt();
        System.out.print("Enter Columns of Array : ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        if(rows<=0 || cols<=0){
            System.out.println("Array is Empty");
        }
        else{
            for(int i=0 ; i<rows ; i++){
                for(int j=0; j<cols ; j++){
                    System.out.println("Enter element for row " + (i+1) + ", column " + (j+1) + " : ");
                    numbers[i][j] = sc.nextInt();
                }
                System.out.println();
            }
        }
            for(int i=0 ; i<rows ; i++){
                for(int j=0; j<cols ; j++){
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }

        sc.close();
    }
}