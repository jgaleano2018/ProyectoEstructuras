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
public class ArrayList {
    
    public static final int incremento = 10;
    public static final int redimensionamiento = 10;
    public ArrayList arrayEstructura = new ArrayList();
    
    public static int getIncremento() {
        return incremento;
    }

    public static int getRedimensionamiento() {
        return redimensionamiento;
    }
    
    public ArrayList getArrayEstructura() {
        return arrayEstructura;
    }

    public void setArrayEstructura(ArrayList arrayEstructura) {
        this.arrayEstructura = arrayEstructura;
    }
    
    public void add(ArrayList arraySource, Object obj){
        
        //arraySource.add(obj);
        
        this.setArrayEstructura(arraySource);
    }

}
