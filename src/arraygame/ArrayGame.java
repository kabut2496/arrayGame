/*
 * Karl Butler
 * For Mr.Kaune
 * 30/10/2018
 */

package arraygame;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class ArrayGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner keyedInput = new Scanner (System.in);    
   
    // declaring variables
    int randNum,ans2,num;
    String ans,ans3;
    double play =1;
    
        play=1;
        //geting info for answer
    num=(int)Math.round(Math.random()*6+1-1);
    
    String[] names= new String [6];
    //seing if they want to play
        System.out.println("do you want to play a game pleas enter yes or no");
        ans3=keyedInput.next();
        switch(ans3){
            case ("Yes"):case("yes"):
                System.out.println("yaaaaaa");
                break;
            case("no"):case("No"):
                System.out.println("well you are going to play anyway");
                break;
    }
        //the loop
        do{
            
        System.out.println("Pleas enter the names of five friends");
        //geting infor 
        for(int i=0;i<=5;i=i+1){
          names[i]=keyedInput.nextLine();
      }
    randNum = (int)Math.round(Math.random()*6+1-1);
    //instructions
        System.out.println("Please enter a name and then a number and see if they mach try to mach the name and number");
    //getting the players guesses
        ans3=keyedInput.next();
        ans2=keyedInput.nextInt();
    //outputs
   if (randNum==4){
        if(ans3==names[0]&&ans2==num){
            System.out.println("you are corect");
        }else{
            System.out.println("you lose");
        }
    }
   if (randNum==6){
        if(ans3==names[1]&&ans2==num){
            System.out.println("you are corect");
        }else{
        System.out.println("you lose");
        }
    }
   if (randNum==1){
        if(ans3==names[2]&&ans2==num){
            System.out.println("you are corect");
        }else{
         System.out.println("you lose");
        }
    }
   if (randNum==2){
        if(ans3==names[3]&&ans2==num){
        System.out.println("you are corect");
        }
    }
   if (randNum==5){
         if(ans3==names[4]&&ans2==num){
            System.out.println("you are corect");
        }else{
        System.out.println("you lose");
        }
    }
   if (randNum==3){
         if(ans3==names[5]&&ans2==num){
            System.out.println("you are corect");
        }else{
        System.out.println("you lose");
        }
    }
   System.out.println(randNum);
   System.out.println(num);
        System.out.println("press 1 to play again and 2 to quit");
        play=keyedInput.nextInt();
    }while(play!=2);
}
}