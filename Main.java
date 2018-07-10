
 
package FindTheFactorial;

public class Main {

    public static void main(String[] args) {
        
        factorial (5);
        
    }
    
    static void factorial(int x){
        int save = x;
        int fact = 1;
        
        do{
            fact *= x--;
        } while (x > 0);
                System.out.println("Factorial Value for : " + save + " is -> " + fact);
        
    }
    
}
