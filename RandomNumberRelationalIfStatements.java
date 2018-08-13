//Branden 8/13/2018
package javaprojects;

/**
 *
 * @author brand
 */
public class RandomNumberRelationalIfStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 50);
        
        /*
        Relational Operators
        # Java has 6 relational operators
        # > Greater Than
        # < Less Than
        # == Equal To
        # != Not Equal To
        # >= Greater Than Or Equal To
        # <= Less Than Or Equal To
        
        */
        
        if(randomNumber < 25)
        {
            System.out.println("The random number is less than 25");
        }
        else if(randomNumber > 40){
             System.out.println("The random number is greater than 40");
        }
        else if(randomNumber == 18){
            System.out.println("The random number is equal to 18");
        }
        else if(randomNumber != 40){
            System.out.println("The random number is not equal to 40");
        }
        
        System.out.println("The random number is " + randomNumber);
    }
    
}
