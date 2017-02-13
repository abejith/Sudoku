/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import java.util.Random;
import sudoku.GUI.SudokuGUI;


/**
 *
 * @author Abejith
 */
public class Sudoku {
    int row, col;
    Random r;
    SudokuGUI sg;
    int solutionSudoku[][]=new int[9][9];
   
    static int grid[][]= {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                      {5, 2, 0, 0, 0, 0, 0, 0, 0},
                      {0, 8, 7, 0, 0, 0, 0, 3, 1},
                      {0, 0, 3, 0, 1, 0, 0, 8, 0},
                      {9, 0, 0, 8, 6, 3, 0, 0, 5},
                      {0, 5, 0, 0, 9, 0, 6, 0, 0},
                      {1, 3, 0, 0, 0, 0, 2, 5, 0},
                      {0, 0, 0, 0, 0, 0, 0, 7, 4},
                      {0, 0, 5, 2, 0, 6, 3, 0, 0}};
  static int gridsolorg[][]={{3, 1, 6, 5, 7, 8, 4, 9, 2},
                { 5 ,2, 9, 1 ,3, 4 ,7 ,6 ,8},
                {4 ,8, 7, 6, 2, 9, 5, 3, 1},
                {2, 6 ,3 ,4 ,1, 5 ,9 ,8 ,7},
                { 9, 7, 4, 8 ,6 ,3 ,1 ,2, 5},
                {8 ,5 ,1 ,7, 9 ,2, 6 ,4 ,3},
                {1 ,3, 8, 9, 4, 7, 2, 5, 6},
                {6 ,9, 2, 3 ,5 ,1 ,8 ,7 ,4},
                {7 ,4 ,5, 2, 8, 6, 3, 1, 9}};
  int questionSudoku[][]={{3, 1, 6, 5, 7, 8, 4, 9, 2},
                { 5 ,2, 9, 1 ,3, 4 ,7 ,6 ,8},
                {4 ,8, 7, 6, 2, 9, 5, 3, 1},
                {2, 6 ,3 ,4 ,1, 5 ,9 ,8 ,7},
                { 9, 7, 4, 8 ,6 ,3 ,1 ,2, 5},
                {8 ,5 ,1 ,7, 9 ,2, 6 ,4 ,3},
                {1 ,3, 8, 9, 4, 7, 2, 5, 6},
                {6 ,9, 2, 3 ,5 ,1 ,8 ,7 ,4},
                {7 ,4 ,5, 2, 8, 6, 3, 1, 9}};
 int gridsol[][]= {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                      {5, 2, 0, 0, 0, 0, 0, 0, 0},
                      {0, 8, 7, 0, 0, 0, 0, 3, 1},
                      {0, 0, 3, 0, 1, 0, 0, 8, 0},
                      {9, 0, 0, 8, 6, 3, 0, 0, 5},
                      {0, 5, 0, 0, 9, 0, 6, 0, 0},
                      {1, 3, 0, 0, 0, 0, 2, 5, 0},
                      {0, 0, 0, 0, 0, 0, 0, 7, 4},
                      {0, 0, 5, 2, 0, 6, 3, 0, 0}};
  
 public Sudoku()
 {
      r=new Random();
     
 }
    public static void main(String[] args) {         
        //default sudoku
        //SudokuGUI sg=new SudokuGUI(grid,gridsolorg);
        Sudoku s=new Sudoku();
        s.generateSudoku();
    }

     /*   
    public void solve() 
    {
         for(int i=0; i<9; i++)
           {
          for(int j=0; j<9; j++)
          {
                System.out.print(solutionSudoku[i][j]);
          }
           System.out.println(" ");
           }
        sg=new SudokuGUI(solutionSudoku,true);
        
        //backtracking+recursion
    if(solveSudoku())
        sg=new SudokuGUI(gridsol,true);
        else
        {
            System.out.println("No solution");
        }
       
    } */
    /*
    public boolean solveSudoku() 
    {
      
        //check for cells that have not been solved yet
        if(!notfilled())
        {
              System.out.println("complete---------------------------------------------------------------");
        returandomNumber true;
      
        }
        //printcurrentstate();
        for (int i= 1; i<= 9; i++)
    {
        if (check(i))
        {
              System.out.println("row: "+row+" column:"+col+"num:"+i);
            gridsol[row][col] = i;
            if (solveSudoku())
                returandomNumber true;
            gridsol[row][col] = 0;
            System.out.println("removed"+i);
        }
    }
    returandomNumber false;
       
    }
    
    
    public boolean check(int candidate)
    {
        System.out.println("checking "+candidate);
        for (int c = 0; c < 9; c++)
        if (gridsol[row][c] == candidate)
            returandomNumber false;
         
          for (int r = 0; r < 9; r++)
        if (gridsol[r][col] ==candidate)
            returandomNumber false;
          
          for (int r = 0; r < 3; r++)
        for (int c= 0; c < 3; c++)
            if (gridsol[r+(row - row%3 )][c+(col - col%3)] ==candidate)
                returandomNumber false;

          returandomNumber true;
    }
    public boolean notfilled()
    {
        
        for (row = 0; row < 9; row++)
        for (col = 0; col < 9; col++)
            if (gridsol[row][col] == 0)
            { //row and column are set
                  System.out.println("not filled at "+row+" "+col);
                returandomNumber true;
              
            }
        returandomNumber false;
    }
    
    
    public void printcurrentstate()
    {   
         sg=new SudokuGUI(gridsol,true);
    }
    */
    
    public void generateSudoku()
    {
         int randomNum = randomize();
     
     	 //Generate random Sudoku
         for(int j=0;j<=randomNum;j++)
         {   
         	 swapHorizontally();
             swapVertically();
         }
      
          for(int i=0; i<9; i++)
	          for(int j=0; j<9; j++)
		          {
		          	//Store solution before creating question
		                    solutionSudoku[i][j]=questionSudoku[i][j];
		          }
         //Create Question from generated sudoku
		 createQuestion();
         //Launch GUI
         SudokuGUI sg=new SudokuGUI(questionSudoku,solutionSudoku);
    }
    
    public void createQuestion()
    {
    	for(int j=0;j<41;j++) //To create 41 empty spots in sudoku
         {
             int row=randomize(); //Generate a random row
             int column=randomize(); //Generate a random column
             //If the random selected spot is already a empty spot,
             // pick another random spot and step back in the loop once
             
             if(questionSudoku[row][column]==0) 
             {
                 j--;
                 continue;
             }
             questionSudoku[row][column]=0; //create an empty spot
         }
    }

    //Swap 2 rows in the sudoku
    public void swapHorizontally()
    {
        int randomNumber1 = randomize();
        int randomNumber2 = randomize();
        int temp[]=new int[9];
        for(int j=0;j<9;j++)
        {
            temp[j]=questionSudoku[randomNumber1][j];
            questionSudoku[randomNumber1][j]=questionSudoku[randomNumber2][j];
            questionSudoku[randomNumber2][j]=temp[j];       
        }  
    }

    //Swap 2 columns in the sudoku
    public void swapVertically()
    {
        int randomNumber1 = randomize();
        int randomNumber2 = randomize();
        int temp[]=new int[9];
        for(int j=0;j<9;j++)
        {
            temp[j]=questionSudoku[j][randomNumber1];
            questionSudoku[j][randomNumber1]=questionSudoku[j][randomNumber2];
            questionSudoku[j][randomNumber2]=temp[j];       
        } 
    }

   public int randomize()
   {
      return r.nextInt((8 - 0) + 1) +0;
   }
    
}
