package org.example.repository;

import org.example.entities.TruckDriver;

import java.util.HashSet;
import java.util.Set;

public class TruckDriverRepository implements iTruckDriverRepository {

    private static TruckDriverRepository repository = null;
    private Set<TruckDriver> logitruckdb = null;

    private TruckDriverRepository()
    {
        logitruckdb = new HashSet<TruckDriver>();
    }

    public static TruckDriverRepository getTruckDriverRepository()
    {
        if(repository == null)
        {
            repository = new TruckDriverRepository();
        }
        return repository;
    }

    @Override
    public TruckDriver create(TruckDriver entity) {
        boolean success = logitruckdb.add(entity);
        if(!success)
        {
            return null;
        }
        return entity;
    }

    @Override
    public TruckDriver read(String driverName) {
        for(TruckDriver td : logitruckdb)
        {
            if(td.getName().equals(driverName))
            {
                return td;
            }

        }
        return null;
    }
    @Override
    public Object delete(String driverID) {

        TruckDriver driverToDelete = read(driverID);

        if(driverToDelete == null)
        {
            return false;
            logitruckdb.remove(driverToDelete);
        }
        return true;
    }

    @Override
    public Set<TruckDriver> getAll() {
        return logitruckdb;
    }


}
