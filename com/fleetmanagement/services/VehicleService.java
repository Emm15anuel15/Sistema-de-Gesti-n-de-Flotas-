package com.fleetmanagement.services;

import com.fleetmanagement.interfaces.IVehicleService; 
import com.fleetmanagement.models.Vehicle;

/*
Para tener en cuenta: Que VehicleService implementa IVehicleService, aplicando el ISP (4 Principio)
Y el primer principio de SOLID (SRP): Va a manejar exclusivamente la lógica relacionada con vehículos.
*/

public class VehicleService implements IVehicleService{

    /*
    Acá aplicó el tercer principio de SOLID (LSP): Este método con el tiempo puede ser reemplazado en una
    subclase sin cambiar su comportamiento.
    */

    @Override

    public interface Vehicle findVehicleById(String vehicleId){
        return new Vehicle(vehicleId, "Model X", "ACTIVE");
    }
}