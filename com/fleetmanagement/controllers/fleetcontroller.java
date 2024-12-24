package com.fleetmanagement.controllers;

import com.fleetmanagement.models.Vehicle;
import com.fleetmanagement.services.vehicleService;


/*
La clase FleetController es la que principalmente maneja el primer principio de SOLID
(SRP) esta va estar coordinando las solicitudes que le llegan relacionadas con los vehículos.
*/

public class FleetController{
    private final VehicleService vehicleService;

    /*
     Acá utlice el último principio (DIP): El controlador espera obtener los datos de
     VehicleService para poder recolectarlos, no de una implementación concreta.
    */

    public FleetController(VehicleService vehicleService){
        this.vehicleService = vehicleService();
    }

    /*
    En este punto aplique el segundo principio (OCP): En el futuro podemos generar modificaciones
    código sin tener que dañar su lógica de base.
    */

    public Vehicle getVehicleById(String vehicleId){
        return vehicleService.findVehicleById(vehicleId);
    }
}