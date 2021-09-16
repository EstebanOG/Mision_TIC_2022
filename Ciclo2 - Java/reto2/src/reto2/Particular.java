/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author Usuario
 */
public class Particular extends Vehiculo{
    private String color;
    public Particular(String tipoVehiculo,String numeroPasajeros,String velocidadMaxima,String placa,String color) {
        this.tipoVehiculo = tipoVehiculo;
        this.numeroPasajeros = numeroPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.placa = placa;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(String numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Override
    public String toString() {
        return "        Vehículo "+getTipoVehiculo()+" - Placa: "+getPlaca()+"\n"
              +"        velocidad: "+getVelocidadMaxima()+" km/h\n"
              +"        pasajeros: "+getNumeroPasajeros()+"\n"
              +"        color: "+getColor();
    }
    
}
