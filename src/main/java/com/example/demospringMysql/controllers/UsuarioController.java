package com.example.demospringMysql.controllers;

import com.example.demospringMysql.models.Usuario;
import com.example.demospringMysql.repository.UsuarioRepository;
import com.example.demospringMysql.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ApiRest")
public class UsuarioController {


    @Autowired
    private UsuarioService service;

    @PostMapping("/crearUsuario")
    public Usuario crearUsuario(Usuario user){
        return service.save(user);
    }

    @GetMapping("/listar")
    public List<Usuario> listar(){
        return service.listar();
    }

    @GetMapping("/id={id}")
    public Usuario listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }

    @GetMapping("/nombre={nombre}")
    public List<Usuario> findByNombre(@PathVariable ("nombre") String nombre){
        return service.findByNombre(nombre);
    }

    @GetMapping("/email={email}")
    public List<Usuario> findByEmail(@PathVariable ("email") String email){
        return service.findByEmail(email);
    }

    @GetMapping("/apellido={apellido}")
    public List<Usuario> findByApellido(@PathVariable ("apellido") String apellido){
        return service.findByApellido(apellido);
    }

    @GetMapping("/telefono={telefono}")
    public List<Usuario> findByTelefono(@PathVariable ("telefono") String telefono){
        return service.findByTelefono(telefono);
    }

    @PutMapping("/actualizarUsuario")
    public Usuario actualizarUsuario(Usuario user){
        return service.save(user);
    }

    @DeleteMapping("/Eliminar/{id}")
    public void deleteById(@PathVariable ("id") int id){
        service.deleteById(id);
    }
}
