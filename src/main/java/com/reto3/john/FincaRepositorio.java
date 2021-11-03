/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.john;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author john
 */
@Repository
public class FincaRepositorio {
      @Autowired
    private interfaceFinca crud;
    

    public List<Finca> getAll(){
        return (List<Finca>) crud.findAll();       
    }
    
    public Optional <Finca> getFinca(int id){
        return crud.findById(id);
    }
    
    public Finca save(Finca finca){
        return crud.save(finca);
    }
     public void delete(Finca finca){
        crud.delete(finca);
    }
     
}

