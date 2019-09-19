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

public class unoGastosLima {
    public static void main(String[] FrankWilson) {
        
        int dias=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de dias"));
        
        int hotel=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio diario de hotel"));
        int comida=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio diario de comida"));
        int dinero_diario=100;
        
        int suma_gastos=hotel+comida+dinero_diario;
        
        int precio_total=dias*suma_gastos;    
        JOptionPane.showConfirmDialog(null, "el monto del cheque que se debe proporcionar es: "+precio_total);
    }   
}
