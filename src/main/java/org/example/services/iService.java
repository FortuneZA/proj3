package org.example.services;

public interface iService <TD,ID>{

    public TD create(TD t);
    public TD read(ID id);
    public TD update(TD t);
    public TD delete(ID id);


}
