/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku.GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import sudoku.Sudoku;

/**
 *
 * @author Abejith
 */
public class SudokuGUI 
{
     private JFrame SudokuFrame;
     private JFrame SudokuFrame1;
     private JLabel SudokuLabel;
     private JLabel status;
     private JPanel controlPanel;
     private JLabel msglabel;
     public JPanel panel;
     private JButton solve;
     private JButton gen;
    

    public SudokuGUI(int a[][],int b[][])
    {
            SudokuFrame = new JFrame("Sudoku Generator");
            SudokuFrame1 = new JFrame("Solution");
            SudokuFrame.setSize(1000,1000);
            gen=new JButton("Generate new Sudoku");
            solve=new JButton("Solution");
            SudokuFrame.setLayout(new GridLayout(3, 1));
            SudokuLabel = new JLabel("",JLabel.CENTER );
            status = new JLabel("status",JLabel.CENTER);        
            status.setSize(350,100);
        
            SudokuFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      SudokuFrame.add(SudokuLabel);
      SudokuFrame.add(controlPanel);
      JPanel bp=new JPanel(new FlowLayout());
       solve.setPreferredSize(new Dimension(100, 100));
       gen.setPreferredSize(new Dimension(300, 100));
       solve.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                Sudoku s=new Sudoku();          
                printSolution(b);
            }
        });  
       gen.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                SudokuFrame.hide();
                Sudoku s=new Sudoku();
                s.generateSudoku();
                
            }
        });  
       
      bp.add(solve);
      bp.add(gen);
      SudokuFrame.add(bp);
      SudokuFrame.setVisible(true);  
      SudokuLabel.setText("Sudoku Generator and Solver");
      panel= new JPanel();
      panel.setBackground(Color.YELLOW);
      panel.setSize(1000,1000);
      GridLayout layout = new GridLayout(9,9);
      layout.setHgap(15);
      layout.setVgap(5);
      panel.setLayout(layout);        
      panel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
      Font font = new Font("Arial", Font.PLAIN, 20);
     
      //panel.set
      for(int i=0;i<9;i++)
          for(int j=0;j<9;j++)
      {
         JLabel l= new JLabel(" "+a[i][j]+" ");
          l.setFont(font);
          l.setBorder(BorderFactory.createLineBorder(Color.BLACK));
          if(a[i][j]==0)
                  {
                      l.setText(" - ");
                       l.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                      panel.add(l);            
                      continue;
                  }
           panel.add(l);
      }
      controlPanel.add(panel);
      SudokuFrame.setVisible(true);  
        
        
    }
    
    public void printSolution(int a[][])
    {
       
            
            SudokuFrame1= new JFrame("Sudoku Solution");
            SudokuFrame1.setSize(500,350);
            controlPanel = new JPanel();
            controlPanel.setLayout(new FlowLayout());
            SudokuFrame1.add(controlPanel);
            panel= new JPanel();
            panel.setBackground(Color.YELLOW);
            panel.setSize(1000,1000);
            GridLayout layout = new GridLayout(9,9);
            layout.setHgap(15);
            layout.setVgap(5);
            panel.setLayout(layout);        
            panel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
            Font font = new Font("Arial", Font.PLAIN, 20);
            for(int i=0;i<9;i++)
                for(int j=0;j<9;j++)
            {
               JLabel l= new JLabel(" "+a[i][j]+" ");
                l.setFont(font);
                l.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                if(a[i][j]==0)
                        {
                            l.setText(" - ");
                             l.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                            panel.add(l);            
                            continue;
                        }
                 panel.add(l);
            }
            controlPanel.add(panel);
            SudokuFrame1.setVisible(true);  
            
        
        
        
    }
    
 
    
}
