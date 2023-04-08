/*
2. Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.

 */
package encuentro7y8;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        
    Scanner leer=new Scanner(System.in);
    String nombre;
    int edad;
        do {
            System.out.println("Escriba su nombre");
            nombre=leer.nextLine();
            System.out.println("Escriba su edad");
            edad=leer.nextInt();
            leer.nextLine();
            System.out.println(nombre+" de "+edad+" años "+mayorMenor(edad));
            System.out.println("¿Quiere seguir ingresando personas?");
            nombre=leer.nextLine();
        } while (!(nombre.equalsIgnoreCase("NO")));
        
    
    }
    public static String mayorMenor (int edad)
    {
        String edadMayor;
        if (edad>=18) {
            edadMayor=" es mayor de edad";
        } else {
            edadMayor=" es menor de edad";
        }
        return edadMayor;
    }
}
