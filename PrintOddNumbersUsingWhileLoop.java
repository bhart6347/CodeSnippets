//Branden 8/13/2018
package javaprojects;

public class PrintOddNumbersUsingWhileLoop {

    public static void main(String[] args) {
        int i = 0; //declaring and initialize a 'counter' variable for our While loop
        
        while(i<=20){
            if(i == 3){
                i+=2;
                continue; //This continue keyword denotes to bypass executing the implementation this iteration
            }
            System.out.println(i);
            i++;
            
            if(i%2==0){ //Modulus arithmetic expression checks if current number is even by dividing it by 2
                i++; //If result is 0, meaning the number was even, the post-increment variable adds 1 to make it odd
                     //Notice this If loop is neted within the While loop
            }
        }
    }
    
}
