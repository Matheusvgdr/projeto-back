package com.projetos.backapploja.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoSwagger {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Exemplo")
                        .version("1.0.0")
                        .version("1.0.0")
                        .description("Documentação da API de Exemplo usando Springdoc OpenAPI."));
    }

}
