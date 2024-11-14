/*Ingrese fecha de nacimiento


 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int diaNacimiento;
        int mesNacimiento;
        int yearNacimiento;
        
        System.out.println("Ingrese su dia de Nacimiento");
         diaNacimiento = entrada.nextInt();
        
         System.out.println("Ingrese su mes de Nacimiento");
        mesNacimiento = entrada.nextInt();
        
        System.out.println("Ingrese su año de Nacimiento");
        yearNacimiento = entrada.nextInt();

        String mescadena = "";
        
        switch(mesNacimiento){
            case 1:
                mescadena = "enero";
                break;
            case 2:
                mescadena = "febrero";
                break;
            case 3:
                mescadena = "marzo";
                break;
            case 4:
                mescadena = "abril";
                break;
            case 5:
                mescadena = "mayo";
                break;   
            case 6:
                mescadena = "junio";
                break;
            case 7:
                mescadena = "julio";
                break;
            case 8:
                mescadena = "agosto";
                break;
            case 9:
                mescadena = "septiembre";
                break;
            case 10:
                mescadena = "octubre";
                break;
            case 11:
                mescadena = "noviembre";
                break;
            case 12:
                mescadena = "diciembre";
                break;
                default:
                System.out.println("Opción incorrecta");
                break;
                
                        
        }
            System.out.printf("Usted ha nacido el %d de %s de %d",
                        diaNacimiento, mescadena, yearNacimiento);
        }

    }

