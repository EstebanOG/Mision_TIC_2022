/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Lamina {

    /**
     * Dada una lista de los tipos de todas las láminas (en la posición i-ésima 
     * de la lista está el tipo de dicha lámina), genera una lista con los tipos
     * de láminas sin repetición.
     */
    public ArrayList<Integer> clases(ArrayList<Integer> laminas){
        ArrayList<Integer> tiposLaminas = new ArrayList();
        for(Integer tipo:laminas){
            if(!tiposLaminas.contains(tipo)){
                tiposLaminas.add(tipo);
            }
        }
        return tiposLaminas;
    }
    
    public ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> laminasFaltantes
    ,ArrayList<Integer> clasesLamina, Integer claseLamina){
        ArrayList<Integer> posicionesLaminas = new ArrayList();
        for(Integer lamina:laminasFaltantes){
            if(clasesLamina.get(lamina) == claseLamina){
                posicionesLaminas.add(lamina);
            }
        }
        return posicionesLaminas;
    }
    
    public ArrayList<Integer> noTengo(ArrayList<Integer> laminasOtraPersona,
        ArrayList<Integer> laminasPropias){
        ArrayList<Integer> laminasNoTengo = new ArrayList();
        for(Integer lamina: laminasOtraPersona){
            if(!laminasPropias.contains(lamina)){
                laminasNoTengo.add(lamina);
            }
        }
        return laminasNoTengo;
    }
    
    public Integer puedoCambiar(ArrayList<Integer> laminasOtraPersona,
        ArrayList<Integer> laminasPropias){
        Integer laminasACambiar1 = 0;
        Integer laminasACambiar2 = 0;
        
        for(Integer lamina: laminasOtraPersona){
            if(!laminasPropias.contains(lamina)){
                laminasACambiar1 += 1;
            }
        }
        
        for(Integer lamina:laminasPropias){
            if(!laminasOtraPersona.contains(lamina)){
                laminasACambiar2 += 1;
            }
        }
        
        if(laminasACambiar1 < laminasACambiar2){
            return laminasACambiar1;    
        }else{
            return laminasACambiar2;
        }
          
    }
    public static void main(String[] args) {
        Lamina reto3 = new Lamina();
        /*ArrayList<Integer> tiposLaminas = new ArrayList(){{
            add(1);
            add(2);
            add(5);
            add(5);
            add(5);
            add(1);
            add(2);
            add(5);
            add(5);
            add(5);
        }};
        System.out.println(reto3.clases(tiposLaminas));
        
        ArrayList<Integer> ej1 = new ArrayList(){{
            add(1);
            add(3);
            add(6);
            add(8);
        }};
        ArrayList<Integer> ej2 = new ArrayList(){{
            add(1);
            add(2);
            add(5);
            add(5);
            add(5);
            add(1);
            add(2);
            add(5);
            add(5);
            add(5);
        }};
        System.out.println(reto3.meFaltanDeLaclase(ej1, ej2, 5));
        
        ArrayList<Integer> ej1 = new ArrayList(){{
            add(3);
            add(5);
            add(7);
            add(10);
            add(15);
            add(16);
        }};
        ArrayList<Integer> ej2 = new ArrayList(){{
            add(4);
            add(10);
            add(5);
            add(8);
        }};
        System.out.println(reto3.noTengo(ej1, ej2));
        */
        ArrayList<Integer> ej1 = new ArrayList(){{
            add(3);
            add(5);
            add(7);
            add(10);
            add(15);
            add(16);
        }};
        ArrayList<Integer> ej2 = new ArrayList(){{
            add(4);
            add(10);
            add(5);
            add(8);
        }};
        System.out.println(reto3.puedoCambiar(ej1, ej2));
    }
    
}
