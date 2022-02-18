package com.example.demospringMysql.services;

import com.example.demospringMysql.models.Usuario;
import com.example.demospringMysql.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements UsuarioServiceInterface{

    @Autowired
    private UsuarioRepository data;

    @Override
    public List<Usuario> listar() {
        return data.findAll();
    }

    @Override
    public Usuario listarId(int id) {
        return data.findById(id);
    }

    @Override
    public Usuario save(Usuario user) {
        return data.save(user);
    }

    @Override
    public void deleteById(int id) {
        data.deleteById(id);
    }

    @Override
    public Usuario update(Usuario user){
        return data.save(user);
    }

    public List<Usuario> findByNombre(String nombre) {
        return data.findByNombre(nombre);
    }

    public List<Usuario> findByApellido(String apellido) {
        return data.findByApellido(apellido);
    }

    public List<Usuario> findByTelefono(String telefono) {
        return data.findByTelefono(telefono);
    }

    public List<Usuario> findByEmail(String email) {
        return data.findByEmail(email);
    }

}
