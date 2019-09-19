/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

/**
 *
 * @author Laboratorio 7
 */
import javax.swing.JOptionPane;

public class mayormenorpromedio {
  public static void main(String[] args) {
        int mayor=0;
        int menor=99;
        double promedio=0;                   
        int suma=0;
        for (int i = 1; i <= 5; i++) {
            int nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota"+i));
            if(nota>mayor){
                mayor=nota;
            }
            if (nota<menor){
                menor=nota;
            }
            suma=suma+nota; //Acumulador
        }
        promedio=suma/5;
       JOptionPane.showConfirmDialog(null,"La nota Mayor es:"+mayor);
       JOptionPane.showConfirmDialog(null,"La nota Menor es:"+menor);
       JOptionPane.showConfirmDialog(null, "La nota Promedio es:"+promedio);
       
    }
    
}


