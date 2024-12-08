package com.projetos.backapploja.service;

import com.projetos.backapploja.model.UsuarioModel;
import com.projetos.backapploja.repository.UsuarioEmpresaRepository;
import com.projetos.backapploja.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioEmpresaRepository usuarioEmpresaRepository;

    UsuarioService(UsuarioRepository usuarioRepository, UsuarioEmpresaRepository usuarioEmpresaRepository) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioEmpresaRepository = usuarioEmpresaRepository;
    }

    public void buscarUsuarios(){
        long test = 1;

        var po = this.usuarioEmpresaRepository.findByNuUsuario(test);
        var re = "";
    }
}
