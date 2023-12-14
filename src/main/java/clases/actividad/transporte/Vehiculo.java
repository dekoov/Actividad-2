/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.actividad.transporte;

abstract public class Vehiculo {
    public String modelo;
    public String marca;
    public int año;
    private String matricula;

    public Vehiculo(String modelo, String marca, int año) {
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void arrancar(){
        System.out.println("Arrancando");
    }
    public void acelerar(){
        System.out.println("Acelerando");
    }
    abstract void conducir ();
}
