/*
 Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package encuentro7y8;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        double num1, num2, resultado;
        int menu;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Escriba dos números para realizar operaciones");
        num1=leer.nextDouble();
        num2=leer.nextDouble();
        System.out.println("Escoga que operacion quiere realizar");
        
        do {            
        System.out.println("----------------------MENÚ----------------------");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4Dividir");
        System.out.println("5.Salir");
        menu=leer.nextInt();
            switch (menu) {
                case 1:
                    resultado = sumar(num1,num2);
                    System.out.println("El resultado de la suma es " + resultado );
                    break;
                case 2:
                    resultado = restar(num1,num2);
                    System.out.println("El resultado de la resta es " + resultado );
                    break;
                case 3:
                    resultado = multiplicar(num1,num2);
                    System.out.println("El resultado de la multiplicacion es " + resultado );
                    break;
                case 4:
                    resultado = dividir(num1,num2);
                    System.out.println("El resultado de la division es " + resultado );
                    break;    
            }
  
        } while (menu!=5);
        
    }
    
    public static double sumar(double num1, double num2)
    {
     double suma= num1+num2;
    return suma;    
    }
      public static double restar(double num1, double num2)
    {
     double resta= num1-num2;
    return resta;    
    }
        public static double multiplicar(double num1, double num2)
    {
     double multiplicacion= num1*num2;
    return multiplicacion;    
    }
          public static double dividir(double num1, double num2)
    {
     double division= num1/num2;
    return division;    
    }
}
