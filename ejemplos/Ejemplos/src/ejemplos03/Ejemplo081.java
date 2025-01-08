/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import static ejemplos03.Ejemplo031.obtenerSuma;
import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int limite;
        int tabla;
        String mensaje = "";
        int numero;
        
                                                         
         System.out.println("Ingresar el limite de la tabla a generar"); 
        limite = entrada.nextInt();
        
        System.out.println("Ingresar la tabla que desea generar"); 
        tabla = entrada.nextInt();
        
         System.out.println(" Ingrese 1 si quiere suma o 2 multiplicacion");
         
         numero= entrada.nextInt();
        switch (numero){
            case 1: 
                mensaje = obtenerTablaSumar(limite,tabla);
                break;
            case 2:
                mensaje = obtenerTablaMultiplicar(limite,tabla);
                break;
        }
        System.out.println(mensaje);
        
        
       
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
    
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
           
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
