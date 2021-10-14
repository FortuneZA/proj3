package org.example.services;

import org.example.entities.TruckDriver;

import java.util.Set;

public interface iTruckDriverService extends iService<TruckDriver,String> {

    public Set<TruckDriver> getAll();

    public TruckDriver getDriverDescription(String description);
}
