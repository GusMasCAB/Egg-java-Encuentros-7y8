/*
 Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package encuentro7y8;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);
        System.out.println("Escriba un número y le vamos a indicar si es un N° primo");
        num=leer.nextInt();
        
        System.out.println(num+" es un número primo? "+primo(num));
    }
    
    public static boolean primo(int num)
    {
        int k=0;  //Una variable para contar la cantidad de numeros divisibles
        boolean retorno;
        for (int i = 1; i <=num; i++) {
            if (num%i==0) {
              k=k+1;  
            } 
        }
        
        if (k==2) {
            retorno=true;
        } else {
            retorno=false;
        }
        return retorno;
    }
}
