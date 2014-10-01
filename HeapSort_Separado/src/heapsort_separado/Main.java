/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsortseparado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author matychp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int unaCantidad = in.nextInt();
        Arreglo unArreglo = new Arreglo(unaCantidad);
        unArreglo.cargar();
        System.out.println("Arreglo creado: " + unArreglo.toString());
        unArreglo.ordenar(true);
        System.out.println("Arreglo ordenado: " + unArreglo.toString());
    }
    
}
