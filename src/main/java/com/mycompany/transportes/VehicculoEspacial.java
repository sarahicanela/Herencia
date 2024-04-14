/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author raymu
 */
public class VehicculoEspacial extends Vehiculo {
    private String tipoTurbina;

         public VehicculoEspacial(String marca, String modelo, String tipoTurbina){
        super(marca,modelo);
        this.tipoTurbina=tipoTurbina;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de propulcion"+tipoTurbina);
    }
}
