/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_caluclos;
import java.util.*;

public class Calculadora {
   

    public static double Circunfernecia(int radio){
        int diametro = radio*2;
        double circunferencia = diametro*3.14;
        return circunferencia;
    }

    public static void menu(int opcion){
        Scanner entrada = new Scanner(System.in);
        switch (opcion){
            case 1:
            System.out.println("Calculo Circunfernecia, dime el radio: ");
            int radio = entrada.nextInt();
            double circu = Calculadora.Circunfernecia(radio);
            System.out.println("La circunferencia que sale con el radio " + radio + " Es " + circu);
            entrada.close();
            case 2:
            
        
        
        }
        
    }
}