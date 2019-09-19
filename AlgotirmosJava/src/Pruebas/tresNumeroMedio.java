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

import java.io.*;

import java.util.*;

public class tresNumeroMedio {
    public static void main(String[] args) {

        // TODO code application logic here

        InputStreamReader isr=new InputStreamReader (System.in);

        BufferedReader br=new BufferedReader (isr);

 

        Scanner teclado=new Scanner(System.in);

        int numero,val,mayor,menor;

        int media;

        System.out.println("cuantos numeros quiere ingresar: ");

        numero=teclado.nextInt();

        mayor=0;

        menor=1000000000;

        media=0;

        for (int i=1;i<=numero;i++)

        {

            System.out.println("Ingrese cantidad" + i+": ");

            val=teclado.nextInt();

            if (val>mayor)

            {

                mayor=val;

            }

            if (val<menor)

            {

                menor=val;

            }

            media=media+val;

        }

        media=media/numero;


        System.out.println("La media de los valores: "+media);

    }

 

} 