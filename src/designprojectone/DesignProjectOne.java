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
        Random random=new Random();
        System.out.println("              ___.                               __   ");
        System.out.println("  ____ ___.__.\\_ |__   _________________   _____/  |_ ");
        System.out.println("_/ ___<   |  | | __ \\_/ __ \\_  __ \\____ \\_/ __ \\   __\\");
        System.out.println("\\  \\___\\___  | | \\_\\ \\  ___/|  | \\/  |_> >  ___/|  |  ");
        System.out.println(" \\___  > ____| |___  /\\___  >__|  |   __/ \\___  >__|  ");
        System.out.println("     \\/\\/          \\/     \\/      |__|        \\/      ");
        System.out.println("Welcome to the Cyberpet!");
        
        int logTries=0;
        String username="";
        String password="";
        
        while((username.equals("snoopy")==false || password.equals("toto")==false) && logTries<3){
        System.out.println("Please enter the username:");
        username=keyboard.nextLine();
        System.out.println("Please enter the password:");
        password=keyboard.nextLine();
        username=username.toLowerCase();
        password=password.toLowerCase();
        logTries++ ;
        if (username.equals("snoopy")==false || password.equals("toto")==false){
            System.out.println("wrong password!");
            System.out.println("Tries left:"+(3-logTries));
        }
        }
        if (username.equals("snoopy")==false || password.equals("toto")==false){
            System.out.println("Incorrect username or password! Access denied!");
            System.exit(0);
        
    }
        System.out.println("Access granted! Welcome, user snoopy");
        
        int menuChecker=1;
        while (menuChecker!=0){
        System.out.println(" 1.start");
        System.out.println(" 2.instruction");
        System.out.println(" 3.exit");
        String userChoice=keyboard.nextLine();
        userChoice=userChoice.toLowerCase();
        if(userChoice.equals("1")||userChoice.equals("start")){
            System.out.println("Welcome!");
            int confirmation=2;
            int petChoice=0;
            while(confirmation==2){
                System.out.println("Pick from two pet options!(enter the option number)");
                System.out.println("1)a dog");
                System.out.println("2)a cat");
                petChoice=keyboard.nextInt();
                System.out.println("do you confirm?(Enter the number)");
                System.out.println("1)Yes");
                System.out.println("2)No");
                confirmation=keyboard.nextInt();}
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
            System.out.println("Your pet has spawned!");
            System.out.println("option 1:name your own pet!");
            System.out.println("option 2:generate a random pet name");
            System.out.println("enter your option by enter the option number:");
            int nameOption=keyboard.nextInt();
            String placeholder=keyboard.nextLine();
        
            if(nameOption==1){
                System.out.println("Enter the pet's name");
                petName=keyboard.nextLine();
            
            }
            else if(nameOption==2){
                int vowel=97;
            
                while(vowel==97 || vowel ==101 || vowel==105 || vowel==111 || vowel ==117){
                    vowel=random.nextInt(97,123);}
                char vowelLet=(char)vowel;
                vowelLetter=String.valueOf(vowelLet);
            
                int consonant=98;
                while(consonant!=97 && consonant !=101 && consonant!=105 && consonant!=111 && consonant !=117){
                    consonant=random.nextInt(97,118);
                
            }
                char consonantLet=(char)consonant;
                consonantLetter=String.valueOf(consonantLet);
                if(random.nextInt(0,2)%2==0){
                    petName=vowelLetter+consonantLetter+vowelLetter+consonantLetter;
            }
                else{
                    petName=vowelLetter+consonantLetter+consonantLetter+vowelLetter+consonantLetter+consonantLetter;
            }   
        }
            System.out.println("your pet, " +petName+" has spawned!");
            int maxHealth=1;
            int maxFood=1;
            int maxEnergy=1;
            int startingPoint=18;
            maxHealth=maxHealth+random.nextInt(0,startingPoint);
            startingPoint=startingPoint-maxHealth-1;
            maxEnergy=maxHealth+random.nextInt(0,startingPoint);
            maxFood=20-maxEnergy-maxHealth;
            System.out.println("Your pet's MAXENERGY="+maxEnergy+",MAXFOOD="+maxFood+",MAXHEALTH="+maxHealth);
            menuChecker=0;
            
        }
        else if(userChoice.equals("2")||userChoice.equals("instruction")){
            System.out.println("This is a pet simulator!,pick a cyber pet and play aroung with it!");
        }
        else if(userChoice.equals("3")||userChoice.equals("exit")){
            System.out.println("Goodbye!");
            System.exit(0);}
        else{
            System.out.println("Unknown operation, shutting down...");
            System.exit(0);
       
        }}
        
        
        
        
        
        
            
    }
           
}
