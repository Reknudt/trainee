package org.pavlov.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@AllArgsConstructor
@Setter
@Getter
@ConfigurationProperties(prefix = "keycloak")
public class KeycloakProperties {

    String authServerUrl = "http://localhost:8081";

    String realm = "Demo-realm";

    @ConstructorBinding
    KeycloakProperties() {
        this.authServerUrl = "http://localhost:8081";
        this.realm = "Demo-realm";
    }
}