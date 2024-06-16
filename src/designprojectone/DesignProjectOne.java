/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.Scanner;
import java.util.Random;
import java.lang.Exception;
import java.io.*;
public class DesignProjectOne {
    static String username;
        //the old login with toto & snoopy which is not used anymore
    public static void login(){
        Scanner keyboard=new Scanner(System.in);
        
        //set up variables
        int logTries=0;
        username="";
        String password="";
        
        //use a while loop so it get to repeat even the user failed their first tries
        while((username.equals("snoopy")==false || password.equals("toto")==false) && logTries<3){
            
        //get inputs
            System.out.println("Please enter the username:");
            username=keyboard.nextLine();
            System.out.println("Please enter the password:");
            password=keyboard.nextLine();
            
            //set to lowercase so uppercase wont be a problem
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
    }
    
    //the new login method
    public static String[] login2(){
        
        //first ask user for input
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter username:");
        username=keyboard.nextLine();
        
        //create a file or read the old file
        File f = new File(username+".txt");
        
        //if theres no such file then it means its a new user
        if (!f.exists()){
            try{
                //set up printwriter
                PrintWriter pw=new PrintWriter(f);
                
                //ask user to setup the password
                System.out.println("Set up your password:");
                String password=keyboard.nextLine();
                System.out.println(username);
                System.out.println(password);
                
                //add them to the file
                pw.println(username);
                pw.println(password);
                pw.close();
                
                //return a string for futher checiing later(it should not display the generating part again if the user already created one before)
                String[] loginOutcome={username,"1"};
                return loginOutcome;
            }
            catch(IOException e){
                System.out.println("an error has occured");
                String[] loginOutcome={"3","3"};
                return loginOutcome;
            }
            
        }
        else{
            try{
                //or the user has created a file before
                int triesUsed=0;
                Scanner s=new Scanner(f);
                
                //check for password if the user have enough tries
                s.nextLine();
                String password=(s.nextLine());
                for (int i=2;i!=-1;i--){
                    System.out.println("Enter your password");
                    String passwordInput=keyboard.nextLine();
                    
                    //only allow them enter if they enter password correctly
                    if(passwordInput.equals(password)==true){
                        
                        //return 2 for checking later
                        System.out.println("Access granted!");
                        String[] loginOutcome={username,"2"};
                        return loginOutcome;
                    }
                    else{
                        System.out.println("wrong pass word!"+i+" tries left");
                        triesUsed++;
                        
                    }
                        if (triesUsed==3){
                        System.out.println("are you a hacker?");
                        System.exit(1);
                        
                    }
                }
                
                        
            }
            catch(IOException e){
                System.out.println("an error has occured");
                
                
            }
            String[] loginOutcome={"3","3"};
                return loginOutcome;
        }
        
    }
    
    //generate method 
    public static int[] generate(String username){
        //set up variables
        String vowelLetter="";
        String consonantLetter="";
        String petName="";
        Random random=new Random();
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Welcome!");
        String confirmation="2";
        int petChoice=0;
        while(confirmation.equals("2")|| confirmation.equals("no") ){
            //first ask user for their inputs
            System.out.println("Pick from two pet options!(enter the option number)");
            System.out.println("1)a dog");
            System.out.println("2)a cat");
            petChoice=keyboard.nextInt();
            System.out.println("do you confirm?(Enter the number)");
            System.out.println("1)Yes");
            System.out.println("2)No");
            keyboard.nextLine();
            confirmation=keyboard.nextLine();
            confirmation=confirmation.toLowerCase();
            }
        //display the pet
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
            
            //ask for name setups
            System.out.println("Your pet has spawned!");
            System.out.println("option 1:name your own pet!");
            System.out.println("option 2:generate a random pet name");
            System.out.println("enter your option by enter the option number:");
            int nameOption=keyboard.nextInt();
            keyboard.nextLine();
        
            //if the user want to set up the name themselves, just set the input to its name
            if(nameOption==1){
                System.out.println("Enter the pet's name");
                petName=keyboard.nextLine();
            
            }
            
            //if the user wants to generate
            else if(nameOption==2){
                int vowel=97;
                
                //generate the vowel by looping through ascii code ferom 97 yo 117 "a" and "u", and stop once it find one
                while(vowel==97 || vowel ==101 || vowel==105 || vowel==111 || vowel ==117){
                    vowel=random.nextInt(97,123);}
                char vowelLet=(char)vowel;
                vowelLetter=String.valueOf(vowelLet);
                
                //generate the consonant with the same idea
                int consonant=98;
                while(consonant!=97 && consonant !=101 && consonant!=105 && consonant!=111 && consonant !=117){
                    consonant=random.nextInt(97,118);
                
            }
                //convert asciicode to letters
                char consonantLet=(char)consonant;
                consonantLetter=String.valueOf(consonantLet);
                
                //decide if we want an extra vowel or not
                if(random.nextInt(0,2)%2==0){
                    petName=vowelLetter+consonantLetter+vowelLetter+consonantLetter;
            }
                else{
                    petName=vowelLetter+consonantLetter+consonantLetter+vowelLetter+consonantLetter+consonantLetter;
            }   
        }
            //output spawn message
            System.out.println("your pet, " +petName+" has spawned!");
            
            //randomly distributing the stats, and make sure there is atleast one for each
            int maxHealth=1;
            int maxFood=1;
            int maxEnergy=1;
            int startingPoint=18;
            maxHealth=maxHealth+random.nextInt(0,startingPoint);
            startingPoint=20-maxHealth-1;
            maxEnergy=maxEnergy+random.nextInt(0,startingPoint);
            maxFood=20-maxEnergy-maxHealth;
            System.out.println("Your pet's MAXENERGY="+maxEnergy+",MAXFOOD="+maxFood+",MAXHEALTH="+maxHealth);
            int[] cry={maxEnergy,maxFood,maxHealth,maxEnergy,maxFood,maxHealth};
            
            try{
                final boolean Append=true;
                
                FileWriter glossary=new FileWriter(username+"txt");
                PrintWriter output=new PrintWriter(glossary);
                output.println(petName);
                if (petChoice==1){
                    
                    output.println("dog");
                    output.println("  __      _");
                    output.println("o'')}____//");
                    output.println("`_/      )");
                    output.println(" (_(_/-(_/");
                }
                else{
                    output.println("    |\\__/,|   (`\\");
                    output.println("  _.|o o  |_   ) )");
                    output.println("-(((---(((--------");
                }
                for(int d=0;d<6;d++){
                    output.println(cry[d]);
                }
                output.close();
            }
            catch(IOException e){
                System.out.println("an error has occured");
            }
            return cry;
    }
    public static int numberGuess(){
        Scanner keyboard=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Welcome to the number guessing game!Guess the number between 1-100 to earn tokens!");
        //set up cariables
                int tokenEarned=50;
                int answer=random.nextInt(0,101);
                int playerGuess=0;
                int triesLeft=10;
                
                //only allow them to guess if they take 10 or less guesses
                while(playerGuess!=answer && triesLeft>0){
                    System.out.println("Enter your guess:");
                    playerGuess=keyboard.nextInt();
                    
                    //there area only 3 cases, greater, smaller or equal to
                    if (playerGuess>answer){
                        //player gain 5 less token for each wrong guss
                        tokenEarned-=5;
                        triesLeft-=1;      
                        System.out.println("Your Guess is too big!"+triesLeft+" tries left");}
                    else if (playerGuess<answer){
                        tokenEarned-=5;
                        triesLeft-=1;      
                        System.out.println("Your Guess is too small!"+triesLeft+" tries left");}
                    else{
                        System.out.println("You got it!");
                    }}
                
                //display the message
                System.out.println("Game over! You earned "+tokenEarned+" tokens");
        return tokenEarned;
    }
    
    //a lettter guessing game
    public static int letterGuess(){
        Scanner keyboard=new Scanner(System.in);
        Random random=new Random();
        String key="";
                char generated='p';
                //first generate 5 letters
                for(int i=0;i<10;i++){
                    generated=(char)random.nextInt(97,123);
                    //if its not generated yet, then add to the list
                    if(key.indexOf(generated)==-1){
                        //you want two of them so you add the letter to a random postion twice
                        for(int j=0;j<2;j++){
                            int position=random.nextInt(0,key.length()+1);
                            key=key.substring(0,position)+generated+key.substring(position,key.length());
                        }  
                }
                    //otherwise redo it
                    else{
                        i--;
                    }
                }
                keyboard.nextLine();
                System.out.println(key);
                String userGuess="xxxxxxxxxxxxxxxxxxxx1";
                
                //the user is going to input the position
                System.out.println("There are 10 pair of letters! enter 2 indexes to see if they match!");
                while(userGuess.equals(key)==false){
                    int guess1=keyboard.nextInt();
                    int guess2=keyboard.nextInt();
                    int guessNum=0;
                    guessNum++;
                    
                    //if it equals. then reveal the two letters
                    if(key.charAt(guess1)==key.charAt(guess2)){
                        System.out.println("Great move! Used Tries:"+guessNum);
                        userGuess=userGuess.substring(0,Math.min(guess1, guess2))+key.charAt(Math.min(guess1, guess2))+userGuess.substring(Math.min(guess1, guess2)+1,Math.max(guess1, guess2))+key.charAt(Math.max(guess1, guess2))+userGuess.substring(guess2+1,21);
                        
                    }
                    else{
                        System.out.println("You are wrong!Used Tries:"+guessNum);
                    }
                    System.out.println(userGuess.substring(0,20));
            }
            System.out.println("I've never thought of someone will actually finish the game,here's ur prize...");
            return 50;
    }
    public static int[] interact(int[] input,int token){
        //interact section
        System.out.println("Spend money to help your pet recover!");
        System.out.println("1)Playing with your pet");
        System.out.println("2)Feeding your pet");
        System.out.println("3)Grooming your pet");
        System.out.println("Each action costs $20 each, enter the option number");
        Scanner keyboard=new Scanner(System.in);
        
        //ask for user input
        int interactOption=keyboard.nextInt();
        keyboard.nextLine();
        
        //all operations are literally the same, its just adding different variables
        if(token>=20){
            if(interactOption==1){
                System.out.println("your pet's energy has restored!");
                System.out.println("Current energy:"+input[0]+"Current Food:"+input[4]+"Current Health:"+input[5]);
                token=token-20;
                int[] cry={input[0],input[1],input[2],input[0],input[4],input[5],token};
                
                return cry;}
            else if(interactOption==2){
                System.out.println("your pet's Food has restored!");
                System.out.println("Current energy:"+input[3]+"Current Food:"+input[1]+"Current Health:"+input[5]);
                token=token-20;
                int[] cry={input[0],input[1],input[2],input[3],input[1],input[5],token};
                return cry;}
            else if(interactOption==3){
                System.out.println("your pet's Health has restored!");
                System.out.println("Current energy:"+input[3]+"Current Food:"+input[4]+"Current Health:"+input[2]);
                token=token-20;
                int[] cry={input[0],input[1],input[2],input[3],input[4],input[2],token};
                return cry;
            }
}
        
        else{
           System.out.println("You don't have enough tokens!");
           int[] cry={input[0],input[1],input[2],input[3],input[4],input[5],token};
           return cry;
        }
        
    
    
        int[] cry={input[0],input[1],input[2],input[3],input[4],input[2],token};
                return cry;
    }
    public static void main(String[] args) {
        //set up variables
        String placeholder="";
        Scanner keyboard=new Scanner(System.in);
        String userChoice="";
        Random random=new Random();
        int petStats[]=new int[7];
        int token=0;
        System.out.println("              ___.                               __   ");
        System.out.println("  ____ ___.__.\\_ |__   _________________   _____/  |_ ");
        System.out.println("_/ ___<   |  | | __ \\_/ __ \\_  __ \\____ \\_/ __ \\   __\\");
        System.out.println("\\  \\___\\___  | | \\_\\ \\  ___/|  | \\/  |_> >  ___/|  |  ");
        System.out.println(" \\___  > ____| |___  /\\___  >__|  |   __/ \\___  >__|  ");
        System.out.println("     \\/\\/          \\/     \\/      |__|        \\/      ");
        System.out.println("Welcome to the Cyberpet!");
        String[] loginResult=login2();
        String username=loginResult[0];
        
        //here is where we use the checker indicated in login2 method
        if(loginResult[1].equals("3")==true){
            System.exit(1);
        }
        if(loginResult[1].equals("1")==true){
            int menuChecker=1;
            
            //this make sure thet the user can enter information page as many times as they want
            while (menuChecker!=0){
            System.out.println(" 1.start");
            System.out.println(" 2.instruction");
            System.out.println(" 3.exit");


            userChoice=keyboard.nextLine();

            userChoice=userChoice.toLowerCase();
            
            //only stop when the user actuallt start
            if(userChoice.equals("1")||userChoice.equals("start")){
                petStats=generate(username);
                menuChecker=0;


            }
            else if(userChoice.equals("2")||userChoice.equals("instruction")){
                System.out.println("This is a pet simulator!,pick a cyber pet and play around with it!");
            }
            else if(userChoice.equals("3")||userChoice.equals("exit")){
                System.out.println("Goodbye!");
                System.exit(0);}

            else{
                System.out.println("Unknown operation, shutting down...");
                System.exit(0);
            }  
        }
    }
        //get pet stats in the file
        else{
            userChoice="1";
            File file=new File(username+".txt");
            try{
                Scanner tokenCheck=new Scanner(file);
                petStats[0]=tokenCheck.nextInt();
                petStats[1]=tokenCheck.nextInt();
                petStats[2]=tokenCheck.nextInt();
            }
            catch(Exception e){
                System.out.println("an error has occured");
            }
            
        }
        
        
        //after the gemerating is done, user enters the activity page
    while(userChoice.equals("1")||userChoice.equals("play")||userChoice.equals("2")||userChoice.equals("instruction")){
        
        System.out.println("1.play");
        System.out.println("2.instruction");
        System.out.println("3.exit");
        System.out.println("4.interact");
        System.out.println("You have "+token+" tokens in ur account!");
        userChoice=keyboard.nextLine();
        userChoice=userChoice.toLowerCase();
        if(userChoice.equals("1")||userChoice.equals("play")){
            System.out.println("1.number guessing");
            System.out.println("2.letter guessing");
            System.out.println("pick your game(in option number):");
            int gameOption=keyboard.nextInt();
            
            //run numberguessing method as the us
            if(gameOption==1 ||gameOption==2){
                
                token=token+numberGuess();
               // keyboard.nextLine();
            
         }
            else{
                System.out.println("bad input");
            }
        }
        //instruction button
        else if(userChoice.equals("2")||userChoice.equals("instruction")){
            System.out.println("This is a pet simulator!,pick a cyber pet and play around with it!");
            keyboard.nextLine();
        }
        //exit button
        else if(userChoice.equals("3")||userChoice.equals("exit")){
            System.out.println("Goodbye!");
            //add the stats into the file
            try{
                final boolean Append=true;
                FileWriter glossary=new FileWriter(username+"txt");
                PrintWriter output=new PrintWriter(glossary);
                for(int d=3;d<7;d++){
                    output.println(petStats[d]);
                }
                output.close();
            }
            catch(IOException e){
                System.out.println("an error has occured");
            }
           
            System.exit(0);}
        else if(userChoice.equals("4")||userChoice.equals("interact")){
            petStats=interact(petStats,token);
        }
        System.out.println(userChoice);
        System.out.println("You now have "+token+" tokens in ur account!");
        keyboard.nextLine();
        
    
    }
    
        
        
        
        
        
            
    
    }         
}