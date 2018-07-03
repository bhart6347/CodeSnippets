/*Branden Hart
10/26/17 @5:30pm
*/
package greatestnumber;
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class GreatestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereimport java.util.Scanner;    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = s.nextInt();
        System.out.print("Enter Y: ");
        int y = s.nextInt();
        System.out.print("Enter Z: ");
        int z = s.nextInt();
        
        if (x>y && x>z){
            System.out.print("X is Greater");
        }
        
        else if(y>x && y>z){
            System.out.print("Y is Greater");
        }
        
        else if(z>x && z>y){
            System.out.print("Z is Greater");
        }
    }
}
    
    

