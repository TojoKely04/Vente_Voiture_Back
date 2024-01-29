
package com.projetS5.back.auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.Utilisateur;
import com.projetS5.back.repository.UtilisateurRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
        private final UtilisateurRepository repository;
        private final com.projetS5.back.config.JwtService jwtService;
        private final PasswordEncoder passwordEncoder;
        private final AuthenticationManager authenticationManager;

        public AuthenticationResponse register(RegisterRequest request) {
                var user = Utilisateur.builder()
                                .nom(request.getNom())
                                .prenom(request.getPrenom())
                                .email(request.getEmail())
                                .adresse(request.getAdresse())
                                .passwords(request.getPassords())
                                .passwords(passwordEncoder.encode(request.getPassords()))
                                .contact(request.getContact())
                                .role(request.getRole())
                                .isAdmin(false)
                                .build();
                repository.save(user);
                var jwtToken = jwtService.generateToken(user);
                return AuthenticationResponse.builder()
                                .token(jwtToken)
                                .build();
        }

        public AuthenticationResponse authenticate(AuthenticationRequest request) {
                authenticationManager.authenticate(
                                new UsernamePasswordAuthenticationToken(
                                                request.getEmail(),
                                                request.getPassword()));
                var user = repository.findByEmail(request.getEmail())
                                .orElseThrow();
                var jwtToken = jwtService.generateToken(user);
                return AuthenticationResponse.builder()
                                .token(jwtToken)
                                .build();
        }
}
