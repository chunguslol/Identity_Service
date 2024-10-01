package com.example.demo;


import org.springframework.stereotype.Service;

@Service
public class IdentityService {

    // Aquí iría la lógica para acceder a la base de datos o sistema donde se guarda la información.
    public boolean existsByCI(String ci) {
        // Simulación de verificación
        return "12345678".equals(ci);
    }
}
