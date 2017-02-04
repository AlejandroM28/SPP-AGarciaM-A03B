/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agarciam.a03b;

import java.util.Scanner;

/**
 *
 * @author alejandromonroy
 */
public class SPPAGarciaMA03B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           double r,a,pi;
    Scanner kb= new Scanner (System.in);
    pi= 3.1416;
        System.out.println("Dame el valor de radio");
        r= kb.nextDouble ();
        a= pi*(Math.pow(r,2));
        System.out.println("El área del circulo es: "+a);
    }
    
}
