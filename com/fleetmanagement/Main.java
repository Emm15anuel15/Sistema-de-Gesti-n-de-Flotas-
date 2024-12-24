package com.fleetmanagement;

import com.fleetmanagement.controllers.FleetController;
import com.fleetmanagement.services.VehicleService;
import com.fleetmanagement.models.Vehicle;
import com.fleetmanagement.views.VehicleView;

public class Main{
    public static void main(String [] args){
        VehicleService vehicleService = new VehicleService();
        FleetController fleetController = new FleetController(vehicleService);

        /*
        De esta manera puedo obtener y visualizar información de un vehículo.
        */

        Vehicle vehicle = fleetController.getVehicleById("12345");
        System.out.println(VehicleView.formatVehicle(vehicle));
    }
}

