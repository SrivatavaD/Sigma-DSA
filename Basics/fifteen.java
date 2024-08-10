import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class fifteen {

    //Spiral MAtrix Question 
    //Diagonal Sum Question
    //Search in a sorted matrix
    
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //TOP
            for(int j = startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i = startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] +" ");
            }

            //bottom
            for(int j = endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for(int i = endRow-1; i>= startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    // this diagonalSum function belongs to another question and here is the brute force approach of the same problem 
    public static int diagonalSum(int matrix[][]){ //0(n^2)
        int sum = 0;
        for(int i=0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static boolean staircaseSearch(int matrix[][] , int key){
        int row = 0 , col = matrix[0].length-1;
        while(row < matrix.length && col >= 0);{
            if(matrix[row][col] == key){
                System.out.println("found key at (" +row + "," +col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found!");
    return false;
        
    }
    

    
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4},
                           {5,6,7,8}, 
                           {9,10,11,12},
                           {13,14,15,16}};
        int key = 10;                   

        //printSpiral(matrix);    
        //System.out.println(diagonalSum(matrix)); 
        staircaseSearch(matrix, key);           
    }
    
}
