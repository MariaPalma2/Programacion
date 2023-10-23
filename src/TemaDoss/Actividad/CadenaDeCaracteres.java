package TemaDoss.Actividad;

import java.util.Scanner;

public class CadenaDeCaracteres {
    //Desarrolla lo que se pide a continuación en un programa Java diferente, usa la plantilla que hay en los recursos. Cada programa estará representado por una clase con un nombre único y válido.
    //
    //a) (Escalera.java) Muestra en consola una escalera con los números del 1 al 5. La escalera se construirá mostrando en consola los números precedidos por un número variable de caracteres. Por ejemplo:
    public static void main(String[] args) {
       // System.out.println("1");
        //System.out.println("\t2");
        //System.out.println("\t\t3");
        //System.out.println("\t\t\t4");
        //System.out.println("\t\t\t\t5");


        //b) (LongitudCadena.java) Pide una cadena de texto por consola, después muestra la longitud de la cadena, quita (si los hay) todos los espacios en blanco antes y al final del texto. Vuelve a mostrar la longitud de la cadena. Muestra también el número de caracteres en blanco que has quitado.
       /* Scanner sc =new Scanner(System.in);
        String frase= sc.nextLine();
        System.out.println(frase.length());
        System.out.println(frase.trim());
        System.out.println(frase.trim().length());
        System.out.println(frase.length()-frase.trim().length());

        */

        //c) (Caracter.java) Pide un número entero por consola (para probar debes introducir un valor entre 0 y 255) y muestra el carácter que le corresponde.
       // Scanner sc= new Scanner(System.in);
        //int numero= sc.nextInt();
        //char caracter= (char) numero;

        //System.out.println("el caracter es " + caracter);




        //d) (NumeroDecimal.java) Pide un número decimal que tenga separador de miles y coma decimal (ejemplo: 1.234,1234) y muestra en qué posición aparece el símbolo separador de miles (.) y el símbolo separador de decimales (,)


        Scanner sc= new Scanner(System.in);
        String numero= sc.next();
        System.out.println(numero.indexOf("."));
        System.out.println(numero.indexOf(","));
    }














}
