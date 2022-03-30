/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class CantanteFamosoServicio {
    public static Scanner leer = new Scanner(System.in);
    
    public static void MostrarLista(ArrayList<CantanteFamoso> Lista){
        System.out.println("\nCantantes:");
        for (CantanteFamoso i : Lista) {
            System.out.println(i);
        }
    }
    
    public static void AgregarCantante(ArrayList<CantanteFamoso> Lista){
        String nombre;
        String disco;        
        System.out.print("\nIngrese el nommbre del cantante: ");
        nombre=CantanteFamosoServicio.leer.nextLine();
        System.out.print("Ingrese su disco con más ventas: ");
        disco=CantanteFamosoServicio.leer.nextLine();
        Lista.add(new CantanteFamoso(nombre, disco));
    }
    
    public static void EliminarCantante(ArrayList<CantanteFamoso> Lista){
        String buscar;
        System.out.print("\nIngrese el nombre del cantante a eliminar: ");
        buscar=leer.nextLine();
        Iterator<CantanteFamoso> it = Lista.iterator();
        while(it.hasNext()){
            if(it.next().getNombre().equals(buscar)){
                it.remove();
                System.out.println(buscar+" ha sido eliminado de la lista.");
            }
        }
    }
    
}
