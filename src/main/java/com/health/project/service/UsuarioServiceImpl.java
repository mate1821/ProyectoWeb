package com.health.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.project.entitys.Usuario;
import com.health.project.errors.UsuarioDuplicado;
import com.health.project.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository repo;

    @Override
    public List<Usuario> buscarTodos(){
        return repo.findAll();
    }
    @Override
    public Usuario buscarPorId(Long id){
        return repo.findById(id).orElse(null);
    }
    @Override
    public void guardar(Usuario usuario){
        if (usuario.getId() == null && repo.existsByCedulaAndRol(usuario.getCedula(), usuario.getRol())) {
        throw new UsuarioDuplicado(usuario.getCedula(), usuario.getRol());
    }
        repo.save(usuario);
    }

    @Override 
    public Long consultarId (Usuario usuario) {
        return usuario.getId();
    }

    @Override
    public void desactivar(Long id){
        Usuario usuario = buscarPorId(id);
        if (usuario!=null){
            usuario.setActivo(false);
            repo.save(usuario);
        }
    }
    @Override
    public void activar(Long id){
        Usuario usuario = buscarPorId(id);
        if (usuario!=null){
            usuario.setActivo(true);
            repo.save(usuario);
        }
    }

    public Long pacientesTerceraEdad() {
        return repo.pacientesTerceraEdad();
    }

    
}
