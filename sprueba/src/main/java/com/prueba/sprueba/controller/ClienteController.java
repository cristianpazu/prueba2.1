package com.prueba.sprueba.controller;

import com.prueba.sprueba.model.Cliente;
import com.prueba.sprueba.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente") //se indica la raiz del servicio cliente
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> findAll(){
        return  clienteService.findAll();//nos retorna un lista de servicios 
        //dsfsdfsdfsdfsdfsfsdfsfsdfsdfdfdsfsdfs
    }
    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.create(cliente);
    }

    @PutMapping
    public Cliente update(@RequestBody Cliente cliente){
        return clienteService.update(cliente);
    }
    @GetMapping("/{id}")
    public  Cliente findById(@PathVariable("id") Long idCliente){
        return clienteService.findById(idCliente);
    }

    @DeleteMapping("/{id}")

    public void delete(@PathVariable("id") Long idCliente) throws  Exception{
        Cliente cliente = clienteService.findById(idCliente);
        if(cliente== null){
            throw new Exception("El cliente que desea eliminar no existe");
        }
         clienteService.delete(idCliente);
    }


}
