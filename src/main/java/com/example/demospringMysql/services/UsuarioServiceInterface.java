package com.example.demospringMysql.services;

import com.example.demospringMysql.models.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioServiceInterface {

    public List<Usuario>listar();
    public Usuario listarId(int id);

    public Usuario save(Usuario user);
    public void deleteById(int id);
    public Usuario update(Usuario user);

}
