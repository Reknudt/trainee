package org.pavlov.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Bytes Count System Api",
                description = "API системы подсчета байтов в файлах",
                version = "1.0.0",
                contact = @Contact(
                        name = "Pavlov Kirill",
                        email = "kiryl.paulau@softclub.by"
                )
        )
)
public class OpenApiConfig {

}