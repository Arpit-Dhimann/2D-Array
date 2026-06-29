//PROBLEM: Take a matrix as input form user. Search for a given number x
//         and print the indices at which it occurs. 

import java.util.*;
public class Matrix_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input for rows of Array
        System.out.print("Enter rows of Array : ");
        int rows = sc.nextInt();
        // Input for columns of Array
        System.out.print("Enter cols of Array : ");
        int cols = sc.nextInt();

        // Create an 2D - Array
        int[][] numbers = new int[rows][cols];

        System.out.print("Enter x for searching : ");
        int x = sc.nextInt();

        if(rows<=0 || cols<=0){
            System.out.println("Array is Empty");
        }
        else {
        //Input Elements in Array
            for(int i=0 ; i<rows ; i++){  //for rows

                for(int j=0 ; j<cols ; j++){    //for columns
                    System.out.print("Enter elemete for row" + (i+1) + " & for " + (j+1) +  " : ");
                    numbers[i][j] = sc.nextInt();
                }
                System.out.println();
            }
        }    

        boolean found = false;
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){
                if(numbers[i][j] == x){
                    System.out.print("x found at position " + i + " , " + j + "  ");
                    found = true;
                }
            }
            System.out.println();
        }
        if(!found){
            System.out.println("x is not present in Array.");
        }    

        sc.close();
    }
}
