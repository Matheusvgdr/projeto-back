package com.projetos.backapploja.service;

import com.projetos.backapploja.model.log.LogUsuarioModel;
import com.projetos.backapploja.repository.RepositoryGenerico;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private final RepositoryGenerico<LogUsuarioModel, Long> logUsuarioRepository;

    LogService(RepositoryGenerico<LogUsuarioModel, Long> logUsuarioRepository){
        this.logUsuarioRepository = logUsuarioRepository;
    }

    public void cadastrarLogUsuario(LogUsuarioModel logUsuarioModel){
        try {
            logUsuarioRepository.save(logUsuarioModel);
        }catch (Exception e){
            e.toString();
        }

    }

}
