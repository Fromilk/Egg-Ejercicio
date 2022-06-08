/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosMatematica;

import java.util.Scanner;
import matematica.Matematica;

/**
 *
 * @author usuario
 */
public class ServiciosMatematica {
    
    /*
     se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set.
    */
    Scanner leer = new Scanner (System.in);
    
    public Matematica cargarNumeros(){
        Matematica matNueva = new Matematica();
        matNueva.setNum1(Math.random()*100);
        matNueva.setNum2(Math.random()*100);
        return matNueva;
    }
    
    /*• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor*/
    
    public void devolverMayor(Matematica mat1){
        System.out.println("El numero maximo es:" + Math.max(mat1.getNum1(), mat1.getNum2()));
    }
    
    /*
    • Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
    */
    
    public void calcularPotencia(Matematica mat1){
     
        mat1.setNum1(Math.round(mat1.getNum1())); //esta bien este redondeo?? es un long, que onda
        mat1.setNum2(Math.round(mat1.getNum2()));
        double potencia = Math.pow(Math.max(mat1.getNum1(), mat1.getNum2()), Math.min(mat1.getNum1(), mat1.getNum2())); //uso el metodo pow para hacer la potencia y max y min dentro de ese metodo, todo correspondiente a la clase Math
        System.out.println("El redondeo del mayor valor es: "+Math.max(mat1.getNum1(), mat1.getNum2())+" elevado al menor: "+Math.min(mat1.getNum1(), mat1.getNum2()));
        System.out.println("Lo que da un resultado de: "+ potencia);  
    }
    
    /*
    • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    
    public void calcularRaiz(Matematica mat1){
        double minimo = Math.min(mat1.getNum1(),mat1.getNum2());
        double minimoAbs = Math.abs(minimo);
        System.out.println("La raiz cuadrada del menor valor es: "+Math.sqrt(minimoAbs));
    }
    
}
