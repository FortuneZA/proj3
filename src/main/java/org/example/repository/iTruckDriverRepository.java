package org.example.repository;

import org.example.entities.TruckDriver;

import java.util.Set;

public interface iTruckDriverRepository extends iRepository{

    public Set<TruckDriver> getAll();

}
