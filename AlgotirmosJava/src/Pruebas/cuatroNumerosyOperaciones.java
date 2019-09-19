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
public class cuatroNumerosyOperaciones {
    public static void main(String[] args) {
        int primerN=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a multiplicar"));
        int segundoN=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a multiplicar"));
        
        int result=primerN*segundoN;
        
                JOptionPane.showConfirmDialog(null, "El resultado es: "+result);
        
        
    }
}
