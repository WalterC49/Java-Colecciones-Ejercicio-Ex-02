/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
*/
package ejercicio_ex_02;

import Entidades.CantanteFamoso;
import Servicios.CantanteFamosoServicio;
import java.util.ArrayList;

/**
 *
 * @author Walter
 */
public class Ejercicio_Ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa guarda en una lista 5 cantantes y sus discos con más ventas.");
        ArrayList<CantanteFamoso> CantantesFamosos = new ArrayList();
        String nombre;
        String disco;
        
        for(int i=0;i<5;i++){
            System.out.print("\nIngrese el nommbre del "+(i+1)+"º cantante: ");
            nombre=CantanteFamosoServicio.leer.nextLine();
            System.out.print("Ingrese su disco con más ventas: ");
            disco=CantanteFamosoServicio.leer.nextLine();
            CantantesFamosos.add(new CantanteFamoso(nombre, disco));
        }
        
        CantanteFamosoServicio.MostrarLista(CantantesFamosos);
        System.out.println("-------------------------------------------------");
        int respuesta;
        
        do{
            System.out.println("\nMENÚ:"
                    + "\n1- Agregar un cantante a la lista."
                    + "\n2- Mostrar todos los cantantes."
                    + "\n3_ Eliminar un cantante de la lista."
                    + "\n4- Salir del programa");
            System.out.print("Opción: ");
            respuesta=CantanteFamosoServicio.leer.nextInt();
            CantanteFamosoServicio.leer.nextLine();
            switch(respuesta){
                case 1:
                    CantanteFamosoServicio.AgregarCantante(CantantesFamosos);
                    break;
                case 2:
                    CantanteFamosoServicio.MostrarLista(CantantesFamosos);
                    break;
                case 3:
                    CantanteFamosoServicio.EliminarCantante(CantantesFamosos);
                    break;
                case 4:
                    System.out.println("\nLista final:");
                    CantanteFamosoServicio.MostrarLista(CantantesFamosos);
                    break;
                default:
                    System.out.println("Opción no valida.");
                    
            }
        }while(respuesta!=4);
        
    }
    
}
