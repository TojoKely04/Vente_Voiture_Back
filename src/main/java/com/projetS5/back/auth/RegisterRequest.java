package com.projetS5.back.auth;

import com.projetS5.back.model.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String passords;
    private int contact;
    private Role role;
}
