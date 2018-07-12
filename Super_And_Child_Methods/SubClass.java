/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super_And_Child_Methods;

/**
 *
 * @author brand
 */
public class SubClass extends SuperClass{
    public void printMethod(){
        super.printMethod();
        System.out.println("Printed in the SubClass aka Child Class");
    }
}
