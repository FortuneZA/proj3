package org.example.services;

import org.example.entities.TruckDriver;
import org.example.repository.TruckDriverRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class TruckDriverService implements iTruckDriverService{

    private static TruckDriverService service = null;


    @Autowired
    private TruckDriverRepository repository;

    public static TruckDriverService getService()
    {
        if(service == null)
        {
            service = new TruckDriverService();
        }

        return service;
    }




    @Override
    public TruckDriver create(TruckDriver td) {
        return this.repository.create(td);
    }

    @Override
    public TruckDriver read(String driverID ) {
        return this.repository.read(driverID);
    }

    @Override
    public TruckDriver update(TruckDriver td) {
        return this.repository.update(td);
    }

    @Override
    public boolean delete(String driverID) {
        return (boolean) this.repository.delete(driverID);
    }

    @Override
    public Set<TruckDriver> getAll() {
        return this.repository.getAll();
    }

    @Override
    public TruckDriver getDriverDescription(String description) {
        TruckDriver td = null;
        Set<TruckDriver> entities = getAll();

        for(TruckDriver entity : entities)
        {
            if(entity.getName().equals(description))
            {
                td = entity;
                break;
            }
        }
        return td;
    }

}
