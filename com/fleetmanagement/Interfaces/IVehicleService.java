package com.fleetmanagement.interfaces;

import com.fleetmanagement.models.Vehicle;

/*
Aplique el cuarto principio de SOLID, (ISP): Esta parte define una interfaz específica 
para los servicios de vehículos.

Y a la vez lo puse para poder permitir que otras clases implementen métodos según sea necesario
cada vez que se empiece actualizar el código.
*/

public interface IVehicleService{
    Vehicle findVehicleById(String vehicleId);
}