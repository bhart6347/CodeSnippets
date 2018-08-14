
package javaprojects.simpleScannerName;


public class Name {
        
        private String yourName;
        
        public void setName(String x){
            yourName = x; //taking the parameter "x" and assigning to the object's private name property
        }

        public String getName(){
             return yourName;
           }
        public void nameMessage(){
            System.out.printf("Your name is: %s\n", getName());
        }
    
}
