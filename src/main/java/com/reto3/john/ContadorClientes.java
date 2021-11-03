/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.john;

/**
 *
 * @author john
 */
class ContadorClientes {

    private Long total;
    private Cliente client;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public ContadorClientes(Long total, Cliente client) {
        this.total = total;
        this.client = client;
    }
    
}
