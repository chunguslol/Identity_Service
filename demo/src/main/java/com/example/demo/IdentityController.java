package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/identity")
public class IdentityController {

    private final IdentityService identityService;

    public IdentityController(IdentityService identityService) {
        this.identityService = identityService;
    }

    @GetMapping("/verify/{ci}")
    public String verifyCI(@PathVariable String ci) {
        boolean exists = identityService.existsByCI(ci);
        return exists ? "El CI existe." : "El CI no existe.";
    }
}
