//Branden Hart 8/14/2018
package javaprojects.simpleScannerName;

import java.util.Scanner;
public class Main {
//A simple "what is your name" program that uses a getter and setter method 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("What is your name?");
       String tempName = sc.nextLine();
       Name user = new Name();
       user.setName(tempName);
       user.nameMessage();
    }
    
}
