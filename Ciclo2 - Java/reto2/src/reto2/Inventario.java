/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Inventario {

    ArrayList<Object> inventario;

    public Inventario() {
        inventario = new ArrayList<>();
    }
    
    public void agregarVehiculo(String[] vehiculo){
        if(vehiculo[1].equals("Particular")){
          Particular particular = new Particular(vehiculo[1],vehiculo[2],vehiculo[3],vehiculo[4],vehiculo[5]);
          inventario.add(particular);
        }else if(vehiculo[1].equals("Comercial")){
          Comercial comercial = new Comercial(vehiculo[1],vehiculo[2],vehiculo[3],vehiculo[4],vehiculo[5]);
          inventario.add(comercial);
        }
        
    }
    
    public void listarVehiculos(){
        System.out.println("***Inventario de vehículos***");
        for(Object o:inventario){
            System.out.println(o.toString());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        String[] partesEntrada;
        boolean bandera = true;
        Inventario inventario = new Inventario();
        do {
            entrada = sc.nextLine();
            partesEntrada = entrada.split("&");
            switch (partesEntrada[0]) {
            case "1":
                inventario.agregarVehiculo(partesEntrada);
                break;
            case "2":
                inventario.listarVehiculos();
                break;
            case "3":
                bandera = false;
                break;
        }
        } while (bandera);
    }
    

}
