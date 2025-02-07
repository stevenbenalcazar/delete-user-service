package com.example.deleteuserservice.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Desactiva CSRF
            .authorizeHttpRequests(auth -> auth.anyRequest().authenticated()) // Autorización
            .cors(cors -> cors.and()) // Habilita CORS
            .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults())); // Configura JWT correctamente

        return http.build();
    }
}
