package com.dw.cliente.servicesImp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.cliente.entity.Cliente;
import com.dw.cliente.repositories.ClienteRepository;
import com.dw.cliente.services.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> getAllClientes() {
        try{
            return repository.findAll();
        }catch (Exception e) {
            throw new RuntimeException("Error retrieving clients", e);
        }
    }

    @Override
    public Cliente getClienteById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClienteById'");
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCliente'");
    }

    @Override
    public Cliente updateCliente(Integer id, Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCliente'");
    }

    @Override
    public void deleteCliente(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCliente'");
    }
}
