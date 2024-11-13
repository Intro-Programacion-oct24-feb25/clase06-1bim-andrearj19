/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa"; //string es cadena
        ciudad = ciudad.toUpperCase();
        //ciudad.touppercase toma el valor independientemente de cada variable
        //lo hace todo mayuscula
   
        System.out.printf("%s\n", ciudad.toLowerCase()); //ciudad.touppercase toma 
                                                        //el valor independientemente 
                                                        //de cada variable
                                                        //lo hace todo minuscula
        // System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);
        // toLowerCase es un método
        // toUpperCase es un método
        
    }
}
