package org.example.repository;

public interface iRepository <TD,ID>{
    public TD create(TD td);
    public TD read(ID id);
    public TD update(TD t);
    public TD delete(ID id);
}
