/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.boxes.operaciones;

import java.util.LinkedList;
import javax.swing.JCheckBox;

/**
 *
 * @author pedro
 */
public class OperacionesCheckBox {
    
    public LinkedList <String> obtenerCursosLenguajes(LinkedList<JCheckBox> lista){
        //Esto es para leer los datos de los checkboxes
        LinkedList <String> listaLenguajes = new LinkedList();
        for(int i=0;i<lista.size();i++){
            JCheckBox aux = lista.get(i);
            if(aux.isSelected()){
                listaLenguajes.add(aux.getText());
            }
        }
        
        System.out.println("Quieres " + listaLenguajes.size() + " cursos");
        
        for(int i=0;i<listaLenguajes.size();i++){
            System.out.println(listaLenguajes.get(i));
        }
       
        return listaLenguajes;
    }
    
}
