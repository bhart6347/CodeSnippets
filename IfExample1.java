package javaprojects;

public class IfExample1 {
    
    public static void main(String[] args) {       
  //the boolean gameover can be changed between *false and true* trigger a 
  //different response in the 'if' statement. 
        boolean gameover = false;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        
        if (gameover){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        } else {
            System.out.println("You did not achieve the minimum score to qualify");
        }
    }
    
}

    

