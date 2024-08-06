package com.example.it_support.Service;


import com.example.it_support.DTO.AuthenticationRequest;
import com.example.it_support.DTO.AuthenticationResponse;
import com.example.it_support.DTO.RegisterRequest;
import com.example.it_support.Enum.Role;
import com.example.it_support.Model.PersonneModel;
import com.example.it_support.Repository.PersonneRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final PersonneRepository personneRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse register(RegisterRequest request) {
        var user = PersonneModel.builder()
                .nom(request.getNom())
                .email(request.getEmail())
                .motdepasse(passwordEncoder.encode(request.getMotdepasse()))
                .role(Role.UTILISATEUR)
                .build();
        personneRepository.save(user);

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }


    public AuthenticationResponse registerAdmin(RegisterRequest request){

        var user = PersonneModel.builder()
                .nom(request.getNom())
                .email(request.getEmail())
                .motdepasse(passwordEncoder.encode(request.getMotdepasse()))
                .role(Role.ADMIN)
                .build();
        personneRepository.save(user);

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();

    }

    public AuthenticationResponse registerTechnicien(RegisterRequest request){

        var user = PersonneModel.builder()
                .nom(request.getNom())
                .email(request.getEmail())
                .motdepasse(passwordEncoder.encode(request.getMotdepasse()))
                .role(Role.TECHNICIEN)
                .build();
        personneRepository.save(user);

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getMotdepasse()
                )
        );

        var user = personneRepository.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

}
