/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €

 */
package encuentro7y8;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Definicion de variables
        int bandera;
        double euros, conversion;
        String moneda;
        Scanner leer=new Scanner(System.in);
        
        
        
        do {
            System.out.println("Escriba una cantidad de Euros");
            euros=leer.nextInt();
            System.out.println("Eliga su conversion");
            System.out.println("-----------------------Menu------------------------");
            System.out.println("1.Libras");
            System.out.println("2.Dolares");
            System.out.println("3.Yenes");
            System.out.println("4.Salir");
            bandera=leer.nextInt();
            switch (bandera) {
                case 1:
                    moneda=" Libras"; 
                    libras(euros, moneda);
                    break;
                case 2:
                    moneda=" Dolares"; 
                    dolares(euros, moneda);
                    break;
                case 3:
                    moneda=" Yenes"; 
                    yenes(euros, moneda);
                    break;
                
            }
            
            
            
        } while (bandera!=4);
        
        
    }
    public static void libras (double euros, String moneda)
    {
      double cotizacion=0.86;
        System.out.println(euros+" euros= " +(euros*cotizacion)+moneda);
      
    }
    public static void dolares (double euros, String moneda)
    {
      double cotizacion=1.28611;
        System.out.println(euros+" euros= " +(euros*cotizacion)+moneda);
      
    }
    public static void yenes (double euros, String moneda)
    {
      double cotizacion=129.852;
        System.out.println(euros+" euros= " +(euros*cotizacion)+moneda);
      
    }
}
