package com.fleetmanagement.views;

import com.fleetmanagement.models.Vechicle;

/*
De nuevo aplico el primer principio (SRP): VehicleView lo puse para que únicamente se centre
en la representación de datos para la interfaz esto para poderlo modificar más facil en un futuro
y tener todo listo para poder hacer pruebas básicas.
*/

public class VehicleView{

    /*
    Acá quiero aclarar que puse este código para que me ayude a la reutilización a la hora de formatear
    datos para la interfaz.
    */

    public static String formatVehicle(Vehicle vehicle){
        return String.format("ID: %s, Modelo: %s, Estado: %s",
        vehicle.getId(), vehicle.getModel(), vehicle.getStatus());
    }
}