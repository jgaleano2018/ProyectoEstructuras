/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuras;

/**
 *
 * @author Jose Mauricio
 */
public class ListaSimpleNumeros {
    
    private Nodo inicio;
    
    private int tamanio;

    public void ListaSimpleNumeros(){
        inicio = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    /*add new node to the list top*/
    
    public void agregarAlInicio(Object obj){
    
        Nodo nuevo = new Nodo();
        
        nuevo.setValor(obj);
        
        if (esVacia()){
            inicio = nuevo;
        } else {
            
            Nodo aux = inicio;
            
            while(aux.getSiguiente()!= null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
    
    /*add new node after other*/
    
    public void insertarPorReferencia(Object referencia, Object valor){
        
        Nodo nuevo = new Nodo();
        
        nuevo.setValor(valor);
        
        if (!esVacia()){
            
            if (buscar(referencia)) {
                
                Nodo aux = inicio;
                
                while (aux.getValor() != referencia){
                    aux = aux.getSiguiente();
                }
                
                Nodo siguiente = aux.getSiguiente();
                
                aux.setSiguiente(nuevo);
                
                nuevo.setSiguiente(siguiente);
                
                tamanio++;
            }
        }
    }
    
    
    /*it find if exists the value into the list*/
    
    public boolean buscar(Object referencia){
        
        Nodo aux = inicio;
        
        boolean encontrado = false;
        
        while (aux != null && encontrado != true){
            
            if (referencia == aux.getValor()){
                
                encontrado = true;
                
            } else {
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }
    
    public void listar(){
    
        if (!esVacia()){
            
            Nodo aux = inicio;
            
            int i = 0;
            
            while (aux != null){
            
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " -> ");
                
                aux = aux.getSiguiente();
                
                i++;
            }
        }
    }
}
