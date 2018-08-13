
package javaprojects;

//Branden Hart
//I will display an example of method overloading using an algorithmic 
//method that takes 3 different integer arguments
public class OverRidingExample1 {


  
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        System.out.println(sumOne(num1, num2));
        System.out.println(sumTwo(num1, num2, num3));
        
    }
    
    public static int sumOne(int x, int y){
        return x+y;
    }
    
    public static int sumTwo(int x, int y, int z){
        return x + y + z;
    }
    
    
    
}
