package javaprojects;
//Branden Hart 7/12/2018

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda_Expressions_Using_replaceAll_method {

    /*
    I will change the elements of a List of strings and use the Lambda expression
    to permanently change the names to all uppercase
     */
    public static void main(String[] args) {
        String [] names = {"Rick", "Shane", "Carl", "Carrol", "Darryl", "Negan", "Michonne", "Walker"};
        List<String> myList= new ArrayList(Arrays.asList(names));
        
        //Display all names in uppercase, however, the actual myList object is still the names as they were declared
        for(String s: myList){
            System.out.println(s.toUpperCase()+", ");
        }
        
        //This will display the myList object as the original initialized names with lowercase letters
        System.out.println("After the for-each loop: " + myList);
        
        myList.replaceAll(s -> s.toUpperCase());
        System.out.println("List.replaceAll Lambda: " + myList );
    }
    
}
