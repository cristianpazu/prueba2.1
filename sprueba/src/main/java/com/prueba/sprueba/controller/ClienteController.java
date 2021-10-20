package com.prueba.sprueba.controller;

import com.prueba.sprueba.model.Cliente;
import com.prueba.sprueba.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes") //se indica la raiz del servicio cliente
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/addClientes")
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) throws Exception {
        try {
            return ResponseEntity.ok(clienteService.createCliente(cliente));
        } catch (Exception e) {
            throw new Exception("Se encontro error en el objeto Cliente");
        }
    }

    @GetMapping("/findAllClientes")
    public ResponseEntity<List<Cliente>> findAllClientes(){
        return  ResponseEntity.ok(clienteService.findAllClientes()); //nos retorna un lista de servicios
    }

    @PutMapping("/updateCliente")
    public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.updateCliente(cliente));
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Cliente> findByIdCliente(@PathVariable("id") Long idCliente){
        return ResponseEntity.ok(clienteService.findByIdCliente(idCliente));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long idCliente) throws  Exception{
        Cliente cliente = clienteService.findByIdCliente(idCliente);
        if(null==cliente){
            throw new Exception("El cliente que desea eliminar no existe");
        }
         clienteService.deleteIdCliente(idCliente);
    }


}
