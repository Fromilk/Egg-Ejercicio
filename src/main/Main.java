/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import matematica.Matematica;
import serviciosMatematica.ServiciosMatematica;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        ServiciosMatematica matServ = new ServiciosMatematica();
        Matematica mat1 = matServ.cargarNumeros();
        
        matServ.devolverMayor(mat1);
        matServ.calcularPotencia(mat1);
        matServ.calcularRaiz(mat1);
        
    }
    
  
    
}
