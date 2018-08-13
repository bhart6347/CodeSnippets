package javaprojects;
//Branden Hart 7/26/18
public class StaticMathVariablesAndMethodsExample1 {
/*Static methods can be used within a class without instantiating an object.
    Example: double d = Math.random();
    */
    public static void main(String[] args) {
       System.out.println("Random: "+ Math.random() * 10);
       System.out.println("Square root: " + Math.sqrt(16.0));
       System.out.println("Rounded random: " + Math.random() * 100);
       System.out.println("Abs: " + Math.abs(-11));
       
    }
    
}
