/*

ANA DIAZ con edad 19, es estudiante de UTPL

luis vera con edad 19, es estudiante de UNL

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre su nombre"); 
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.printf("Ingrese su edad");
        String edad = entrada.nextLine();
        System.out.printf("Ingrese a la universidad que pertenece");
        String universidad = entrada.nextLine();
        
        
        
        
        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
        // ANA DIAZ con edad 19, es estudiante de UTPL

        // luis vera con edad 19, es estudiante de UNL
           
        switch(valor){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        nombre.toUpperCase(),apellido.toUpperCase(),
                        "%sedad,%suniversidad");
                
                break;
            
            default:
                System.out.println("opción incorrecta; ninguna de las "
                        + "anteriores");
                break;
                
        }
        
    }
}//%d de %s de %d",
