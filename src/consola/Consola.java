/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese su nombre");
        String nombre=sc.nextLine();
        sc.close();
        
        System.out.println("Bienvenido usuario"+nombre+"!!");
        
    }
    
}
