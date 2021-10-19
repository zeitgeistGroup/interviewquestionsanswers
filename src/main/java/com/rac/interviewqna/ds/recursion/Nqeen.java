package com.rac.interviewqna.ds.recursion;

public class Nqeen {


    public static void main(String arg[]){

        int number =4;
        int[][] matrix=new int[number][number];

        Nqeen nqeen=new Nqeen();
        nqeen.nQueen(matrix,0,number);


    }



    public boolean nQueen(int[][] matrix,int column,int number){
        if(column==number){
            for(int i=0;i<number;i++){
                for(int j=0;j<number;j++){
                    System.out.print(matrix[i][j]);
                }
                System.out.println(" ");
            }

            return true;
        }


        for(int row=0;row<number;row++){
            if(isSafe(row ,column,matrix,number)){
                matrix[row][column]=1;
                if(nQueen(matrix,column+1,number)==true)return true;
                matrix[row][column]=0;
            }
        }
        return false;
    }

    private boolean isSafe(int row, int column, int[][] matrix,int number) {
        /* Check this row on left side */
        for (int i = 0; i < column; i++)
            if (matrix[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--)
            if (matrix[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (int i = row, j = column; j >= 0 && i < number; i++, j--)
            if (matrix[i][j] == 1)
                return false;
        return true;
    }

}
