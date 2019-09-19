/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Este pdazo de codigo cuenta
 */
package pe.edu.upeu;

import java.util.Scanner;

/**
 *
 * @author Laboratorio 7
 */
public class Tablamultiplicar {
    
   static Scanner cs=new Scanner (System.in);
    
    public static void Tmultiplicar() {
                for (int i = 1; i <=30; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println("\n");
        }
    }
    
    public static void determinarCantidadTipoNumeros (){
        System.err.println("Defina la cantidad de numeros a Ingresar");
        int N=cs.nextInt();
        int initnum=1; 
        int numMenCero=0, numMayCero=0;
        while (initnum<=N) {
            System.out.println("Ingrese el numero de la posici{on"+initnum);
            int numero=cs.nextInt();
            if (numero<=0) {
            numMenCero++;
            }else {numMayCero++;}
            initnum++;
        }
        System.out.println("Cant. de numeros menores o iguales cero"+numMenCero);
        System.out.println("Cant. de Numeros a Cero"+numMayCero);
        
    }
    
    public static void main(String[] args) {
        int opcion=0;
        do{
            switch(opcion){
                case 1:{Tmultiplicar();}break;
                case 2:{determinarCantidadTipoNumeros();}break;
            }
            System.out.println("Selección el algoritmo que desea probar:");
            opcion=cs.nextInt();
        } while (opcion!=0);
    }
}

