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
    int gridsol3[][]=new int[9][9];
   
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
  int gridsol2[][]={{3, 1, 6, 5, 7, 8, 4, 9, 2},
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
    /**
     * @param args the command line arguments
     * 
     * 
     */
 public Sudoku()
 {
      r=new Random();
     
 }
    public static void main(String[] args) {
        // TODO code application logic here
         
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
                System.out.print(gridsol3[i][j]);
          }
           System.out.println(" ");
           }
        sg=new SudokuGUI(gridsol3,true);
        
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
        return true;
      
        }
        //printcurrentstate();
        for (int i= 1; i<= 9; i++)
    {
        if (check(i))
        {
              System.out.println("row: "+row+" column:"+col+"num:"+i);
            gridsol[row][col] = i;
            if (solveSudoku())
                return true;
            gridsol[row][col] = 0;
            System.out.println("removed"+i);
        }
    }
    return false;
       
    }
    
    
    public boolean check(int candidate)
    {
        System.out.println("checking "+candidate);
        for (int c = 0; c < 9; c++)
        if (gridsol[row][c] == candidate)
            return false;
         
          for (int r = 0; r < 9; r++)
        if (gridsol[r][col] ==candidate)
            return false;
          
          for (int r = 0; r < 3; r++)
        for (int c= 0; c < 3; c++)
            if (gridsol[r+(row - row%3 )][c+(col - col%3)] ==candidate)
                return false;

          return true;
    }
    public boolean notfilled()
    {
        
        for (row = 0; row < 9; row++)
        for (col = 0; col < 9; col++)
            if (gridsol[row][col] == 0)
            { //row and column are set
                  System.out.println("not filled at "+row+" "+col);
                return true;
              
            }
        return false;
    }
    
    
    public void printcurrentstate()
    {   
         sg=new SudokuGUI(gridsol,true);
    }
    */
    
    public void generateSudoku()
    {
         int randomNum = randomize();
     
         for(int j=0;j<=randomNum;j++)
         {    swaphori();
             swapverti();
         }
      
          for(int i=0; i<9; i++)
          for(int j=0; j<9; j++)
            {
                    gridsol3[i][j]=gridsol2[i][j];
            }
          
         for(int j=0;j<41;j++)
         {
             int r1=randomize();
             int r2=randomize();
             if(gridsol2[r1][r2]==0)
             {
                 j--;
                 continue;
             }
             gridsol2[r1][r2]=0;
         }
        
        SudokuGUI sg=new SudokuGUI(gridsol2,gridsol3);
    }
    
    public void swaphori()
    {
        int rn1 = r.nextInt((8 - 1) + 1) +1;
        int rn2 = r.nextInt((8 - 1) + 1) +1;
        int temp[]=new int[9];
        for(int j=0;j<9;j++)
        {
            temp[j]=gridsol2[rn1][j];
            gridsol2[rn1][j]=gridsol2[rn2][j];
            gridsol2[rn2][j]=temp[j];       
        }  
    }
    
   public void swapverti()
    {
          int rn1 = r.nextInt((8 - 1) + 1) +1;
        int rn2 = r.nextInt((8- 1) + 1) +1;
        int temp[]=new int[9];
        for(int j=0;j<9;j++)
        {
            temp[j]=gridsol2[j][rn1];
            gridsol2[j][rn1]=gridsol2[j][rn2];
            gridsol2[j][rn2]=temp[j];       
        }
        
    }
   public int randomize()
   {
      return r.nextInt((8 - 1) + 1) +1;
       
       
   }
    
         
}
