package javaprojects;
//Branden Hart 7-1-18

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToList {

    public static void main(String[] args) {
       String [] days = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
       
       /*
       I am going to convert the days array into an ArrayList;
       Loop through the ArrayList, printing out the "sunday" element in uppercase using the toUpperCase();
       Print all other days in lowercase;
       Then, finally print out the ArrayList; 
       */
       
       ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
       
       //Using the for-each loop to iterate through the List
       for(String s: dayList){
           //checking to see if the current counter object is "sunday" using the '.equals()' method
           if(s.equals("sunday")){
               System.out.println(s.toUpperCase());
           }else System.out.println(s);
           }
       
       System.out.println(dayList);
       }
    }
    

