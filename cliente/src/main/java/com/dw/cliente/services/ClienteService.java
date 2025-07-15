package com.dw.cliente.services;

import java.util.List;

import com.dw.cliente.entity.Cliente;


public interface ClienteService {

    List<Cliente> getAllClientes();
    Cliente getClienteById(Integer id);
    Cliente createCliente(Cliente cliente);
    Cliente updateCliente(Integer id, Cliente cliente);
    void deleteCliente(Integer id);
}
