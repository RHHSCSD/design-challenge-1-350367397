/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.Scanner;
/***************************************************
*
*  Program:
*  Author:
*  Date: 
*  Description:
****************************************************/

/**************** IPO CHART ************************
*INPUT:
*
*
*PROCESSING:
*
*
*
*OUTPUT:
*
*
***************************************************/
  
/**************** TEST CASES ************************
*Test      Input      Desired Ouput
*
*
*
*
*
*
*
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   //Write Pseudocode FIRST as comments and THEN write the code
    
  //CONSTANTS

  //VARIABLES

  //CODE
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Welcome to the pet simulator!Please Enter your option(with number)");
        System.out.println(" 1.start");
        System.out.println(" 2.instruction");
        System.out.println(" 3.exit");
        int userChoice=keyboard.nextInt();
        switch(userChoice){
            case 1:
                System.out.println("Welcome!");
                break;
            case 2:
                System.out.println("This is a pet simulator!,pick a cyber pet and play aroung with it!");
                break;
            case 3:
                System.out.println("Goodbye!");
                System.exit(0);
             
           
                
        }
        System.out.println("Pick from two options!(enter the option number)");
        System.out.println("1)a dog");
        System.out.println("2)a cat");
        int petChoice=keyboard.nextInt();
        switch(petChoice){
            case 1:
                System.out.println("  __      _");
                System.out.println("o'')}____//");
                System.out.println("`_/      )");
                System.out.println(" (_(_/-(_/");
                break;
            case 2:
                System.out.println("    |\\__/,|   (`\\");
                System.out.println("  _.|o o  |_   ) )");
                System.out.println("-(((---(((--------");
                break;
                
                
        }
                    
        
        
    }
    
}
