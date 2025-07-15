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
      try{
            return repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Client not found with id: " + id));
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving client with id: " + id, e);
      }
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        try {
            return repository.save(cliente);
        } catch (Exception e) {
            throw new RuntimeException("Error creating client", e);
        }
    }

    @Override
    public Cliente updateCliente(Integer id, Cliente cliente) {
        try {
            if (!repository.existsById(id)) {
                throw new RuntimeException("Client not found with id: " + id);
            }
            cliente.setId(id);
            return repository.save(cliente);
        } catch (Exception e) {
            throw new RuntimeException("Error updating client with id: " + id, e);
        }
    }

    @Override
    public void deleteCliente(Integer id) {
        try {
            if (!repository.existsById(id)) {
                throw new RuntimeException("Client not found with id: " + id);
            }
            repository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting client with id: " + id, e);
        }
    }
}
