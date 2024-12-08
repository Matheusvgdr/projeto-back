package com.projetos.backapploja.service;

import com.projetos.backapploja.repository.UsuarioEmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioEmpresaService {

    private final UsuarioEmpresaRepository usuarioEmpresaRepository;

    UsuarioEmpresaService(UsuarioEmpresaRepository usuarioEmpresaRepository) {
        this.usuarioEmpresaRepository = usuarioEmpresaRepository;
    }

    public void testar(){

    }
}
