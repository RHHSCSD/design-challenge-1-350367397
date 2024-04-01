/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.Scanner;
import java.util.Random;
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
        String petName="";
        String vowelLetter="";
        String consonantLetter="";
        
   //Write Pseudocode FIRST as comments and THEN write the code
    
  //CONSTANTS

  //VARIABLES

  //CODE
        Scanner keyboard=new Scanner(System.in);
        System.out.println("              ___.                               __   ");
        System.out.println("  ____ ___.__.\\_ |__   _________________   _____/  |_ ");
        System.out.println("_/ ___<   |  | | __ \\_/ __ \\_  __ \\____ \\_/ __ \\   __\\");
        System.out.println("\\  \\___\\___  | | \\_\\ \\  ___/|  | \\/  |_> >  ___/|  |  ");
        System.out.println(" \\___  > ____| |___  /\\___  >__|  |   __/ \\___  >__|  ");
        System.out.println("     \\/\\/          \\/     \\/      |__|        \\/      ");
        System.out.println("Welcome to the Cyberpet!Please Enter your option(with number)");
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
        String k=keyboard.nextLine();
        System.out.println("Please enter the username.");
        String username=keyboard.nextLine();
        System.out.println("Please enter the password.");
        String password=keyboard.nextLine();
        username=username.toLowerCase();
        password=password.toLowerCase();
        
        if (username.equals("snoopy")==false || password.equals("toto")==false){
            System.out.println("Incorrect username or password!.");
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
        System.out.println("option 1:name your own pet!");
        System.out.println("option 2:generate a random pet name");
        System.out.println("enter your option by enter the option number:");
        int nameOption=keyboard.nextInt();
        if(nameOption==1){
            System.out.println("Enter the pet's name");
            petName=keyboard.nextLine();
        }
        else if(nameOption==2){
            int vowel=97;
            Random random=new Random();
            while(vowel==97 || vowel ==101 || vowel==105 || vowel==111 || vowel ==117){
            vowel=random.nextInt(97,123);
            char vowelLet=(char)vowel;
            vowelLetter=String.valueOf(vowelLet);
            System.out.println(vowelLetter);
            int consonant=98;
            while(consonant!=97 && consonant !=101 && consonant!=105 && consonant!=111 && consonant !=117){
            vowel=random.nextInt(97,118);
            char consonantLet=(char)consonant;
            consonantLetter=String.valueOf(consonantLet);
            if(random.nextInt()%2==0){
                petName=vowelLetter+consonantLetter+vowelLetter+consonantLetter;
            }
        System.out.println(petName);
        
        }
        
        
        
        
            }
    }
        }   
}
