//Dean Shafritz
//Minesweeper Java Program
//November 12, 2015
//CSE 002

import java.util.Scanner;

//define a class
public class Minesweeper {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        
        System.out.print("Enter the size of the board: ");
        int n = myScanner.nextInt(); 
        
        while (n>=2 && n<30){
            System.out.print("Enter the number of mines to be placed: ");
            int m = myScanner.nextInt(); 
        
        while (m > 0 && m<= (n*n)){
        String[][] array = new String[n][n];
        board(n, m, array);
        printgame(n, array);
        break;
        }
        break;
        }
    }
    
    public static void board (int x, int y, String[][] array){
        int num = 0;
        for (int i=0; i<x; i++){
            for (int j=0; j<x; j++){
                array[i][j] = "0";
            }
        }
        
        while (num < y){
            int i = (int)(Math.random()*x);
            int j = (int)(Math.random()*x);
            if (array[i][j] != "M"){
                array[i][j] = "M";
                num++;
            }
        }
        
        for (int i=0; i<x; i++){
            for (int j=0; j<x; j++){
                if (array[i][j] == "M"){
                    try{
                    boardnew(array, i-1, j-1);
                    } catch(Exception e){}
                    try{
                    boardnew(array, i-1, j);
                    } catch(Exception e){}
                    try{
                    boardnew(array, i-1, j+1);
                    } catch(Exception e){}
                    try{
                    boardnew(array, i, j-1);
                    } catch(Exception e){}
                    try{
                    boardnew(array, i, j+1);
                    } catch(Exception e){}
                    try{
                    boardnew(array, i+1, j-1);
                    } catch(Exception e){}
                    try{
                    boardnew(array, i+1, j);
                    } catch(Exception e){}
                    try{
                    boardnew(array, i+1, j+1);
                    } catch(Exception e){}
                }
            }
        }
    }
    
    public static void boardnew(String[][] array, int i, int j){
        switch (array[i][j]){
            case "0":
                array[i][j] = "1";
                break;
            case "1":
                array[i][j] = "2";
                break;
            case "2":
                array[i][j] = "3";
                break;
            case "3":
                array[i][j] = "4";
                break;
            case "4":
                array[i][j] = "5";
                break;
            case "5":
                array[i][j] = "6";
                break;
            case "6":
                array[i][j] = "7";
                break;
            case "7":
                array[i][j] = "8";
                break;    
            default:
                break;
        }
    }
    
    public static void printgame (int x, String[][] array){
        for (int i=0; i<x; i++){
            for (int j=0; j<x; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}