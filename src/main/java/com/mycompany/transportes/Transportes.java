/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author raymu
 */
public class Transportes {

     public static void main(String[] args) {
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre ("Volkswagen", "Pinter", 4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha", "Motor");
        VehiculoAereo vehiculoAereo=new VehiculoAereo ("Avion","Airbus 456", 4);
        VehicculoEspacial vehiculoEspacial=new VehicculoEspacial ("Toitory","Nave del Buzz", "El Andy");

        System.out.println("Informacion del vehiculo terrestre: "); vehiculoTerrestre.mostrarInfo();
        System.out.println("Informacion del vehiculo acuatico: "); vehiculoAcuatico.mostrarInfo();
        System.out.println("Informacion del vehiculo aereo: "); vehiculoAereo.mostrarInfo();
        System.out.println("Informacion del vehiculo espacial: "); vehiculoEspacial.mostrarInfo();
    }
}
