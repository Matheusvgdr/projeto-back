package com.projetos.backapploja.controller;

import com.projetos.backapploja.model.UsuarioModel;
import com.projetos.backapploja.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    public UsuarioService usuarioService;

    UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Operation(
            summary = "Busca um usuário pelo ID",
            description = "Retorna os detalhes de um usuário baseado no ID fornecido.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Usuário encontrado", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UsuarioModel.class))),
                    @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
            }
    )
    @GetMapping("/teste")
    public UsuarioModel teste() {
        this.usuarioService.buscarUsuarios();

        return new UsuarioModel();
    }

}
