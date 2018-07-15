/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Jose Mauricio
 */
public class ProyectoEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaSimpleNumeros lista = new ListaSimpleNumeros();
        
        System.out.println("Ejemplo de lista simple...");
        
        Object obj;
        
        for (int i = 0; i<=10; i++)
        {
            lista.agregarAlInicio(String.valueOf(i));            
            //String.valueOf(i);
        }
        
        lista.listar();
        
        
        ArrayList<Object> arrayList = new ArrayList<Object>();
        
        for (int i = 0; i<=10; i++)
        {
            arrayList.add(i);
        }

        //Se convierte el arraylist a un list y luego se imprime su contenido con iterator:
        List<Object> pruebaList = new ArrayList<Object>();
        pruebaList = arrayList;
        
        Iterator<Object> pruebaListIterator = pruebaList.iterator();
        while (pruebaListIterator.hasNext()){
            System.out.println(pruebaListIterator.next());
        }
                
        for (Object obj2 : pruebaList){
            System.out.println(obj2);
        }
        
    }
     
}
