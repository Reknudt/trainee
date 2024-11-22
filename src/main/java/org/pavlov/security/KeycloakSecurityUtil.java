package org.pavlov.security;


import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KeycloakSecurityUtil {

    Keycloak keycloak;

    @Value("${server-url-key}")
    private String serverUrl;

    @Value("${realm-key}")
    private String realm;

    @Value("${client-id}")
    private String clientId;

    @Value("${grant-type-key}")
    private String grantType;

    @Value("${name-key}")
    private String username;

    @Value("${password-key}")
    private String password;

    public Keycloak getKeycloakInstance() {
        if(keycloak == null) {
            keycloak = KeycloakBuilder
                    .builder().serverUrl(serverUrl).realm(realm)
                    .clientId(clientId).grantType(grantType)
                    .username(username).password(password).build();
        }
        return keycloak;
    }
}