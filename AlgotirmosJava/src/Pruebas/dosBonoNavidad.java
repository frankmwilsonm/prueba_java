/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author Laboratorio 7
 */
import javax.swing.JOptionPane;
public class dosBonoNavidad {
    public static void main(String[] args) {
        int antiguedad=Integer.parseInt(JOptionPane.showInputDialog("Antiguedad de años del empleado:"));
        int sueldo=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de su sueldo:"));
        
        int bono=0;
        double aumento=0;
        
        if (antiguedad > 4){
            aumento=sueldo*25/100;
            JOptionPane.showConfirmDialog(null, "sueldo mas bono extra de 25% es: "+aumento);  
        }
        
        else {
            
            if (sueldo<2000){
            aumento=sueldo*25/100;
            JOptionPane.showConfirmDialog(null, "sueldo mas bono extra de 25% es: "+aumento);
         }
            
            else {
            aumento=sueldo*20/100;
            JOptionPane.showConfirmDialog(null, "sueldo mas bono extra de 20% es: "+aumento);
            }
    }
        
    }
}
