// PROBLEM: Print the spiral order matrix as output for a given matrix of numbers.

//          For example: for the given matrix,
//                1   5   7   9  10   11
//                6  10  12  13  20   21
//                9  25  29  30  32   41
//               15  55  59  63  68   70
//               40  70  79  81  95  105
  
//          Spiral order is given by:
//          1 5 7 9 10 11 21 41 70 105 95 81 79 70 40 15 9 6 10 12 13 20 32 68 63 59 55 25 29 30 29 

import java.util.*;
public class Spiral_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for rows : ");
        int n = sc.nextInt();
        System.out.print("Enter m for columns : ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print("Enter elements in array : ");
                matrix[i][j] = sc.nextInt(); 
            }
        }
        
        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        while(rowStart <= rowEnd && colStart <= colEnd){

            // upper row
            for(int col = colStart ; col <= colEnd ; col++ ){
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            // Right Column
            for(int row = rowStart ; row <= rowEnd ; row++){
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            //Bottom row
            for(int col = colEnd ; col>=colStart ; col--){
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            //Left column
            for(int row = rowEnd ; row >= rowStart ; row--){
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
        }


     
        sc.close();
    }    
}
