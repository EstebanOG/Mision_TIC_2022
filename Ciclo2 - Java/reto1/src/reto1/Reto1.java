/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {
        int edadSofi = 0,
            edadMigue = 0,
            edadSebas = 0;
        
        String etapa = "";
        
        Scanner sc = new Scanner(System.in);
        edadMigue = sc.nextInt();
        edadSofi = (2 * edadMigue) + 4;
        edadSebas = (edadSofi + edadMigue)/5;
        
        if(edadSebas >= 0 && edadSebas <= 20){
            etapa = "uno";
        }else if(edadSebas >= 21 && edadSebas <= 30){
            etapa = "dos";
        }else if(edadSebas >= 31 && edadSebas <= 50){
            etapa = "tres";
        }else if(edadSebas > 50){
            etapa = "cuatro";
        }
        
        System.out.println(edadMigue+" "+edadSofi+" "+edadSebas);
        System.out.println(etapa);
    }
    
}
