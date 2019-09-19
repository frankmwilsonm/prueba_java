/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

import java.util.Scanner;

/**
 *
 * @author Laboratorio 7
 */
public class ejercicio41 {
    public static void main(String[] args) {
        String opcionEval="";
        Scanner cs=new Scanner (System.in);
        System.out.println("Selecciona una opción de ejercicio:");
        opcionEval=cs.next();
        switch (opcionEval){
            case "ANG":{ System.out.println("Ingrese el angulo en Grados");
                         int angulo=cs.nextInt();
                         if(angulo==90){System.out.println("Es un angulo rexto");}
                         else{System.out.println("No es un Angulo Recto");}
                         }break;
                         
            case "TEP":{   }break;
            case "TNUM":{   }break;
            case "COMP":{   }break;
            case "DIST":{   }break;
            default:System.out.println("No existe la opción");
           
        }
    }
    
}
