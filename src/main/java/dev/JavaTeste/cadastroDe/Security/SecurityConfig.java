package dev.JavaTeste.cadastroDe.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desativa a proteção CSRF (útil para APIs REST)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/users/**").permitAll() // Permite acesso público às rotas dos usuários
                        .anyRequest().authenticated() // Qualquer outra rota requer autenticação
                );


        return http.build();
    }
}
