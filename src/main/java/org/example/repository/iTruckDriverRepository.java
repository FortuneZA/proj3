package org.example.repository;

import org.example.entities.TruckDriver;

import java.util.Set;

public interface iTruckDriverRepository extends IRepository{

    public Set<TruckDriver> getAll();

}
