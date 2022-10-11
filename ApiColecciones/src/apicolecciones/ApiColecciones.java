
package apicolecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

/**
 *
 * @author jonat
 */
public class ApiColecciones {

    
    public static void main(String[] args) {
        //List sigue un orden y podemos usar .get() como iterador
        ArrayList<String> colecList = new ArrayList<String>();
        colecList.add("Lunes");
        colecList.add("Martes");
        colecList.add("Miercoles");
        colecList.add("Jueves");
        colecList.add("Viernes");
        colecList.add("Sabado");
        colecList.add("Domingo");
        
        //Clave int y valor String en los map
        HashMap<Integer,String> alum = new HashMap<>();
        alum.put(1, "Nacho");
        alum.put(2, "Jonathan");
        alum.put(3, "Fernando");
        //no sigue ningun orden 
        
        HashSet<String> colecSet = new HashSet<>();
        colecSet.add("Lunes");
        colecSet.add("Martes");
        colecSet.add("Miercoles");
        colecSet.add("Jueves");
        colecSet.add("Viernes");
        colecSet.add("Sabado");
        colecSet.add("Domingo");
        
        //visualizar con un for
        System.out.println("Se visualiza con un For");
        for(int i=0; i<colecList.size(); i++){
            System.out.print(colecList.get(i) + ", ");
        }
        
        //Visualizar a lo bruto el arraylist
        System.out.println("\n\nSe visualiza directamente con un Sout");
        System.out.println("Dias de la semana: " + colecList);
        
        //Visualiza con ForEach
        System.out.println("\nSe visualiza con ForEach");
        for(String i : colecList) {
            System.out.print(i + ", ");
        }
        
        //Visualiza con Iterator
        System.out.println("\n\nSe visualiza con Iterator:");
        Iterator<String> itr = colecList.iterator();
        while (itr.hasNext()){
            String var = itr.next();
            System.out.print(var + ", ");
        }
        
        //------------------------------------------------------------------------------------------------------------
        System.out.println("\n\nSe imprime un HashSet con una funcion");
        imprimir(colecSet);
        
        //Se muestra el Map con un forEach
        System.out.println("\n\nVisualizar el Map con forEach con sus claves y valores respectivamente");
        for(Integer clave: alum.keySet()){
            String valor = alum.get(clave);
            System.out.println("Clave: " + clave + " Valor: " + valor);
        }
    }
    
    public static void imprimir(Collection c){
        c.forEach(elem -> {
            System.out.print(elem + ", ");
        });
    }
            
    
}
