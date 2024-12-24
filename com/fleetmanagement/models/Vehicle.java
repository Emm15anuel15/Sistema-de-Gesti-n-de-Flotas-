package com.fleetmanagement.models;

/*
Acá cree la clase Vehicle la cuál representa el modelo de los datos
principales de un vehículo.
(Primer Principio (SRP)): Se definieron únicamente las propiedades
de un vehículo
*/

public class Vehicle{
    private String Id;
    private String model;
    private String status;

    public Vechicle(String id, String model, String status){
        this.id = id;
        this.model = model;
        this.status = status;
    }

    // Getters y Setters

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}