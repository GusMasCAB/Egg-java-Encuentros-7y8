/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
package encuentro7y8;

import java.util.Scanner;

public class Encuentro7y8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, letra;
        int longitud;
    
        do {
            System.out.println("Escriba una frase o palabra y finalice con un punto");
            frase=leer.nextLine();
            longitud= frase.length();
            letra=frase.substring(longitud-1);
            System.out.println(frase.substring(longitud-1));
        } while (!(letra.equals(".")));
        
        String frase2= codificacion(frase, longitud);
        System.out.println(frase);
        System.out.println(frase2);
    }
    public static String codificacion(String frase, int longitud){
        String frase2, letra;
        frase2="";
        for (int i = 0; i <= longitud-2; i++) {
            letra=frase.substring(i, i+1).toLowerCase();
            switch (letra) {
                case "a":
                    letra="@";    
                    break;
                case "e":
                    letra="#";
                    break;
                 case "i":
                    letra= "$";
                    break;
                case "o":
                    letra="%" ;
                    break;
                case "u":
                    letra="*";
                    break;
            }
            frase2=frase2+letra;
        }  
        return frase2;
    }    
}
