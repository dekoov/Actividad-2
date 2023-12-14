/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.actividad.transporte;

public class Auto extends Vehiculo{
    public Auto(String modelo, String marca, int año){
        super(modelo, marca, año);
    }
    
    @Override
    public void conducir(){
        System.out.println("Sube al auto");
        arrancar();
        acelerar();
    }
}
