package com.example.demospringMysql.repository;

import com.example.demospringMysql.models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// <> operador diamante
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    public List<Usuario> findAll();

    //delete
    public void deleteById(int id);

    // findById
    public Usuario findById(int id);

    public List <Usuario> findByNombre(String nombre);

    public List <Usuario> findByEmail(String email);

    public List <Usuario> findByApellido(String apellido);

    public List <Usuario> findByTelefono(String telefono);

}


