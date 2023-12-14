/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clases.actividad.transporte;

public class Transporte {

    public static void main(String[] args) {
       Moto moto1 = new Moto ("CRB", "Honda", 2010);
       Auto auto1 = new Auto ("Corolla","Toyota",2020);
       
       auto1.setMatricula("ABC123");
       String matriculaAuto = auto1.getMatricula();
       System.out.println("Matricula del auto: " + matriculaAuto);
        
       moto1.setMatricula("XYZ321");
       String matriculaMoto = moto1.getMatricula();
       System.out.println("Matricula de moto: " + matriculaMoto);
       
       moto1.conducir();
       auto1.conducir();
    }
}
