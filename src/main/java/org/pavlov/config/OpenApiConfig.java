package org.pavlov.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Bytes Count System Api",
                description = "API системы подсчета байтов в файлах",
                version = "1.0.0",
                contact = @Contact(
                        name = "Pavlov Kirill",
                        email = "kiryl.paulau@softclub.by"
                )
        ),
        servers = {
        @Server(
                description = "Local Environment",
                url = "http://localhost:8081"
        )
},
        security = {
                @SecurityRequirement(
                        name = "Keycloak"
                )
        }
)
@SecurityScheme(
        name = "Keycloak",
        type = SecuritySchemeType.OAUTH2,
        in = SecuritySchemeIn.HEADER,
        description = "Keycloak OAuth2 Authorization Code flow",
        flows = @OAuthFlows(
                authorizationCode = @OAuthFlow(
                        authorizationUrl = "http://localhost:8080/realms/Demo-realm",
                        tokenUrl = "http://localhost:8080/realms/Demo-realm/protocol/openid-connect/token"
                )
        )
)
public class OpenApiConfig {
}