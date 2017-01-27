/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.t01p2;
//Agregar libreria, import
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Paso 1. Declaración de variables.
        double base, altu, per, sup; //per = Perimetro , sup=Superficie , base=base, altu=altura
        Scanner T = new Scanner (System.in);
        
        //Paso 2. Pedir datos.
        System.out.println("Ingresa la base");
        base = T.nextDouble();
        System.out.println("Ingresa la altura");
        altu = T.nextDouble();
        
        //Paso 3. Operaciones
        sup = base * altu;
        per = base + base + altu +altu;
        
        //Paso 4. Mostrar el resultado.
        System.out.println("La superficie es:" + sup);
        System.out.println("El perímetro es:" + per);
        
                
    }
    
}
